package com.example.OrderShop.entities;

import com.example.OrderShop.enums.TipoUsuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuario")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "senha", nullable = false)
    private String senha;
    @Column(name = "email" ,unique = true , nullable = false)
    private String email;
    @Column(name = "tipoUsuario", nullable = true)
    @Enumerated(EnumType.STRING)
    private TipoUsuario tipoUsuario;
}
