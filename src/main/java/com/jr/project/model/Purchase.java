package com.jr.project.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Purchase implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "description", nullable = false)
    private String description;
    @OneToMany(mappedBy = "product")
    private List<PurchaseProducts> purchaseProducts;


}
