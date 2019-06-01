package Componentes;

public class RAM extends Componente
{

	private String nombre;//marca+modelo
	private float precio;
	private int capacidad;
	private int frecuencia;

	public int getConsumo() {
		return consumo;
	}

	private int consumo;

	public RAM(String nombre, float precio, int capacidad, int frecuencia, int consumo)
	{
		this.nombre = nombre;
		this.precio = precio;
		this.capacidad = capacidad;
		this.frecuencia = frecuencia;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public float getPrecio() {
		return precio;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public int getFrecuencia() {
		return frecuencia;
	}

	@Override
	public boolean getCompatibilidad(Configuraciones pc)
	{
		boolean res = false;

		//System.out.println(pc.getCPU().getFrecuenciaMem()+" >= "+this.frecuencia);
		if (pc.getCPU().getFrecuenciaMem() <=  this.frecuencia && cumplePresupuesto(pc) ) {
			res = true;
		}

		return res;
	}

	@Override
	public boolean cumplePresupuesto(Configuraciones pc)
	{
		boolean res = false;

		if (pc.getPrecioAcumulado()+this.precio <= pc.getPrecioMax())
		{
			res = true;
		}

		return res;
	}

	@Override
	public String toString ()
	{
		return this.nombre;
	}

}
