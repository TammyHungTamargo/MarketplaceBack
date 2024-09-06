package edu.es.eoi.marketplace.entity;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Date fecha;
    @Column(length = 100)
    private String nombre;

    @ManyToOne
    private Usuario usuario;

    @OneToMany(mappedBy = "pedido")
    private List<PerteneceA> perteneceA;



}