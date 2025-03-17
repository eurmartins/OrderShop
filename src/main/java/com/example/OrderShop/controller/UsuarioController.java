package com.example.OrderShop.controller;

import com.example.OrderShop.dto.UsuarioRequestDTO;
import com.example.OrderShop.dto.UsuarioResponseDTO;
import com.example.OrderShop.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;


    @PostMapping
    public ResponseEntity<UsuarioResponseDTO> saveUsuario(@RequestBody UsuarioRequestDTO request){
        return ResponseEntity.ok(usuarioService.saveUsuario(request));
    }

    @GetMapping
    public ResponseEntity<List<UsuarioResponseDTO>> listAllUsuarios(){
        return ResponseEntity.ok(usuarioService.listAllUsuarios());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUsuario(@PathVariable Long id){
        usuarioService.deleteUsuario(id);
        return ResponseEntity.ok().build();
    }
}
