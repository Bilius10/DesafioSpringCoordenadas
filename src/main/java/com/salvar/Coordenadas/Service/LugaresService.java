package com.salvar.Coordenadas.Service;

import com.salvar.Coordenadas.Repository.LugaresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LugaresService {

    @Autowired
    private LugaresRepository lugaresRepository;
}
