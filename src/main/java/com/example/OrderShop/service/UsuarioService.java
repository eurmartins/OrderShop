package com.example.OrderShop.service;

import com.example.OrderShop.dto.usuarios.UsuarioRequestDTO;
import com.example.OrderShop.dto.usuarios.UsuarioResponseDTO;

import com.example.OrderShop.entities.UsuarioEntity;
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
        return usuarioMapper.usuarioEntityToResponseDTO(usuarioRepository.save(usuarioMapper.usuarioRequestDTOToEntity(request)));
    }

    public List<UsuarioResponseDTO> listAllUsuarios(){
        return usuarioMapper.listEntityToUsuarioResponseDTO(usuarioRepository.findAll());
    }

    public UsuarioResponseDTO uptadeUsuario(Long id, UsuarioRequestDTO dto){
        UsuarioEntity usuario = usuarioRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Usuario não encontrado!"));
        usuarioMapper.updateUsuario(dto, usuario);

        return usuarioMapper.usuarioEntityToResponseDTO(usuarioRepository.save(usuario));
    }

    public void deleteUsuario(Long id){
        usuarioRepository.deleteById(id);
    }
}
