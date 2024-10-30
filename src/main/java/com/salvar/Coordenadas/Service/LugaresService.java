package com.salvar.Coordenadas.Service;

import com.salvar.Coordenadas.Entity.Lugares;
import com.salvar.Coordenadas.Repository.LugaresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LugaresService {

    @Autowired
    private LugaresRepository lugaresRepository;

    public Lugares findLocalByCoordenada(int idx, int idy){
        List<Lugares> lugares = lugaresRepository.findAll();

        double lugarMaisPertoDistancia = 40072;
        Lugares lugarMaisPerto = null;
        for (Lugares lugar : lugares) {
            Double distancia = haversine(idx, idy, lugar.getCoordenadaX(), lugar.getCoordenadaY());
            System.out.println("antes" +distancia);

            if(distancia < lugarMaisPertoDistancia){
                System.out.println("depos" +distancia);
               lugarMaisPerto = lugar;
                lugarMaisPertoDistancia = distancia;
            }
        }
        return lugarMaisPerto;
    }

    public static double haversine(double lat1, double lon1, double lat2, double lon2) {
        final double R = 6371; // Raio da Terra em km

        // Converter graus para radianos
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);

        // Diferenças
        double dlat = lat2 - lat1;
        double dlon = lon2 - lon1;

        // Fórmula de Haversine
        double a = Math.pow(Math.sin(dlat / 2), 2)
                + Math.cos(lat1) * Math.cos(lat2) * Math.pow(Math.sin(dlon / 2), 2);
        double c = 2 * Math.asin(Math.sqrt(a));

        // Distância em km
        return R * c;
    }

    public Lugares createLocal(Lugares lugar){
        return lugaresRepository.save(lugar);
    }
}
