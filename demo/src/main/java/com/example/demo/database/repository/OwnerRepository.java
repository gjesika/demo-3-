package com.example.demo.database.repository;
import com.example.demo.database.entity.OwnerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface OwnerRepository extends JpaRepository<OwnerEntity, Long> {

}
