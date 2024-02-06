package com.dev.rayan.webservice.entities;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class User implements Serializable {

    @EqualsAndHashCode.Include
    private Long id;

    private String name;
    private String email;
    private String phone;
    private String password;


}
