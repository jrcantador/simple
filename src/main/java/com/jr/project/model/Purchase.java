package com.jr.project.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Purchase implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "product", nullable = false)
    private String product;
    @Column(name = "amount", nullable = false)
    private Double amount;

}
