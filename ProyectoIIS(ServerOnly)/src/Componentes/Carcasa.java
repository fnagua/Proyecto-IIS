package Componentes;

public class Carcasa {
	private String marca;
	private String modelo;
	private String tamPlaca;
	private String tamFuente;
	private int ilum;//0 = no incorpora; 1 = incorpora
	private int ventil;//0 = " " " " " " "
	private String link;//link de la web
	public Carcasa(String marca, String modelo, String tamPlaca, String tamFuente, int ilum, int ventil, String link) {
		this.marca = marca;
		this.modelo = modelo;
		this.tamPlaca = tamPlaca;
		this.tamFuente = tamFuente;
		this.ilum = ilum;
		this.ventil = ventil;
		this.link=link;
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public String getTamPlaca() {
		return tamPlaca;
	}
	public String getTamFuente() {
		return tamFuente;
	}
	public int getIlum() {
		return ilum;
	}
	public int getVentil() {
		return ventil;
	}
	public String getLink() {
		return link;
	}
}