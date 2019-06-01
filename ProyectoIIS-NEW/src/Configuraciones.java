import Componentes.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringJoiner;

public class Configuraciones
{
    public static List<List<Componente>> componentes = new LinkedList<>();
    public static List<PC> pcs = new LinkedList<>();
    public List<String> Respuestas2Filtros(List<List<String>> respuestas)
    {
        List<String> filtros = new ArrayList<>();


        StringJoiner cadena=new StringJoiner(",","","");
        for(int i=0;i<respuestas.size();i++)
        {
            if(i==0)
            {
                //Precio maximo
                cadena.add("precio<"+respuestas.get(i).get(0).toString());
                filtros.add(i, cadena.toString());
                cadena= new StringJoiner(",","","");
            }

            if(i==1)
            {
                cadena.add("Usos="+respuestas.get(1).get(0));

                for(int j=1;j<respuestas.get(i).size();j++)
                {
                    if(respuestas.get(i).get(j).compareTo("ofimatica")==0)
                    {
                        cadena.add("ofimatica");
                    }
                    if(respuestas.get(i).get(j).compareTo("gaming")==0)
                    {
                        cadena.add("gaming");
                    }
                    if(respuestas.get(i).get(j).compareTo("disenio")==0)
                    {
                        cadena.add("disenio");
                    }
                    if(respuestas.get(i).get(j).compareTo("edicion")==0)
                    {
                        cadena.add("edicion");
                    }
                }

                filtros.add(i,cadena.toString());
                cadena= new StringJoiner(",","","");
            }

            if(i==2)
            {
                //Tama�o disco duro
                cadena.add("capacidad="+respuestas.get(i).get(0).toString());
                filtros.add(i,cadena.toString());
                cadena= new StringJoiner(",","","");
            }

            if(i==3)
            {
                //Tama�o caja/placa base
                cadena.add("Tamanio="+respuestas.get(3).get(0));
                if(respuestas.get(i).contains("pequenio"))
                {
                    cadena.add("micro-atx");
                }
                else if(respuestas.get(i).contains("normal"))
                {
                    cadena.add("atx");
                }
                else if(respuestas.get(i).contains("indiferente"))
                {
                    cadena.add("atx || micro-atx");
                }

                filtros.add(i,cadena.toString());
                cadena= new StringJoiner(",","","");
            }
            if(i==4)
            {
                cadena.add("SistemaOperativo="+respuestas.get(4).get(0));

                filtros.add(i, cadena.toString());
                cadena= new StringJoiner(",","","");
            }

            if(i==5)
            {
                cadena.add("Opcionales="+respuestas.get(5).get(0));

                if(respuestas.get(i).contains("cds"))
                {
                    cadena.add("LectoraGrabadora");
                }

                if(respuestas.get(i).contains("tarjetared"))
                {
                    cadena.add("tarjetaRed");
                }
                if(respuestas.get(i).contains("tarjetasonido"))
                {
                    cadena.add("tarjetaSonido");
                }

                filtros.add(i, cadena.toString());
                cadena= new StringJoiner(",","","");
            }

            if(i==6)
            {
                cadena.add("Iluminacion="+respuestas.get(3).get(0));

                if(respuestas.get(i).contains("si"))
                {
                    cadena.add("true");
                }

                else
                {
                    cadena.add("false");
                }
                filtros.add(i, cadena.toString());
                cadena= new StringJoiner(",","","");
            }
        }

        return filtros;
    }

