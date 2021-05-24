package com.example.demo.Mapper;

import com.example.demo.database.entity.VeterinaryEntity;
import com.example.demo.dto.VetDto;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface VeterinaryMapper extends EntityMapper<VeterinaryEntity, VetDto> {

    VetDto toDto(VeterinaryEntity entity);

    VeterinaryEntity toEntity(VetDto skillDTO);

    default VeterinaryEntity fromId(final Long id) {
        if (id == null) {
            return null;
        }
        return VeterinaryEntity.builder()
               .id(id)
                .build();
    }



}
