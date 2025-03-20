package com.example.OrderShop.mapper;

import com.example.OrderShop.dto.usuarios.UsuarioRequestDTO;
import com.example.OrderShop.dto.usuarios.UsuarioResponseDTO;
import com.example.OrderShop.entities.UsuarioEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "spring")
@Component
public interface UsuarioMapper {

    @Mapping(target = "id" , ignore = true)
    UsuarioEntity usuarioRequestDTOToEntity(UsuarioRequestDTO dto);

    UsuarioResponseDTO usuarioEntityToResponseDTO(UsuarioEntity entity);

    List<UsuarioResponseDTO> listEntityToUsuarioResponseDTO(List<UsuarioEntity> list);

    void updateUsuario(UsuarioRequestDTO dto, @MappingTarget UsuarioEntity entity);
}
