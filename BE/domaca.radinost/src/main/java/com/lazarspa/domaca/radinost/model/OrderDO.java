package com.lazarspa.domaca.radinost.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="order")
public class OrderDO {

    @Id
    private Integer id;

    @JoinColumn(referencedColumnName = "id",name = "user_id")
    @ManyToOne
    private UserDO user;

    @JoinColumn(referencedColumnName = "user_id",name = "vendor_id")
    @ManyToOne
    private VendorDO vendor;

    private LocalDateTime dateOfOrder;

    private String orderComment;

    private Integer rating;

    private String ratingComment;


    //Scheduled - ask for review/rating -
}
