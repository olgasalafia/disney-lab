package com.alkemy.disney.disney.entity;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;


import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name = "genero")
@Getter
@Setter
public class GeneroEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String imagen;
}
