package com.javaguides.springboot.model;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity //tabela de entidade jp
@Table(name="locations")
public class Location {
    @Id //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String place;
    private String description;
    private double longitude;
    private double latitude;
}
