package Componentes;

import Componentes.Componente;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//0-CPU   1-RAM   2-PlacaBase   3-Grafica   4-DiscoDuro   5-Carcasa    6-TarjetaRed    7-FuenteAlimentacion
public class PC
{
    private List<Componente> componentes;
    private float precioMax;
    private float precioAcumulado;
    private int consumoAcumulado;


    public int getConsumoAcumulado()
    {
        return consumoAcumulado;
    }

    public PC (float precioMax)
    {
        this.componentes = new LinkedList<Componente>();
        this.precioMax = precioMax;
        this.precioAcumulado = 0;
        this.consumoAcumulado=0;

        for (int i=0;i<8;i++)
        {
            componentes.add(null);
        }
       // System.out.println(componentes);
    }

    public float getPrecioMax()
    {
        return precioMax;
    }

    public float getPrecioAcumulado()
    {
        return precioAcumulado;
    }

    public List<Componente> getComponentes()
    {
        return this.componentes;
    }




    public void setCPU (CPU cpu)
    {
        componentes.add(0,(Componente)cpu);
        this.precioAcumulado += cpu.getPrecio();
        this.consumoAcumulado+=cpu.getConsumo();
    }

    public CPU getCPU ()
    {
        return (CPU) componentes.get(0);
    }




    public void setRAM (RAM ram)
    {
        this.componentes.add(1,(Componente)ram);
        this.precioAcumulado += ram.getPrecio();
        this.consumoAcumulado+=ram.getConsumo();
    }

    public RAM getRAM ()
    {
        return (RAM) this.componentes.get(1);
    }




    public void setPlacaBase (PlacaBase pb)
    {
        this.componentes.add(2,(Componente)pb);
        this.precioAcumulado += pb.getPrecio();
        this.consumoAcumulado+=pb.getConsumo();
    }

    public PlacaBase getPlacaBase ()
    {
        return (PlacaBase) this.componentes.get(2);
    }




    public void setGrafica (Grafica g)
    {
        this.componentes.add(3, (Componente)g);
        this.precioAcumulado += g.getPrecio();
        this.consumoAcumulado+=g.getConsumo();
    }

    public Grafica getGrafica ()
    {
        return (Grafica) this.componentes.get(3);
    }

    public void setDiscoDuro (Disco_Duro dd)
    {
        this.componentes.add(4,(Componente)dd);
        this.precioAcumulado += dd.getPrecio();
        this.consumoAcumulado+=dd.getConsumo();

    }

    public Disco_Duro getDisco_Duro ()
    {
        return (Disco_Duro) this.componentes.get(4);
    }




    public void setCarcasa (Carcasa c)
    {
        this.componentes.add(5,(Componente) c);
        this.precioAcumulado += c.getPrecio();
    }

    public Carcasa getCarcasa ()
    {
        return (Carcasa) this.componentes.get(5);
    }




    public void setTarjetaRed (Tarjeta_Red tr)
    {
        this.componentes.add(6,(Componente) tr);
        this.precioAcumulado += tr.getPrecio();
        this.consumoAcumulado+=tr.getConsumo();
    }

    public Tarjeta_Red getTarjetaRed ()
    {
        return  (Tarjeta_Red) this.componentes.get(6);
    }




    public void setFuenteAlimentacion (Fuente_Alimentacion fa)
    {
        this.componentes.add(7,fa);
        this.precioAcumulado += fa.getPrecio();
    }

    public Fuente_Alimentacion getFuenteAlimentacion ()
    {

        return  (Fuente_Alimentacion) this.componentes.get(7);
    }

    public void setComponente(int ind, Componente cmp)
    {
        this.componentes.set(ind, cmp);
    }



}