package edu.es.eoi.marketplace.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "articulos")
public class Articulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 100)
    private String nombre;
    @Column
    private double precio;
    @Column
    private int stock;

    @OneToMany(mappedBy = "articulo")
    private List<PerteneceA> perteneceA;

}
