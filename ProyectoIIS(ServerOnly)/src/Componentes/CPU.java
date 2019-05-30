package Componentes;

public class CPU implements Componente{

	private String nombre;//marca+modelo
	private float precio;
	private String socket;
	private int frecuenciaMem;//MHz
	private String tecnologiaMem;//DDRX

	public CPU(String nombre, float precio, String socket, int frecuenciaMem, String tecnologiaMem) {
		this.nombre = nombre;
		this.precio = precio;
		this.socket = socket;
		this.frecuenciaMem = frecuenciaMem;
		this.tecnologiaMem = tecnologiaMem;
	}

	public String getNombre() {
		return nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public String getSocket() {
		return socket;
	}

	public int getFrecuenciaMem() {
		return frecuenciaMem;
	}

	public String getTecnologiaMem() {
		return tecnologiaMem;
	}

	public boolean getCompatibilidad(PC pc) {
		boolean res = false;

		if (pc.getComponentes().isEmpty() && cumplePresupuesto(pc) ) {
			res = true;
		}

		return res;
	}

	public boolean cumplePresupuesto(PC pc) {
		boolean res = false;

		if (pc.getPrecioAcumulado()+this.precio <= pc.getPrecioMax()) {
			res = true;
		}

		return res;
	}

}
