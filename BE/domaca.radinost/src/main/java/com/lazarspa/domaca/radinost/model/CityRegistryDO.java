package com.lazarspa.domaca.radinost.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "city_registry")
public class CityRegistryDO {

    @Id
    private Integer id;

    @Column(name = "identification_number",nullable = false)
    private String identificationNumber;

    @Column(name = "name",nullable = false)
    private String name;

    @JoinColumn(referencedColumnName = "id",name = "district_id")
    @ManyToOne
    private DistrictRegistryDO district;
}
