package com.example.OrderShop.dto.produto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProdutoDTO {

    @JsonProperty(required = true)
    private Long id;
    @JsonProperty(required = true)
    private String nome;
    @JsonProperty(required = true)
    private String descricao;
    @JsonProperty(required = true)
    private double preco;
}
