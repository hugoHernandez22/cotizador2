package net.cotizador.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tarifa")
public class Tarifa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tarifa", nullable = false)
	private int id_tarifa;
	@Column(name = "nombre", nullable = false)
	private String nombre;
	@Column(name = "tarifa", nullable = false)
	private float tarifa;
	@Column(name = "tipo", nullable = false)
	private long tipo;
	@Column(name = "status", nullable = false)
	private long status;
	
	
	
	public Tarifa() {
		super();
	}
	public Tarifa(String nombre, float tarifa, long tipo, long status) {
		super();
		this.nombre = nombre;
		this.tarifa = tarifa;
		this.tipo = tipo;
		this.status = status;
	}
	public int getId_tarifa() {
		return id_tarifa;
	}
	public void setId_tarifa(int id_tarifa) {
		this.id_tarifa = id_tarifa;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getTarifa() {
		return tarifa;
	}
	public void setTarifa(float tarifa) {
		this.tarifa = tarifa;
	}
	public long getTipo() {
		return tipo;
	}
	public void setTipo(long tipo) {
		this.tipo = tipo;
	}
	public long getStatus() {
		return status;
	}
	public void setStatus(long status) {
		this.status = status;
	}
	
}
