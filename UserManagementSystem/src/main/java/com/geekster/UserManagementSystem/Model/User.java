package com.geekster.UserManagementSystem.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Validated
@Entity
public class User {

    @Id
    private Long userId;

    @NotBlank
    private String username;

    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "Date of Birth should be in yyyy-MM-dd format")
    private String dateOfBirth;

    @Email(message = "Invalid email address")
    private String email;

   @Pattern(regexp = "\\d{12}", message = "Phone number should be 12 digits")
    private String phoneNumber;


}
