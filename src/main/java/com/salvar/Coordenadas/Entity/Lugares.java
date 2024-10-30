package com.salvar.Coordenadas.Entity;

import jakarta.persistence.*;

import java.io.Serial;

@Entity
@Table(name = "lugares")
public class Lugares {

    @Serial
    private static final long serialVersionUID = 87654345L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLugares;
    private String nomeLocal;
    private int coordenadaX;
    private int coordenadaY;

    public Lugares(Long idLugares, String nomeLocal, int coordenadaX, int coordenadaY) {
        this.idLugares = idLugares;
        this.nomeLocal = nomeLocal;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
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
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public void setIdLugares(Long idLugares) {
        this.idLugares = idLugares;
    }

    public Long getIdLugares() {
        return idLugares;
    }
}
