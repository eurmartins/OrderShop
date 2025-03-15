package com.example.OrderShop.mapper;

import com.example.OrderShop.dto.UsuarioRecord;
import com.example.OrderShop.dto.UsuarioRequestDTO;
import com.example.OrderShop.dto.UsuarioResponseDTO;
import com.example.OrderShop.entities.UsuarioEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    @Mapping(target = "id", ignore = true)
    UsuarioEntity toEntity(UsuarioRequestDTO dto);

    UsuarioResponseDTO toDto(UsuarioEntity entity);

    UsuarioRecord toRecord(UsuarioEntity entity);

    List<UsuarioResponseDTO> toListToResponseDto(List<UsuarioEntity> listEntity);
}
