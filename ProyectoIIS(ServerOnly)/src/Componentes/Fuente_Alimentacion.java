package Componentes;

public class Fuente_Alimentacion
{

    private String nombre;//marca+modelo
    private float precio;
    private int voltaje;
    private float tamaño;

    public Fuente_Alimentacion(String nombre, float precio, int voltaje, float tamaño) {
        this.nombre = nombre;
        this.precio = precio;
        this.voltaje = voltaje;
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public int getVoltaje() {
        return voltaje;
    }

    public float getTamaño() {
        return tamaño;
    }
}
