package Componentes;

public class Carcasa implements Componente{
	private String nombre;//marca+modelo
	private float precio;
	private String tamPlaca;
	private float tamFuente;
	private int ilum;//0 = no incorpora; 1 = incorpora

	public Carcasa(String nombre,String tamPlaca, float tamFuente, int ilum,float precio, int consumo)
	{
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

	public String getTamPlaca() {
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


		if ( pc.getPlacaBase().getTamanio().equals(this.tamPlaca)  && cumplePresupuesto(pc)) {
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

	public String toString()
	{
		return this.nombre;
	}
}
