package com.example.cdccomptes.dto;

import com.example.cdccomptes.Model.DonateurEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DonMapper {
    DonMapper MAPPER = Mappers.getMapper(DonMapper.class);
    DonateurEntity RequestToEntity(RequestDon requestDon);
    ResponseDon EntityToResponse (DonateurEntity donateurEntity);
}
