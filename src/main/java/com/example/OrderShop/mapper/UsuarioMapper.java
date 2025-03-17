package com.example.OrderShop.mapper;

import com.example.OrderShop.dto.UsuarioRecord;
import com.example.OrderShop.dto.UsuarioRequestDTO;
import com.example.OrderShop.dto.UsuarioResponseDTO;
import com.example.OrderShop.entities.UsuarioEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "spring")
@Component
public interface UsuarioMapper {

    @Mapping(target = "id" , ignore = true)
    UsuarioEntity usuarioRequestDTOToEntity(UsuarioRequestDTO dto);

    UsuarioResponseDTO usuarioEntityToResponseDTO(UsuarioEntity entity);

    UsuarioRecord usuarioEntityToRecord(UsuarioEntity entity);

    List<UsuarioResponseDTO> listEntityToUsuarioResponseDTO(List<UsuarioEntity> list);

}
