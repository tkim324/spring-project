package de.lernen.springboot.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name = "users")
public class User {
    @Id
    private String userId;
    private String lastName;
    private String firstName;
    private String tel;
    private String cellPhone;
}
