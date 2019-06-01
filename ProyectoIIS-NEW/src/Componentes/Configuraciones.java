package Componentes;

import java.util.*;


public class Configuraciones implements Comparable<Configuraciones>
{
    public static SortedSet<Configuraciones> pcs = new TreeSet<>();
    private List<Componente> componentesconf;
    private float precioMax;
    private float precioAcumulado;
    private int consumoAcumulado;


    public int getConsumoAcumulado()
    {
        return consumoAcumulado;
    }

    public Configuraciones()
    {
        this.componentesconf = new LinkedList<>();
        this.precioMax=Integer.MAX_VALUE;
        this.precioAcumulado=0;
        this.consumoAcumulado=0;
    }

    public Configuraciones(Configuraciones pc)
    {
        this.componentesconf = new LinkedList<>(pc.getComponentes());
        this.precioMax = pc.getPrecioMax();
        this.precioAcumulado = pc.getPrecioAcumulado();
        this.consumoAcumulado = pc.getConsumoAcumulado();
    }

    public Configuraciones(float precioMax)
    {
        this.componentesconf = new LinkedList<Componente>();
        this.precioMax = precioMax;
        this.precioAcumulado = 0;
        this.consumoAcumulado = 0;

        for (int i = 0; i < 4; i++)
        {
            componentesconf.add(null);
        }
        // System.out.println(componentes);
    }

    public float getPrecioMax() {
        return precioMax;
    }

    public float getPrecioAcumulado()
    {
        return precioAcumulado;
    }

    public List<Componente> getComponentes()
    {
        return this.componentesconf;
    }


    public void setCPU(CPU cpu)
    {
        componentesconf.add(0, (Componente) cpu);
        this.precioAcumulado += cpu.getPrecio();
        this.consumoAcumulado += cpu.getConsumo();
    }

    public CPU getCPU()
    {
        return (CPU) componentesconf.get(0);
    }


    public void setRAM(RAM ram)
    {
        this.componentesconf.add(1, (Componente) ram);
        this.precioAcumulado += ram.getPrecio();
        this.consumoAcumulado += ram.getConsumo();
    }

    public RAM getRAM()
    {
        return (RAM) this.componentesconf.get(1);
    }


    public void setPlacaBase(PlacaBase pb)
    {
        this.componentesconf.add(2, (Componente) pb);
        this.precioAcumulado += pb.getPrecio();
        this.consumoAcumulado += pb.getConsumo();
    }

    public PlacaBase getPlacaBase()
    {
        return (PlacaBase) this.componentesconf.get(2);
    }


    public void setGrafica(Grafica g)
    {
        this.componentesconf.add(3, (Componente) g);
        this.precioAcumulado += g.getPrecio();
        this.consumoAcumulado += g.getConsumo();
    }

    public Grafica getGrafica()
    {
        return (Grafica) this.componentesconf.get(3);
    }

    public void setDiscoDuro(Disco_Duro dd)
    {
        this.componentesconf.add(4, (Componente) dd);
        this.precioAcumulado += dd.getPrecio();
        this.consumoAcumulado += dd.getConsumo();
    }

    public Disco_Duro getDisco_Duro()
    {
        return (Disco_Duro) this.componentesconf.get(4);
    }


    public void setCarcasa(Carcasa c)
    {
        this.componentesconf.add(5, (Componente) c);
        this.precioAcumulado += c.getPrecio();
    }

    public Carcasa getCarcasa()
    {
        return (Carcasa) this.componentesconf.get(5);
    }


    public void setTarjetaRed(Tarjeta_Red tr)
    {
        this.componentesconf.add(6, (Componente) tr);
        this.precioAcumulado += tr.getPrecio();
        this.consumoAcumulado += tr.getConsumo();
    }

    public Tarjeta_Red getTarjetaRed()
    {
        return (Tarjeta_Red) this.componentesconf.get(6);
    }


    public void setFuenteAlimentacion(Fuente_Alimentacion fa)
    {
        this.componentesconf.add(7, fa);
        this.precioAcumulado += fa.getPrecio();
    }

    public Fuente_Alimentacion getFuenteAlimentacion()
    {
        return (Fuente_Alimentacion) this.componentesconf.get(7);
    }

    public void setComponente(int ind, Componente cmp)
    {
        this.componentesconf.set(ind, cmp);
        this.precioAcumulado += cmp.getPrecio();
        // System.out.println("\nse añade "+cmp+" "+cmp.getPrecio()+", precio actual "+getPrecioAcumulado()+"\n");
    }

    public void borraComponente(int ind, Componente cmp) {
        this.componentesconf.set(ind, null);
        this.precioAcumulado -= cmp.getPrecio();

        if (-2 < this.precioAcumulado && this.precioAcumulado <= 1) {
            precioAcumulado = 0;
        }
        //System.out.println("\nse quita "+cmp+" "+cmp.getPrecio()+", precio actual "+getPrecioAcumulado()+"\n");
    }

