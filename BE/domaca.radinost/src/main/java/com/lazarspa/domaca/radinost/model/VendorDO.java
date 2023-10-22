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
public class VendorDO {

    @Id
    @JoinColumn(referencedColumnName = "id",name = "user_id")
    @OneToOne
    private UserDO user;

    //type of vendor
    private String testTestVendor;

}
