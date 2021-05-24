package com.example.demo.web.rest;
import com.example.demo.database.entity.OwnerEntity;
import com.example.demo.dto.VetDto;
import com.example.demo.usecase.OwnerUsecase;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@Log4j2
@RestController
@RequestMapping("/api/owner")
public class OwnerResource {

    @Autowired
    OwnerUsecase ownerUsecase;

    @GetMapping("/updateOwner")
    public void updateOwner(@RequestBody OwnerEntity requestData){
        ownerUsecase.updateOwner(requestData);
    }

    @GetMapping("/getAllOwnersPets")
    public Set<VetDto> getAllOwnersPets(){

        return  ownerUsecase.getAllOwnerPets();

    }


}
