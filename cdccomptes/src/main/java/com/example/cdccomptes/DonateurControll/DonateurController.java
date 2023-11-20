package com.example.cdccomptes.DonateurControll;

import com.example.cdccomptes.Model.DonateurEntity;
import com.example.cdccomptes.Services.DonserviceInterface;
import com.example.cdccomptes.dto.RequestDon;
import com.example.cdccomptes.dto.ResponseDon;
import jakarta.persistence.Id;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/")
public class DonateurController {
    private final DonserviceInterface donserviceInterface;

    public DonateurController(DonserviceInterface donserviceInterface) {
        this.donserviceInterface = donserviceInterface;
    }
    @GetMapping
    List<DonateurEntity> GetAllDon(){
       return donserviceInterface.GetAll();
    };
    @GetMapping("/{Id}")
    Optional<DonateurEntity> GetDonById(@PathVariable("Id") Long Id){
        return donserviceInterface.GetById(Id);
    };
    @DeleteMapping("/{Id}")
    void DeleteById (@PathVariable("Id") Long Id){
       donserviceInterface.DeleteById(Id);
    };
    @PostMapping(consumes = "multipart/form-data")
    ResponseDon saveDonateur(@RequestPart(name = "spj") RequestDon requestDon,
                             @RequestPart(name = "cin" , required = false) MultipartFile cin,
                             @RequestPart(name = "demande_access" , required = false) MultipartFile demande_access){
            return donserviceInterface.saveDonateur(requestDon,cin,demande_access);
    };
    @PutMapping("/{Id}")
    ResponseDon UpdateDon(@RequestPart(name = "spj") RequestDon requestDon,
                          @RequestPart(name = "cin")  MultipartFile cin,
                          @RequestPart(name = "demande_access") MultipartFile demande_access,
                          @PathVariable("Id") Long Id){
          return donserviceInterface.UpdateDon(requestDon,cin,demande_access,Id);
    };
}
