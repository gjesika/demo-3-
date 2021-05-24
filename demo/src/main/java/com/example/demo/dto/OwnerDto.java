package com.example.demo.dto;



import com.example.demo.database.entity.OwnerEntity;
import com.example.demo.database.entity.PetEntity;
import com.example.demo.database.entity.SpecialityEntity;
import lombok.*;

import java.util.List;

@EqualsAndHashCode(callSuper=false)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OwnerDto {

    private Long Id ;
    private String firstName;
    private String lastName;
    private String city;
    private String address;
    private List<PetEntity> ownerPets;;
}
