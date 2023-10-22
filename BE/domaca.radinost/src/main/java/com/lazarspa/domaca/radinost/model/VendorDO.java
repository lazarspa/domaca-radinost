package com.lazarspa.domaca.radinost.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "vendor")
public class VendorDO extends Person{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    //type of vendor

    @JoinColumn(name = "muncipality_id",referencedColumnName = "id")
    @ManyToOne
    private MunicipalityRegistryDO municipality;

    private String street;

    private String number;

}
