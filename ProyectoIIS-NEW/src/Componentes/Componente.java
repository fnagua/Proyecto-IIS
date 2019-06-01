package Componentes;

import java.util.LinkedList;
import java.util.List;

public class Componente
{

    //metodo a sobreescribir por cada una de las subclases
    public boolean getCompatibilidad(Configuraciones pc)
    {
      return false;
    }

    //metodo a sobreescribir por cada una de las subclases
    public boolean cumplePresupuesto(Configuraciones pc)
    {
        return false;
    }

    //metodo a sobreescribir por cada una de las subclases
    public float getPrecio()
    {
        return Integer.MAX_VALUE;

    }

    public List<List<Componente>> obtenerComponentes()
    {
        return new LinkedList<>();
    }

}