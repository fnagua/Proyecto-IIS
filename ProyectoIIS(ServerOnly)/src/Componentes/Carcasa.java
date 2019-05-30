package Componentes;

public class Carcasa {
	private String nombre;//marca+modelo
	private float precio;
	private float tamPlaca;
	private float tamFuente;
	private int ilum;//0 = no incorpora; 1 = incorpora

	public Carcasa(String nombre,float tamPlaca, float tamFuente, int ilum,float precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.tamPlaca = tamPlaca;
		this.tamFuente = tamFuente;
		this.ilum = ilum;
	}

	public String getNombre() {
		return nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public float getTamPlaca() {
		return tamPlaca;
	}

	public float getTamFuente() {
		return tamFuente;
	}

	public int getIlum() {
		return ilum;
	}

	public boolean getCompatibilidad(PC pc) {
		boolean res = false;


		if ( pc.getPlacaBase().getTamaño() <= this.tamPlaca && pc.getFuenteAlimentacion().getTamaño() <= this.tamFuente && cumplePresupuesto(pc)) {
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
