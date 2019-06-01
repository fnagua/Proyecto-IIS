package Componentes;

public class Tarjeta_Red extends Componente
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

    @Override
    public float getPrecio()
    {
        return precio;
    }

    @Override
    public boolean getCompatibilidad(Configuraciones pc)
    {
        boolean res = false;


        if ( cumplePresupuesto(pc) )
        {
            res = true;
        }

        return res;
    }

    @Override
    public boolean cumplePresupuesto(Configuraciones pc)
    {
        boolean res = false;

        if (pc.getPrecioAcumulado()+this.precio <= pc.getPrecioMax()) {
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
