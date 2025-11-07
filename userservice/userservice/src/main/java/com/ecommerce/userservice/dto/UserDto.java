package com.ecommerce.userservice.dto;

import com.ecommerce.userservice.entity.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Long id;

    @NotBlank(message = "Name is necessary")
    private String name;

    @Email(message = "Enter valid email")
    private String email;

    private String password;

    private String phoneNumber;
    private Role roles;
}
