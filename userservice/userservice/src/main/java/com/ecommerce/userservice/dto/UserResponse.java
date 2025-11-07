package com.ecommerce.userservice.dto;

import com.ecommerce.userservice.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    private Long id;

    private String name;
    private String email;
    private String phoneNumber;
    private Role roles;
}
