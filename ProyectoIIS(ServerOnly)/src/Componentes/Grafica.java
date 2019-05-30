package Componentes;

public class Grafica
{
    private String nombre;//marca+modelo
    private float precio;
    private float consumo;

    public Grafica(String nombre, float precio, float consumo) {
        this.nombre = nombre;
        this.precio = precio;
        this.consumo = consumo;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public float getConsumo() {
        return consumo;
    }

    public boolean getCompatibilidad(PC pc) {
        boolean res = false;


        if (cumplePresupuesto(pc)) {
            res = true;
        }

        return res;
    }

    private boolean cumplePresupuesto(PC pc) {
        boolean res = false;

        if (pc.getPrecioAcumulado()+this.precio <= pc.getPrecioMax()) {
            res = true;
        }

        return res;
    }
}
