package Componentes;

public class Tarjeta_Red
{
    private String nombre;//marca+modelo
    private float precio;

    public Tarjeta_Red(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public boolean getCompatibilidad(PC pc) {
        boolean res = false;


        if ( cumplePresupuesto(pc) ) {
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
