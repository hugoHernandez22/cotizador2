package net.cotizador.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.cotizador.exception.ResourceNotFoundException;
import net.cotizador.model.Tarifa;
import net.cotizador.repository.TarifaRepository;



@RestController
@RequestMapping("/api/cotizador/")
public class TarifaControlller {
	@Autowired
	private TarifaRepository tarifaRespostory;
	
	//get tarifas
		@GetMapping("tarifa")
		public List<Tarifa> getAllTarifa(){
			return this.tarifaRespostory.findAll();
		}
	//get tarifa {id}
	@GetMapping("/tarifa/{id}")
	public ResponseEntity<Tarifa> getTarifaById(@PathVariable(value = "id") Integer tarifa_id)
			throws ResourceNotFoundException {
		Tarifa tarifa = tarifaRespostory.findById(tarifa_id)
				.orElseThrow(() -> new ResourceNotFoundException("Tarifa not found for this id :: " + tarifa_id));
		return ResponseEntity.ok().body(tarifa);
	}
}
