package org.erp.internal.model;

import jakarta.persistence.*;

@Table(name = "location")
@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToMany(mappedBy = "location", cascade = CascadeType.ALL)
    private Product product;
}
