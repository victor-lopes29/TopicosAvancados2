package br.edu.utfpr.todo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AuthDTO {
    @NotBlank
    @Size(min = 4, max = 150)
    private String username;

    @NotBlank
    @Size(min = 4, max = 50)
    private String password;
}