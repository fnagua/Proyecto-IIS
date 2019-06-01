package Componentes;

public class CPU implements Componente{

	private String nombre;//marca+modelo
	private float precio;
	private String socket;
	private int frecuenciaMem;//MHz
	private int consumo;

	public int getConsumo() {
		return consumo;
	}

	public CPU(String nombre, float precio, String socket, int frecuenciaMem, int consumo) {
		this.nombre = nombre;
		this.precio = precio;
		this.socket = socket;
		this.frecuenciaMem = frecuenciaMem;
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

	public boolean getCompatibilidad(PC pc) {
		boolean res = false;

		if (pc.getComponentes().get(0)==null && cumplePresupuesto(pc) )
		{
			res = true;
		}

		return res;
	}

	public boolean cumplePresupuesto(PC pc)
	{
		boolean res = false;

		if (pc.getPrecioAcumulado()+this.precio <= pc.getPrecioMax())
		{
			res = true;
		}

		return res;
	}

	public String toString ()
	{
		return this.nombre;
	}

}
