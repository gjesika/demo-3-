package com.example.demo.dto;

import com.example.demo.database.entity.SpecialityEntity;
import lombok.*;

import java.util.List;

@EqualsAndHashCode(callSuper=false)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VetDto {

    private Long Id ;
    private String firstName;
    private String lastName;
    private List<SpecialityEntity> specialities;

}
