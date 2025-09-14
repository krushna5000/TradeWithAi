package com.example.Trading.modal;

import com.example.Trading.domain.USER_ROLE;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private String fullname;
    private String email;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password ;

    @Embedded
    private TwoFectorAuth twoFactorAuth = new TwoFectorAuth();


    private USER_ROLE role=USER_ROLE.ROLE_CUSTOMER;


}
