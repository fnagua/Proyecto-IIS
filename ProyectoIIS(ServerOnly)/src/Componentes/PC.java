package Componentes;

import Componentes.Componente;

import java.util.LinkedList;
import java.util.List;

//0-CPU   1-RAM 2-PlacaBase   3-Grafica 4-DiscoDuro   Carcasa TarjetaRed  FuenteAlimentacion
public class PC
{

    private List<Componente> componentes;
    private float precioMax;
    private float precioAcumulado;

    public PC (float precioMax) {
        this.componentes = new LinkedList<Componente>();
        this.precioMax = precioMax;
        this.precioAcumulado = 0;
    }

    public float getPrecioMax() {
        return precioMax;
    }

    public float getPrecioAcumulado() {
        return precioAcumulado;
    }

    public List<Componente> getComponentes() {
        return this.componentes;
    }

    public void setCPU (CPU cpu) {
        componentes.add(0,cpu);
        this.precioAcumulado += cpu.getPrecio();
    }

    public CPU getCPU () {
        return (CPU) componentes.get(0);
    }

    public void setRAM (RAM ram) {
        this.componentes.add(1,ram);
        this.precioAcumulado += ram.getPrecio();
    }

    public RAM getRAM () {
        return (RAM) this.componentes.get(1);
    }


}