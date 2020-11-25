package net.cotizador.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "pais_destino")
public class PaisDestino {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pais", nullable = false)
	private int id_pais;
	@Column(name = "nombre", nullable = false)
	private String nombre;
	@Column(name = "tarifa", nullable = false)
	private int tarifa;
	@Column(name = "status", nullable = false)
	private long status;
	
	
	
	public PaisDestino() {
		super();
	}
	public PaisDestino(String nombre, int tarifa, long status) {
		super();
		this.nombre = nombre;
		this.tarifa = tarifa;
		this.status = status;
	}
	public int getId_pais() {
		return id_pais;
	}
	public void setId_pais(int id_pais) {
		this.id_pais = id_pais;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTarifa() {
		return tarifa;
	}
	public void setTarifa(int tarifa) {
		this.tarifa = tarifa;
	}
	public long getStatus() {
		return status;
	}
	public void setStatus(long status) {
		this.status = status;
	}
	
	
}
