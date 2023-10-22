package com.lazarspa.domaca.radinost.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Entity
@Table(name = "region_registry")
public class RegionRegistryDO {

    @Id
    private Integer id;

    @Column(name="name",nullable = false)
    private String name;
}
