package com.dev.rayan.webservice.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
@Entity
@Table(name = "tb_user")
public class User implements Serializable {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @EqualsAndHashCode.Include
    private String email;

    @EqualsAndHashCode.Include
    private String phone;

    private String password;

    @Setter(value = AccessLevel.NONE)
    @OneToMany(mappedBy = "user")
    private Set<Address> addresses = new HashSet<>();

    @JsonIgnore
    @Setter(value = AccessLevel.NONE)
    @OneToMany(mappedBy = "client")
    private List<Order> orders = new ArrayList<>();


    public User(Long id, String name, String email, String phone, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }
}
