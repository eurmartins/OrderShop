package com.example.OrderShop.mapper;

import com.example.OrderShop.dto.produto.ProdutoDTO;
import com.example.OrderShop.dto.usuarios.UsuarioRequestDTO;
import com.example.OrderShop.dto.usuarios.UsuarioResponseDTO;
import com.example.OrderShop.entities.ProdutoEntity;
import com.example.OrderShop.entities.UsuarioEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "spring")
@Component
public interface ProdutoMapper {

    ProdutoEntity produtoEntityToProdutoDTO(ProdutoDTO produtoDTO);

    ProdutoDTO produtoDTOToProdutoEntity(ProdutoEntity produtoEntity);

    List<ProdutoDTO> listEntityToProdutoDTO(List<ProdutoEntity> list);

    void updateProduto(ProdutoDTO produtoDTO, @MappingTarget ProdutoEntity produtoEntity);
}
