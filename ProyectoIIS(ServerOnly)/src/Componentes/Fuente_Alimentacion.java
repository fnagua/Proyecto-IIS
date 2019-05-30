package Componentes;

public class Fuente_Alimentacion implements Componente
{

    private String nombre;//marca+modelo
    private float precio;
    private int voltaje;
    private int tamaño;

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public Fuente_Alimentacion(String nombre, float precio, int voltaje, int tamaño)
    {
        this.nombre = nombre;
        this.precio = precio;
        this.voltaje = voltaje;
        this.tamaño = tamaño;
    }


    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public float getPrecio()
    {
        return precio;
    }

    public void setPrecio(float precio)
    {
        this.precio = precio;
    }

    public int getVoltaje()
    {
        return voltaje;
    }

    public void setVoltaje(int voltaje)
    {
        this.voltaje = voltaje;
    }

    @Override
    public boolean getCompatibilidad(PC pc)
    {
        return cumplePresupuesto(pc) && pc.getConsumoAcumulado()<=this.voltaje;
    }

    @Override
    public boolean cumplePresupuesto(PC pc)
    {
        return (pc.getPrecioAcumulado()+this.getPrecio() <= pc.getPrecioMax());
    }

}
