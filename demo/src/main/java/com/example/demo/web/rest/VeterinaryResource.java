package com.example.demo.web.rest;
import com.example.demo.database.entity.VeterinaryEntity;
import com.example.demo.dto.VetDto;
import com.example.demo.usecase.VanUseCase;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Set;
@Log4j2
@RestController
@RequestMapping("/api/vet")
public class VeterinaryResource {


    @Autowired
    private final VanUseCase vanUseCase ;

    public VeterinaryResource(VanUseCase vanUseCase) {


        this.vanUseCase = vanUseCase;
    }

    @GetMapping("/getAllVet")
    public Set<VetDto> getVets() {

     return  vanUseCase.getAllVet();

    }


    @PostMapping(path = "/createVet",consumes="application/json")
    public void addVet(@RequestBody final VeterinaryEntity requestData){

        vanUseCase.addVet(requestData);

    }
















}
