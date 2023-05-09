package com.ead.authuser.dtos;

import lombok.Data;

import javax.persistence.Column;
import java.util.UUID;

@Data
public class UserEventDto {
    private UUID id;
    private String userName;
    private String email;
    private String fullName;
    private String userStatus;
    private String userType;
    private String phoneNumber;
    private String cpf;
    private String imageUrl;
    private String actionType;
}
