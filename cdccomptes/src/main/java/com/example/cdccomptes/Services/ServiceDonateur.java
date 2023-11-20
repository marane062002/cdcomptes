package com.example.cdccomptes.Services;

import com.example.cdccomptes.Model.DonateurEntity;
import com.example.cdccomptes.Repository.DonateurRepository;
import com.example.cdccomptes.dto.DonMapper;
import com.example.cdccomptes.dto.RequestDon;
import com.example.cdccomptes.dto.ResponseDon;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceDonateur implements DonserviceInterface {
    @Value("C:/Users/user/Desktop/upload")
    private String uploadDir;
    private DonateurRepository donateurRepository;

    public ServiceDonateur(DonateurRepository donateurRepository) {
        this.donateurRepository = donateurRepository;
    }

    @Override
    public List<DonateurEntity> GetAll() {
        return donateurRepository.findAll();
    }

    @Override
    public Optional<DonateurEntity> GetById(Long Id) {
        return donateurRepository.findById(Id);
    }

    @Override
    public void DeleteById(Long Id) {
        donateurRepository.deleteById(Id);
    }

    @Override
    public ResponseDon saveDonateur(RequestDon requestDon,
                                    MultipartFile cin,
                                    MultipartFile demande_access) {
        if (cin != null && !cin.isEmpty() && demande_access != null && !demande_access.isEmpty()) {
            String fileNamecin = System.currentTimeMillis() + "_" + cin.getOriginalFilename();
            String fileNameDemande = System.currentTimeMillis() + "_" + demande_access.getOriginalFilename();
            Path cinPath = Paths.get(uploadDir, fileNamecin);
            Path demnadePath = Paths.get(uploadDir, fileNameDemande);

        try {
            Files.write(cinPath, cin.getBytes());

        } catch (IOException e) {
            throw new RuntimeException("Failed to store file: " + fileNamecin, e);
        }

        try{
            Files.write(demnadePath, demande_access.getBytes());
        } catch (IOException e){
            throw new RuntimeException("Failed to store file: " + fileNameDemande, e);
        }
            requestDon.setCin_url("C:/Users/user/Desktop/upload" + fileNamecin);
            requestDon.setDemende_access_url("C:/Users/user/Desktop/upload" + fileNameDemande);
        }

        DonateurEntity donateurEntity = DonMapper.MAPPER.RequestToEntity(requestDon);
        donateurRepository.save(donateurEntity);
        return DonMapper.MAPPER.EntityToResponse(donateurEntity);
    }

    @Override
    public ResponseDon UpdateDon(RequestDon requestDon,
                                 MultipartFile cin,
                                 MultipartFile demande_access,
                                 Long Id) {
        Optional<DonateurEntity> DonExists = GetById(Id);
        if (! DonExists.isPresent()) {
            throw new RuntimeException("Donateur with dthis id Exists");
        };

        DonateurEntity donateurEntity = DonMapper.MAPPER.RequestToEntity(requestDon);
        donateurEntity.setId(Id);
        if (cin != null && !cin.isEmpty() && demande_access != null && !demande_access.isEmpty()) {
            String fileNamecin = System.currentTimeMillis() + "_" + cin.getOriginalFilename();
            String fileNameDemande = System.currentTimeMillis() + "_" + demande_access.getOriginalFilename();
            Path cinPath = Paths.get(uploadDir, fileNamecin);
            Path demnadePath = Paths.get(uploadDir, fileNameDemande);
            donateurEntity.setCin_url("C:/Users/user/Desktop/upload" + fileNamecin);
            donateurEntity.setDemende_access_url("C:/Users/user/Desktop/upload" + fileNameDemande);
        }
        donateurRepository.save(donateurEntity);
        return DonMapper.MAPPER.EntityToResponse(donateurEntity);
    }
};
