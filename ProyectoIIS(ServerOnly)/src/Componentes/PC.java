package Componentes;

import Componentes.Componente;

import java.util.LinkedList;
import java.util.List;

//0-CPU   1-RAM 2-PlacaBase   3-Grafica 4-DiscoDuro   Carcasa TarjetaRed  FuenteAlimentacion
public class PC
{

    private List<Componente> componentes;

    public PC () {
        this.componentes = new LinkedList<Componente>();
    }

    public List<Componente> getComponentes() {
        return this.componentes;
    }

    public void setCPU (CPU cpu) {
        componentes.add(0,cpu);
    }

    public CPU getCPU () {
        return (CPU) componentes.get(0);
    }



}