package com.example.demo.database.repository;

import com.example.demo.database.entity.VeterinaryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeterinaryRepository extends JpaRepository<VeterinaryEntity, Long>{

}
