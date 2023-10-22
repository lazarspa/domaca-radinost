package com.lazarspa.domaca.radinost.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "muncipality_registry")
public class MunicipalityRegistryDO {

    @Id
    private Integer id;

    @Column(name = "identification_number",nullable = false)
    private String identificationNumber;

    @Column(name = "name",nullable = false)
    private String name;

    @JoinColumn(referencedColumnName = "id",name = "city_id")
    @ManyToOne
    private CityRegistryDO city;
}
