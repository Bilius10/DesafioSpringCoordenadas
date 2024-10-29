package com.salvar.Coordenadas.Repository;

import com.salvar.Coordenadas.Entity.Lugares;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LugaresRepository extends JpaRepository<Lugares, Long> {
}
