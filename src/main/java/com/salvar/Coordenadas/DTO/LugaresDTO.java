package com.salvar.Coordenadas.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record LugaresDTO(@NotBlank String nomeLocal, @NotNull int coordenadaX, @NotNull int coordenadaY) {
}
