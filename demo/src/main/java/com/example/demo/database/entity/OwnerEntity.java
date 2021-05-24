package com.example.demo.database.entity;
import lombok.*;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;
@Entity
@Table(name ="owner")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Setter
@Getter
public class OwnerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 50)
    @Column(name = "name", length = 50)
    private String firstName;

    @Size(max = 50)
    @Column(name = "surname", length = 50)
    private String lastName;

    @Size(max = 50)
    private String city;

    @Size(max = 50)
    private String address;

    @OneToMany(targetEntity = PetEntity.class, mappedBy = "owner", orphanRemoval = true)
    private List<PetEntity> ownerPets;



}
