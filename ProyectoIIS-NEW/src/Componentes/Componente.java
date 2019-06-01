package Componentes;

public interface Componente {

    boolean getCompatibilidad(Configuraciones pc);

    boolean cumplePresupuesto(Configuraciones pc);

    float getPrecio();

}