package com.example.demo.web.rest;


import com.example.demo.database.entity.SpecialityEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Deprecated(since = "use its associated RequestDetailsDTO in core")
public class RequestData {

    private String firstName;
    private String lastName;
    private List<SpecialityEntity> specialities;



}
