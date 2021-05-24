package com.example.demo.usecase;
import com.example.demo.Mapper.VeterinaryMapper;
import com.example.demo.database.entity.VeterinaryEntity;
import com.example.demo.database.repository.VeterinaryRepository;
import com.example.demo.dto.VetDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class VanUseCase {

    @Autowired
    VeterinaryRepository veterinaryRepository ;

    @Autowired
    VeterinaryMapper veterinaryMapper ;

    public Set<VetDto> getAllVet() {

        List<VeterinaryEntity>  x= veterinaryRepository.findAll();

        return StreamSupport.stream(x.spliterator(), false)
                .filter(Objects::nonNull)
                .map(skillEntity -> {
                    return veterinaryMapper.toDto(skillEntity);
                }).collect(Collectors.toSet());
    }

    public void addVet(VeterinaryEntity requestData) {

        veterinaryRepository.save(requestData);

    }


}
