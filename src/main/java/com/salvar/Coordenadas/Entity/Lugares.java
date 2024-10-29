package com.salvar.Coordenadas.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serial;

@Entity
public class Lugares {

    @Serial
    private static final long serialVersionUID = 87654345L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLugares;
    private String nomeLocal;
    private int CoordenadaX;
    private int CoordenadaY;

    public Lugares(Long idLugares, String nomeLocal, int coordenadaX, int coordenadaY) {
        this.idLugares = idLugares;
        this.nomeLocal = nomeLocal;
        CoordenadaX = coordenadaX;
        CoordenadaY = coordenadaY;
    }

    public Lugares() {
    }

    public String getNomeLocal() {
        return nomeLocal;
    }

    public void setNomeLocal(String nomeLocal) {
        this.nomeLocal = nomeLocal;
    }

    public int getCoordenadaX() {
        return CoordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        CoordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return CoordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        CoordenadaY = coordenadaY;
    }

    public void setIdLugares(Long idLugares) {
        this.idLugares = idLugares;
    }

    public Long getIdLugares() {
        return idLugares;
    }
}
