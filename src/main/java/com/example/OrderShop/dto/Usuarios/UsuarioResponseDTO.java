package com.example.OrderShop.dto.Usuarios;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsuarioResponseDTO {

    @JsonProperty(required = true)
    private String nome;
    @JsonProperty(required = true)
    private String email;
}
