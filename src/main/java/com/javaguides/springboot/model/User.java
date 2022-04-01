package com.javaguides.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity //anotação de entidade
@Table(name="users")//anotação de tabela e o nome da mesma
public class User {
    @Id //chave primaria da tabela
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String email;
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String password;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "location_id")
    private Location location;
}
