package Componentes;

public class RAM {
	private String marca;
	private String modelo;
	private String tecnologia;//DDRX
	private int capacidad;//Gb
	private int velocidad;//MHz
	private int precio;//€
	private int numTarjetas;//numero de modulos de memoria
	private String link;//link a la pagina wb
	public RAM(String marca,String modelo,String tecnologia,int capacidad, int velocidad,int precio, int numTarjetas,String link){
		this.marca= marca;
		this.modelo=modelo;
		this.tecnologia=tecnologia;
		this.capacidad=capacidad;
		this.velocidad=velocidad;
		this.precio=precio;
		this.numTarjetas=numTarjetas;
		this.link=link;
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public String getTecnologia() {
		return tecnologia;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public int getPrecio() {
		return precio;
	}
	public int getNumTarjetas() {
		return numTarjetas;
	}
	public String getLink() {
		return link;
	}
}
