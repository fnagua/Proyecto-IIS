package Componentes;

public class CPU {
	private String marca;
	private String modelo;
	private int frecuenciaBase;//GHz
	private String socket;
	private int frecuenciaMem;//MHz
	private String tecnologiaMem;//DDRX
	private int maxMem;//Gb
	private int consumo;//W
	private int bit;
	private int precio;
	private String link;//link a la pagina web
	public CPU(String marca,String modelo,int frecuenciaBase,String socket,int frecuenciaMem,String tecnologiaMem,int maxMem,int consumo,int bit,int precio,String link){
		this.marca= marca;
		this.modelo=modelo;
		this.frecuenciaBase=frecuenciaBase;
		this.socket=socket;
		this.frecuenciaMem=frecuenciaMem;
		this.tecnologiaMem=tecnologiaMem;
		this.maxMem=maxMem;
		this.consumo=consumo;
		this.bit=bit;
		this.precio=precio;
		this.link=link;
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public int getFrecuenciaBase() {
		return frecuenciaBase;
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
	public int getMaxMem() {
		return maxMem;
	}
	public int getConsumo() {
		return consumo;
	}
	public int getBit() {
		return bit;
	}
	public int getPrecio() {
		return precio;
	}
	public String getLink(){
		return link;
	}
}
