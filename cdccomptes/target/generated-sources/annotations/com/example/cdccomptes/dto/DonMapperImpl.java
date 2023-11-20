package com.example.cdccomptes.dto;

import com.example.cdccomptes.Model.DonateurEntity;
import java.util.Arrays;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-20T13:09:21+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 21 (Oracle Corporation)"
)
public class DonMapperImpl implements DonMapper {

    @Override
    public DonateurEntity RequestToEntity(RequestDon requestDon) {
        if ( requestDon == null ) {
            return null;
        }

        DonateurEntity donateurEntity = new DonateurEntity();

        donateurEntity.setNom_ar( requestDon.getNom_ar() );
        donateurEntity.setNom_fr( requestDon.getNom_fr() );
        donateurEntity.setPrenom_ar( requestDon.getPrenom_ar() );
        donateurEntity.setPrenom_fr( requestDon.getPrenom_fr() );
        donateurEntity.setCharacter( requestDon.getCharacter() );
        donateurEntity.setCine( requestDon.getCine() );
        donateurEntity.setEmail( requestDon.getEmail() );
        donateurEntity.setTelephone( requestDon.getTelephone() );
        byte[] demande_access = requestDon.getDemande_access();
        if ( demande_access != null ) {
            donateurEntity.setDemande_access( Arrays.copyOf( demande_access, demande_access.length ) );
        }
        donateurEntity.setDemende_access_url( requestDon.getDemende_access_url() );
        byte[] cin = requestDon.getCin();
        if ( cin != null ) {
            donateurEntity.setCin( Arrays.copyOf( cin, cin.length ) );
        }
        donateurEntity.setCin_url( requestDon.getCin_url() );

        return donateurEntity;
    }

    @Override
    public ResponseDon EntityToResponse(DonateurEntity donateurEntity) {
        if ( donateurEntity == null ) {
            return null;
        }

        ResponseDon responseDon = new ResponseDon();

        responseDon.setId( donateurEntity.getId() );
        responseDon.setNom_ar( donateurEntity.getNom_ar() );
        responseDon.setNom_fr( donateurEntity.getNom_fr() );
        responseDon.setPrenom_ar( donateurEntity.getPrenom_ar() );
        responseDon.setPrenom_fr( donateurEntity.getPrenom_fr() );
        responseDon.setCharacter( donateurEntity.getCharacter() );
        responseDon.setCine( donateurEntity.getCine() );
        responseDon.setEmail( donateurEntity.getEmail() );
        responseDon.setTelephone( donateurEntity.getTelephone() );
        byte[] demande_access = donateurEntity.getDemande_access();
        if ( demande_access != null ) {
            responseDon.setDemande_access( Arrays.copyOf( demande_access, demande_access.length ) );
        }
        responseDon.setDemende_access_url( donateurEntity.getDemende_access_url() );
        byte[] cin = donateurEntity.getCin();
        if ( cin != null ) {
            responseDon.setCin( Arrays.copyOf( cin, cin.length ) );
        }
        responseDon.setCin_url( donateurEntity.getCin_url() );

        return responseDon;
    }
}
