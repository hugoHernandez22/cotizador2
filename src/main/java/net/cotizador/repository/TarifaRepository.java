package net.cotizador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.cotizador.model.Tarifa;


@Repository
public interface TarifaRepository extends JpaRepository<Tarifa, Integer>{

}