    public String toString()
    {
        return componentesconf.toString();
    }

    public SortedSet<Configuraciones> getPcs()
    {
        return pcs;
    }

    public void setPresupuesto(float presupuesto)
    {
        this.precioMax=presupuesto;
    }


    @Override
    public int compareTo(Configuraciones pisi) {
        return Math.round(this.precioAcumulado - pisi.precioAcumulado);
    }

    //-----------------------------Funciones implementadas para testing------------------------------------
    public List<String> Respuestas2Filtros(List<List<String>> respuestas)
    {
        List<String> filtros = new ArrayList<>();


        StringJoiner cadena = new StringJoiner(",", "", "");
        for (int i = 0; i < respuestas.size(); i++) {
            if (i == 0) {
                //Precio maximo
                cadena.add("precio<" + respuestas.get(i).get(0).toString());
                filtros.add(i, cadena.toString());
                cadena = new StringJoiner(",", "", "");
            }

            if (i == 1) {
                cadena.add("Usos=" + respuestas.get(1).get(0));

                for (int j = 1; j < respuestas.get(i).size(); j++) {
                    if (respuestas.get(i).get(j).compareTo("ofimatica") == 0) {
                        cadena.add("ofimatica");
                    }
                    if (respuestas.get(i).get(j).compareTo("gaming") == 0) {
                        cadena.add("gaming");
                    }
                    if (respuestas.get(i).get(j).compareTo("disenio") == 0) {
                        cadena.add("disenio");
                    }
                    if (respuestas.get(i).get(j).compareTo("edicion") == 0) {
                        cadena.add("edicion");
                    }
                }

                filtros.add(i, cadena.toString());
                cadena = new StringJoiner(",", "", "");
            }

            if (i == 2) {
                //Tama�o disco duro
                cadena.add("capacidad=" + respuestas.get(i).get(0).toString());
                filtros.add(i, cadena.toString());
                cadena = new StringJoiner(",", "", "");
            }

            if (i == 3) {
                //Tama�o caja/placa base
                cadena.add("Tamanio=" + respuestas.get(3).get(0));
                if (respuestas.get(i).contains("pequenio")) {
                    cadena.add("micro-atx");
                } else if (respuestas.get(i).contains("normal")) {
                    cadena.add("atx");
                } else if (respuestas.get(i).contains("indiferente")) {
                    cadena.add("atx || micro-atx");
                }

                filtros.add(i, cadena.toString());
                cadena = new StringJoiner(",", "", "");
            }
            if (i == 4) {
                cadena.add("SistemaOperativo=" + respuestas.get(4).get(0));

                filtros.add(i, cadena.toString());
                cadena = new StringJoiner(",", "", "");
            }

            if (i == 5) {
                cadena.add("Opcionales=" + respuestas.get(5).get(0));

                if (respuestas.get(i).contains("cds")) {
                    cadena.add("LectoraGrabadora");
                }

                if (respuestas.get(i).contains("tarjetared")) {
                    cadena.add("tarjetaRed");
                }
                if (respuestas.get(i).contains("tarjetasonido")) {
                    cadena.add("tarjetaSonido");
                }

                filtros.add(i, cadena.toString());
                cadena = new StringJoiner(",", "", "");
            }

            if (i == 6) {
                cadena.add("Iluminacion=" + respuestas.get(3).get(0));

                if (respuestas.get(i).contains("si")) {
                    cadena.add("true");
                } else {
                    cadena.add("false");
                }
                filtros.add(i, cadena.toString());
                cadena = new StringJoiner(",", "", "");
            }
        }

        return filtros;
    }


    public static void GenerarPCs(int comp, Configuraciones pc, List<List<Componente>> componentesfilt)
    {
        if (completo(pc))
        {
            //System.out.println("\nEl pc " + pc + " esta lleno, y se añade\n");
            Configuraciones pcaux = new Configuraciones(pc);
            pcs.add(pcaux);

        }
        else
        {
            List<Componente> lc = componentesfilt.get(comp);
            System.out.println(lc);
            for (int i = 0; i < lc.size(); i++) {
                Componente cmp = lc.get(i);
                System.out.println(pc.getComponentes());

                if (cmp.getCompatibilidad(pc))
                {
                    pc.setComponente(comp, cmp);

                    //System.out.println("Se añade el componente " + cmp.toString() + "\n" + pc.getComponentes() + "\n" + pc.getPrecioAcumulado());


                    GenerarPCs(comp + 1, pc, componentesfilt);
                }

                if (pc.getComponentes().get(comp) != null)
                {
                    pc.borraComponente(comp, pc.getComponentes().get(comp));
                }
            }
        }
    }



    private static boolean completo(Configuraciones pc)
    {
        return !pc.getComponentes().contains(null);
    }

    //--------------------------------Main para probar cosas----------------------------


}
