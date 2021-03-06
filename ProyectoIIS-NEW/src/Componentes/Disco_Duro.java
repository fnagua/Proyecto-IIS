package Componentes;

public class Disco_Duro extends Componente
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

    @Override
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

    @Override
    public boolean getCompatibilidad(Configuraciones pc)
    {
        boolean res = false;


        if (cumplePresupuesto(pc))
        {
            res = true;
        }

        return res;
    }

    @Override
    public boolean cumplePresupuesto(Configuraciones pc)
    {
        boolean res = false;

        if (pc.getPrecioAcumulado()+this.precio <= pc.getPrecioMax())
        {
            res = true;
        }

        return res;
    }

    @Override
    public String toString()
    {
        return this.nombre;
    }
}
