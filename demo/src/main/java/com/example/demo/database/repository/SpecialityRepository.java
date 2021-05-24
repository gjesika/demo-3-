package com.example.demo.database.repository;

import com.example.demo.database.entity.PetEntity;
import com.example.demo.database.entity.SpecialityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SpecialityRepository extends JpaRepository<SpecialityEntity,Long> {



}
