package com.example.OrderShop.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum TipoUsuario {

    USER(0),
    ADMIN(1);

    private final int tipo;

    TipoUsuario(int tipo) {
        this.tipo = tipo;
    }

    @JsonValue
    public int getTipo() {
        return tipo;
    }

    @JsonCreator
    public static TipoUsuario userOrAdmin(int tipo) {
        for (TipoUsuario userOrAdmin : TipoUsuario.values()) {
            if (userOrAdmin.getTipo() == tipo) {
                return userOrAdmin;
            }
        }
        throw new IllegalArgumentException("Código inválido para Tipo de usuario: " + tipo);
    }

    @Override
    public String toString() {
        return this.name();
    }
}
