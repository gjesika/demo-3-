package com.example.demo.Mapper;
import com.example.demo.database.entity.OwnerEntity;
import com.example.demo.database.entity.VeterinaryEntity;
import com.example.demo.dto.OwnerDto;
import com.example.demo.dto.VetDto;
import org.mapstruct.Mapper;
@Mapper(componentModel="spring")
public interface OwnerMapper extends EntityMapper<OwnerEntity, VetDto> {

    VetDto toDto(OwnerEntity entity);

    VeterinaryEntity toEntity(OwnerDto skillDTO);

    default VeterinaryEntity fromId(final Long id) {
        if (id == null) {
            return null;
        }
        return VeterinaryEntity.builder()
                .id(id)
                .build();
    }
}
