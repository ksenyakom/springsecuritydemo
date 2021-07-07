package com.example.springsecuritydemo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

//@Entity
//@Table(name = "gUser")
@Data
public class GoogleUser {
 //   @Id
    private String id;

    private String name;
    private String userpic;
    private String email;
    private String gender;
    private String locale;
    private LocalDateTime lastVisit;

}
