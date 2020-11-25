package net.cotizador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.cotizador.model.PaisDestino;

@Repository
public interface PaisDestinoRepository extends JpaRepository<PaisDestino, Integer>{

}
