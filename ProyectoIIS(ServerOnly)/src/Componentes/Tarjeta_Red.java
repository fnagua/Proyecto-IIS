package Componentes;

public class Tarjeta_Red implements Componente
{
    private String nombre;//marca+modelo
    private float precio;
    private int consumo;

    public int getConsumo() {
        return consumo;
    }

    public Tarjeta_Red(String nombre, float precio, int consumo)
    {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre()
    {
        return nombre;
    }

    public float getPrecio()
    {
        return precio;
    }

    public boolean getCompatibilidad(PC pc)
    {
        boolean res = false;


        if ( cumplePresupuesto(pc) )
        {
            res = true;
        }

        return res;
    }

    public boolean cumplePresupuesto(PC pc)
    {
        boolean res = false;

        if (pc.getPrecioAcumulado()+this.precio <= pc.getPrecioMax()) {
            res = true;
        }

        return res;
    }

    public String toString()
    {
        return this.nombre;
    }
}
