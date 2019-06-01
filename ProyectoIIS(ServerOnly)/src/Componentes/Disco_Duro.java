package Componentes;

public class Disco_Duro implements Componente
{
    private String nombre;//marca+modelo
    private float precio;
    private int capacidad;
    private String tecnologia;
    private int consumo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public boolean getCompatibilidad(PC pc)
    {
        boolean res = false;


        if (cumplePresupuesto(pc))
        {
            res = true;
        }

        return res;
    }

    public boolean cumplePresupuesto(PC pc)
    {
        boolean res = false;

        if (pc.getPrecioAcumulado()+this.precio <= pc.getPrecioMax())
        {
            res = true;
        }

        return res;
    }

    public String toString()
    {
        return this.nombre;
    }
}
