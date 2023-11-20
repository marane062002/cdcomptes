package com.example.cdccomptes.Services;

import com.example.cdccomptes.Model.DonateurEntity;
import com.example.cdccomptes.dto.RequestDon;
import com.example.cdccomptes.dto.ResponseDon;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

public interface DonserviceInterface {
    List<DonateurEntity> GetAll();
    Optional<DonateurEntity> GetById(Long Id);
    void DeleteById (Long Id);
    ResponseDon saveDonateur(RequestDon requestDon, MultipartFile cin, MultipartFile demande_access);
    ResponseDon UpdateDon(RequestDon requestDon,MultipartFile demande_access, MultipartFile cin ,Long Id);
}
