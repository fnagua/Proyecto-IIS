package Componentes;

public interface Componente {

    boolean getCompatibilidad(PC pc);

    boolean cumplePresupuesto(PC pc);

    float getPrecio();

}