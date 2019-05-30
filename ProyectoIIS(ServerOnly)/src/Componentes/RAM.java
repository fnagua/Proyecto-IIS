package Componentes;

public class RAM implements Componente
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

	public boolean getCompatibilidad(PC pc) {
		boolean res = false;


		if (pc.getCPU().getFrecuenciaMem() >=  this.frecuencia && cumplePresupuesto(pc) ) {
			res = true;
		}

		return res;
	}

	private boolean cumplePresupuesto(PC pc) {
		boolean res = false;

		if (pc.getPrecioAcumulado()+this.precio <= pc.getPrecioMax()) {
			res = true;
		}

		return res;
	}

}
