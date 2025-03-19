package com.example.OrderShop.repository;

import com.example.OrderShop.dto.Usuarios.UsuarioRequestDTO;
import com.example.OrderShop.entities.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{
    Optional<UsuarioRequestDTO> existsByEmail(String email);
}
