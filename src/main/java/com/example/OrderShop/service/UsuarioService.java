package com.example.OrderShop.service;

import com.example.OrderShop.dto.UsuarioRequestDTO;
import com.example.OrderShop.dto.UsuarioResponseDTO;
import com.example.OrderShop.mapper.UsuarioMapper;
import com.example.OrderShop.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioMapper usuarioMapper;

    public UsuarioResponseDTO saveUsuario(UsuarioRequestDTO request){
        return usuarioMapper.toDto(usuarioRepository.save(usuarioMapper.toEntity(request)));
    }

    public List<UsuarioResponseDTO> listAllUsuarios(){
        return usuarioMapper.toListToResponseDto(usuarioRepository.findAll());
    }

    public void deleteUsuario(Long id){
        usuarioRepository.deleteById(id);
    }
}
