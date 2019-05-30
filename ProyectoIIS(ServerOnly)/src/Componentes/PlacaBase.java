package Componentes;

public class PlacaBase implements Componente
{
	private String nombre;//marca+modelo
	private float precio;
	private String socket;
	private int frecuenMem;//MHz
	private int tamanio;

	public PlacaBase(String nombre, String socket, int freq, int tamanio, float precio)
	{
		this.nombre = nombre;
		this.socket = socket;
		this.frecuenMem = freq;
		this.tamanio = tamanio;
		this.precio = precio;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

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

	public int getTamaño()
	{
		return tamanio;
	}

	public void setTamaño(int tamaño)
	{
		this.tamanio = tamaño;
	}

	@Override
	public boolean getCompatibilidad(PC pc)
	{
		boolean ok = false;
		if(pc.getRAM().getFrecuencia()<=this.frecuenMem && cumplePresupuesto(pc))
		{

		}
		return false;
	}

	public boolean cumplePresupuesto(PC pc)
	{
		return (pc.getPrecioAcumulado()+this.precio)<pc.getPrecioMax();

	}
}