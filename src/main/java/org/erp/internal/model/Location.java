package org.erp.internal.model;

import jakarta.persistence.*;

import java.util.List;

@Table(name = "location")
@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToMany(mappedBy = "location", cascade = CascadeType.ALL)
    private List<Product> product;
}
