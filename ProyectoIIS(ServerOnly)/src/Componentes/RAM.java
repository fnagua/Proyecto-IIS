package Componentes;

public class RAM
{

	private String nombre;//marca+modelo
	private float precio;
	private int capacidad;
	private int frecuencia;

	public RAM(String nombre, float precio, int capacidad, int frecuencia) {
		this.nombre = nombre;
		this.precio = precio;
		this.capacidad = capacidad;
		this.frecuencia = frecuencia;
	}

	public String getNombre() {
		return nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public int getFrecuencia() {
		return frecuencia;
	}


}
