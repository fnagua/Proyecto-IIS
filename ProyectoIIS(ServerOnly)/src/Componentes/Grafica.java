package Componentes;

public class Grafica implements Componente
{
    private String nombre;//marca+modelo
    private float precio;
    private int consumo;

    public Grafica(String nombre, float precio, int consumo)
    {
        this.nombre = nombre;
        this.precio = precio;
        this.consumo = consumo;
    }

    public String getNombre()
    {
        return nombre;
    }

    public float getPrecio()
    {
        return precio;
    }

    public float getConsumo()
    {
        return consumo;
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
}
