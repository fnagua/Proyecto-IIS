package Componentes;

public class PlacaBase extends Componente
{
	private String nombre;//marca+modelo
	private float precio;
	private String socket;
	private int frecuenMem;//MHz
	private String tamanio;
	private int consumo;

	public int getConsumo()
	{
		return consumo;
	}

	public PlacaBase(String nombre, String socket, int freq, String tamanio, float precio, int consumo)
	{
		this.nombre = nombre;
		this.socket = socket;
		this.frecuenMem = freq;
		this.tamanio = tamanio;
		this.precio = precio;
		this.consumo = consumo;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	@Override
	public float getPrecio()
	{
		return precio;
	}

	public void setPrecio(float precio)
	{
		this.precio = precio;
	}

	public String getSocket()
	{
		return socket;
	}

	public void setSocket(String socket)
	{
		this.socket = socket;
	}

	public int getFrecuenMem()
	{
		return frecuenMem;
	}

	public void setFrecuenMem(int frecuenMem)
	{
		this.frecuenMem = frecuenMem;
	}

	public String getTamanio()
	{
		return tamanio;
	}

	public void setTamanio(String tamanio)
	{
		this.tamanio = tamanio;
	}

	@Override
	public boolean getCompatibilidad(Configuraciones pc)
	{
		boolean ok = false;
		if(pc.getCPU().getSocket().equals(this.socket) && cumplePresupuesto(pc))
		{
			ok=true;

		}
		return ok && cumplePresupuesto(pc);
	}

	@Override
	public boolean cumplePresupuesto(Configuraciones pc)
	{
		return (pc.getPrecioAcumulado()+this.precio)<pc.getPrecioMax();

	}

	@Override
	public String toString ()
	{
		return this.nombre;
	}

}