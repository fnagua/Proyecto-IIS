package Componentes;

public class Disco_Duro
{
    private String nombre;//marca+modelo
    private float precio;
    private int capacidad;
    private String tecnologia;

    public Disco_Duro(String nombre, float precio, int capacidad, String tecnologia) {
        this.nombre = nombre;
        this.precio = precio;
        this.capacidad = capacidad;
        this.tecnologia = tecnologia;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getTecnologia() {
        return tecnologia;
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
