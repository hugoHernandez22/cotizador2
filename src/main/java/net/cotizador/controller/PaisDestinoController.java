package net.cotizador.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.cotizador.exception.ResourceNotFoundException;
import net.cotizador.model.PaisDestino;
import net.cotizador.repository.PaisDestinoRepository;



@RestController
@RequestMapping("/api/cotizador/")
public class PaisDestinoController {
	@Autowired
	private PaisDestinoRepository paisDestinoRepository;
	//get pais
	@GetMapping("pais")
	public List<PaisDestino> getAllPaisDestino(){
		return this.paisDestinoRepository.findAll();
	}
	//get pais {id}
	@GetMapping("/pais/{id}")
	public ResponseEntity<PaisDestino> getTarifaById(@PathVariable(value = "id") Integer pais_id)
			throws ResourceNotFoundException {
		PaisDestino paisDestino = paisDestinoRepository.findById(pais_id)
				.orElseThrow(() -> new ResourceNotFoundException("Country not found for this id :: " + pais_id));
	return ResponseEntity.ok().body(paisDestino);
	}
}
