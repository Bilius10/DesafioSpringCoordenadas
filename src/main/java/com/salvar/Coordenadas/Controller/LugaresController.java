package com.salvar.Coordenadas.Controller;

import com.salvar.Coordenadas.DTO.LugaresDTO;
import com.salvar.Coordenadas.Entity.Lugares;
import com.salvar.Coordenadas.Service.LugaresService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lugares")
public class LugaresController {

    @Autowired
    private LugaresService lugaresService;

    @GetMapping("/X/{idx}/Y/{idy}")
    public ResponseEntity<Lugares> findLocalByCoordenada(@PathVariable int idx, @PathVariable int idy){
        Lugares localByCoordenada = lugaresService.findLocalByCoordenada(idx, idy);
        return ResponseEntity.status(HttpStatus.OK).body(localByCoordenada);
    }

    @PostMapping
    public ResponseEntity<Lugares> createLocal(@RequestBody @Valid LugaresDTO lugaresDTO){

        Lugares lugares = new Lugares();
        BeanUtils.copyProperties(lugaresDTO, lugares);

        return ResponseEntity.status(HttpStatus.OK).body(lugaresService.createLocal(lugares));
    }


}
