package Componentes;

public class PlacaBase {
	private String marca;
	private String modelo;
	private String socket;
	private int frecuenMem;//MHz
	private int maxMem;//memoria maxima que reconoce
	private String tecnologia;//DDRX
	private int tamanio;//atx/micro-atx
	private int precio;//�
	private int numTarjetas;//numero de modulos de memoria
	private String link;//link a la pagina wb
	public PlacaBase(String marca,String modelo,String socket,int frecuenMem,int maxMem,String tecnologia,int tamanio,int precio,int numTarjetas,String link){
		this.marca=marca;
		this.modelo=modelo;
		this.socket=socket;
		this.frecuenMem=frecuenMem;//MHz
		this.maxMem=maxMem;//memoria maxima que reconoce
		this.tecnologia=tecnologia;//DDRX
		this.tamanio=tamanio;//atx/micro-atx
		this.precio=precio;//�
		this.numTarjetas=numTarjetas;//numero de modulos de memoria
		this.link=link;//link a la pagina wb
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public String getSocket() {
		return socket;
	}
	public int getFrecuenMem() {
		return frecuenMem;
	}
	public int getMaxMem() {
		return maxMem;
	}
	public String getTecnologia() {
		return tecnologia;
	}
	public int getTamanio() {
		return tamanio;
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