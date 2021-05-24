package com.example.demo.usecase;
import com.example.demo.Mapper.OwnerMapper;
import com.example.demo.database.entity.OwnerEntity;
import com.example.demo.database.repository.OwnerRepository;
import com.example.demo.dto.VetDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
@Service
public class OwnerUsecase{

    @Autowired
    OwnerRepository ownerRepository;

    @Autowired
    OwnerMapper ownerMapper;


    public void updateOwner(OwnerEntity v){
        if(ownerRepository.existsById(v.getId())==true){
            ownerRepository.save(v) ;
        }else{
            System.out.println("Id doesn't exists");
        }
    }


    public Set<VetDto> getAllOwnerPets(){

            List<OwnerEntity> x= ownerRepository.findAll();
            return StreamSupport.stream(x.spliterator(), false)
                    .filter(Objects::nonNull)
                    .map(skillEntity -> {
                        return ownerMapper.toDto(skillEntity);
                    }).collect(Collectors.toSet());

    }


}

