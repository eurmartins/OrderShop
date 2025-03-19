package com.example.OrderShop.mapper;

import com.example.OrderShop.dto.produto.ProdutoDTO;
import com.example.OrderShop.entities.ProdutoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface ProdutoMapper {

    @Mapping(target = "id" , ignore = true)
    ProdutoEntity produtoEntityToProdutoDTO(ProdutoDTO produtoDTO);

    ProdutoDTO produtoDTOToProdutoEntity(ProdutoEntity produtoEntity);
}