    public static void main(String[] args)
    {
        for (int i=0;i<4;i++)
        {
            componentes.add(null);
        }

        //cpus
        CPU cpu0 = new CPU("Intel Core i5-8400",(float)193.99,"LGA1151",2666,42);
        CPU cpu1 = new CPU("Intel Core i3-8100",(float)120.99,"LGA1151",2400,65);
        CPU cpu2 = new CPU("Intel Core i7-7700",(float)314.99,"LGA1151",2400,65);
        CPU cpu3 = new CPU("Intel Pentium G4560",(float) 62.99, "LGA1151",2400,54);
        CPU cpu4 = new CPU("Intel Core i7-8700K",(float)379.90,"LGA1151",2666,95);
        CPU cpu5 = new CPU("Intel Core i5-8700K",(float)262.99,"LGA1151",2666,95);
        CPU cpu6 = new CPU("Intel Celereon G4920",(float)59.99,"LGA1151",2400,54);
        CPU cpu7 = new CPU("AMD Ryzen 3",(float)92.99,"AM4",2666,65);
        CPU cpu8 = new CPU("AMD Ryzen 5 1600X",(float) 139.90, "AM4",2400,95);
        CPU cpu9 = new CPU("AMD Ryzen 7 2700",(float) 230.99,"AM4",2993,100);
        CPU cpu10 = new CPU("AMD A6-9500 3",(float) 50.99,"AM4",2400,35);
        CPU cpu11 = new CPU("AMD Athlon 240GE",(float)71.99,"AM4",2667,43);
        CPU cpu12 = new CPU("AMD A12-9800E",(float)104.99,"AM4",2400,51);


        List<Componente> lcpu = new ArrayList<>();
        lcpu.add(cpu1);
        lcpu.add(cpu2);
        lcpu.add(cpu3);
        lcpu.add(cpu4);
        lcpu.add(cpu5);
        lcpu.add(cpu6);
        lcpu.add(cpu7);
        lcpu.add(cpu8);
        lcpu.add(cpu9);
        lcpu.add(cpu10);
        lcpu.add(cpu11);
        lcpu.add(cpu12);



        componentes.set(0,lcpu);



        //Ram
        RAM ram0 = new RAM("G.Skill Trident Z RGB",129,16,3200,6);
        RAM ram1 = new RAM("Corsair Vengeance LPX",(float)94.99,16,3000,4);
        RAM ram2 = new RAM("Corsair Vengeance LPX",188,32,3200,6);
        RAM ram3 = new RAM("Corsair Vengeance RGB Pro",249,32,3200,6);
        RAM ram4 = new RAM("G.Skill Ripjaws V Red",399,64,3200,7);
        RAM ram5 = new RAM("G.Skill Trident Z RGB",849,64,3200,8);
        RAM ram6 = new RAM("G.Skill Trident Z RGB",699,64,3333,8);
        RAM ram7 = new RAM("Kingston HyperX Fury Black",49,32,2400,3);
        RAM ram8 = new RAM("HyperX Predator",199,16,4000,5);
        RAM ram9 = new RAM("G.Skill Aegis",(float)29.99,4,2133,3);
        RAM ram10 = new RAM("Crucial 2400 PC4-19200 4GB CL17",(float)28.3,4,2400,3);
        RAM ram11 = new RAM("Crucial 2400 PC4-19200 8GB CL17",45,8,2400,3);
        RAM ram12 = new RAM("HyperX Predator RGB",99,8,4000,4);



        List<Componente> lram = new ArrayList<>();
        lram.add(ram1);
        lram.add(ram2);
        lram.add(ram3);
        lram.add(ram4);
        lram.add(ram5);
        lram.add(ram6);
        lram.add(ram7);
        lram.add(ram8);
        lram.add(ram9);
        lram.add(ram10);
        lram.add(ram11);
        lram.add(ram12);



        componentes.set(1,lram);



        //Placa base //nombre-socket-frecuencia-tamaño-precio
        PlacaBase pb0 = new PlacaBase("Gigabyte GA-B360M DS3H","LGA1151",2666,"MicroATX",(float)71.99,6);
        PlacaBase pb1 = new PlacaBase("Gigabyte B450M DS3H","AM4",2993,"MicroATX",(float)67.99,6);
        PlacaBase pb2 = new PlacaBase("Gigabyte Z390 Gaming X","LGA1151",2666,"ATX",(float)140.99,8);
        PlacaBase pb3 = new PlacaBase("Asus Prime B250M-A","LGA1151",2400,"MicroATX",(float)63.99,10);
        PlacaBase pb4 = new PlacaBase("Asus Prime B360M-A","LGA1151",2666,"MicroATX",(float)80,6);
        PlacaBase pb5 = new PlacaBase("MSI,Z370-A PRO","LGA1151",2666,"ATX",(float)104.90,10);
        PlacaBase pb6 = new PlacaBase("MSI X470 GAMING PLUS","AM4",3466,"ATX",(float)134.90,10);
        PlacaBase pb7 = new PlacaBase("Asus,Prime B450M-A","AM4",2666,"MicroATX",(float)69.99, 5);
        PlacaBase pb8 = new PlacaBase("Gigabyte GA-H110M-S2H","LGA1151",2133,"MicroATX", (float)50.99,8);
        PlacaBase pb9 = new PlacaBase("MSI,B360M Bazooka","LGA1151",2666,"ATX",(float)84.99,6);
        PlacaBase pb10 = new PlacaBase("MSI MPG Z390 Carbon","LGA1151",2666,"ATX",(float)204.90,8);
        PlacaBase pb11 = new PlacaBase("Gigabyte X299 UD4 Pro","LGA2066",2666,"ATX",(float)243.00,15);
        PlacaBase pb12 = new PlacaBase("MSI Meg Z390 Ace","LGA1151",2666,"ATX",(float)284.90,8);
        PlacaBase pb13 = new PlacaBase("MSI,Z390-A PRO","LGA1151",2666,"ATX",(float)129.90,10);
        PlacaBase pb14 = new PlacaBase("Asrock H110 Pro BTC+","LGA1151",2400,"ATX",(float)34.99,5);

        List<Componente> lpb = new ArrayList<>();
        lpb.add(pb1);
        lpb.add(pb2);
        lpb.add(pb3);
        lpb.add(pb4);
        lpb.add(pb5);
        lpb.add(pb6);
        lpb.add(pb7);
        lpb.add(pb8);
        lpb.add(pb9);
        lpb.add(pb10);
        lpb.add(pb11);
        lpb.add(pb12);
        lpb.add(pb13);
        lpb.add(pb14);






        componentes.set(2,lpb);
        // System.out.println(componentes);


        //Placa base //nombre-socket-frecuencia-tamaño-precio
        Carcasa cc1 = new Carcasa("Tempest Spectra ATX", "ATX" , (float) 1, 1, (float) 34.99, 0);

        List<Componente> lcc = new ArrayList<>();
        lcc.add(cc1);

        componentes.set(3,lcc);

        configuraPCs(0, new PC(20000));

        System.out.println("PCs configurados: "+pcs+"\nNumero de pcs configurados: "+pcs.size());



    }

    public static void configuraPCs(int comp, PC pc)
    {
        if (completo(pc))
        {
            System.out.println("\nEl pc "+pc+" esta lleno, y se añade\n");
            PC pcaux = new PC(pc);
            pcs.add(pcaux);

        }
        else
        {
            List<Componente> lc = componentes.get(comp);
            System.out.println(lc);
            for (int i = 0; i < lc.size(); i++)
            {
                Componente cmp = lc.get(i);
                System.out.println(pc.getComponentes());

                if (cmp.getCompatibilidad(pc))
                {
                    pc.setComponente(comp, cmp);

                    System.out.println("Se añade el componente " + cmp.toString() + "\n" + pc.getComponentes() + "\n" + pc.getPrecioAcumulado());


                    configuraPCs(comp + 1, pc);
                }

                if (pc.getComponentes().get(comp)!=null)
                {
                    pc.borraComponente(comp, pc.getComponentes().get(comp));
                }
            }
        }
    }

    private static boolean completo(PC pc)
    {
        return !pc.getComponentes().contains(null);
    }

}
