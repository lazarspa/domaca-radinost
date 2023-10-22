package com.lazarspa.domaca.radinost.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Entity
@Table(name = "district_registry")
public class DistrictRegistryDO {

    @Id
    private Integer id;

//    @Column(name = "code",nullable = false)
//    private String code;

    @Column(name = "name",nullable = false)
    private String name;

    @JoinColumn(referencedColumnName = "id",name = "region_id")
    @ManyToOne
    private RegionRegistryDO region;

}
