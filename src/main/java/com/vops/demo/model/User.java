package com.vops.demo.model;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    @Id
    private Long id;
    private String username;
    private String password;

}
