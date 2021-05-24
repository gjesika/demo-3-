package com.example.demo.Mapper;

import java.util.List;

public interface EntityMapper<E, DTO> {

    DTO toDto(E entity);
    List<DTO> toDTO(List<E> entities);

    E toEntity(DTO dto);
    List<E> toEntity(List<DTO> dtos);

}
