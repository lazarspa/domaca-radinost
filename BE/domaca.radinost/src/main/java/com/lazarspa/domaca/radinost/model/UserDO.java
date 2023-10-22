package com.lazarspa.domaca.radinost.model;

import com.lazarspa.domaca.radinost.dto.enums.Gender;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "user_registry")
public class UserDO {

    @Id
    private Integer id;

    private String email;

    private String password;

    private String firstName;

    private String lastName;

    private Date dateOfBirth;

    private Gender gender;

    @JoinColumn(name = "muncipality_id",referencedColumnName = "id")
    @ManyToOne
    private MunicipalityRegistryDO municipality;

    private String street;

    private String number;

}
