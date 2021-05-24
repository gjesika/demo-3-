package com.example.demo.database.entity;

import lombok.*;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name ="veterinary",schema="public")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Data
public class VeterinaryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="name", length = 50)
    private String firstName;

    @Column(name ="surname", length = 50)
    private String lastName;

    @ManyToMany
    Set<SpecialityEntity> specialities;

}
