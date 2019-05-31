import Componentes.*;

import java.util.ArrayList;
import java.util.List;
//0-CPU   1-RAM   2-PlacaBase   3-Grafica   4-DiscoDuro   5-Carcasa    6-TarjetaRed    7-FuenteAlimentacion
public class PlantillaConfiguracion
{
    private static List<List<Componente>> componentes = new ArrayList<>();
    private static List<PC> pcs = new ArrayList<>();


    public static void main(String[] args)
    {
        for (int i=0;i<8;i++)
        {
            componentes.add(null);
        }
        //cpus
        CPU cpu0 = new CPU("Intel Core i5-8400","LGA1151",2666,"DDR4",193.99,42);
        CPU cpu1 = new CPU("Intel Core i3-8100","LGA1151",2400,"DDR4",120.99,65);
        CPU cpu2 = new CPU("Intel Core i7-7700","LGA1151",2400,"DDR4",314.90,65);
        CPU cpu3 = new CPU("Intel Pentium G4560","LGA1151",2400,"DDR4",62.99,54);
        CPU cpu4 = new CPU("Intel Core i7-8700K","LGA1151",2666,"DDR4",379.90,95);
        CPU cpu5 = new CPU("Intel Core i5-8700K","LGA1151",2666,"DDR4",263,99,95);
        CPU cpu6 = new CPU("Intel Celereon G4920","LGA1151",2400,"DDR4",59.99,54);
        CPU cpu7 = new CPU("AMD Ryzen 3","AM4","2666","DDR4",92.99,65);
        CPU cpu8 = new CPU("AMD Ryzen 5 1600X","AM4",2400,"DDR4",139.90,95);
        CPU cpu9 = new CPU("AMD Ryzen 7 2700","AM4",2993,"DDR4",230.99,100);
        CPU cpu10 = new CPU("AMD A6-9500 3","AM4",2400,"DDR4",50.99,35);
        CPU cpu11 = new CPU("AMD Athlon 240GE","AM4",2667,"DDR4",71.99,43);
        CPU cpu12 = new CPU("AMD A12-9800E","AM4",2400,"DDR4",104.99,51);


        List<Componente> lcpu = new ArrayList<>();
        lcpu.add(cpu1);
        lcpu.add(cpu2);

        componentes.set(0,lcpu);



        //Ram
        RAM ram0 = new RAM("G.Skill Trident Z RGB",16,3200,129,6);
        RAM ram1 = new RAM("Corsair Vengeance LPX",16,3000,94.99,4);
        RAM ram2 = new RAM("Corsair Vengeance LPX",32,3200,188,6);
        RAM ram3 = new RAM("Corsair Vengeance RGB Pro",32,3200,249,6);
        RAM ram4 = new RAM("G.Skill Ripjaws V Red",64,2400,399,7);
        RAM ram5 = new RAM("G.Skill Trident Z RGB",64,3200,849,8);
        RAM ram6 = new RAM("G.Skill Trident Z RGB",64,3333,699,8);
        RAM ram7 = new RAM("Kingston HyperX Fury Black",8,2400,49,3);
        RAM ram8 = new RAM("HyperX Predator",16,4000,199,5);
        RAM ram9 = new RAM("G.Skill Aegis",4,2133,29.99,3);
        RAM ram10 = new RAM("Crucial 2400 PC4-19200 4GB CL17",4,2400,26,28,3);
        RAM ram11 = new RAM("Crucial 2400 PC4-19200 8GB CL17",8,2400,45,3);
        RAM ram12 = new RAM("HyperX Predator RGB",8,4000,99,4);

        List<Componente> lram = new ArrayList<>();
        lram.add(ram1);
        lram.add(ram2);

        componentes.set(1,lram);



        //Placa base //nombre-socket-frecuencia-tamaño-precio
        PlacaBase pb0 = new PlacaBase("Gigabyte GA-B360M DS3H","LGA1151",2666,"MicroATX",71.99,6);
        PlacaBase pb1 = new PlacaBase("Gigabyte B450M DS3H","AM4",2993,"MicroATX",67.99,6);
        PlacaBase pb2 = new PlacaBase("Gigabyte Z390 Gaming X","LGA1151",2666,"ATX",140.99,8);
        PlacaBase pb3 = new PlacaBase("Asus Prime B250M-A","LGA1151",2400,"MicroATX",63.99,10);
        PlacaBase pb4 = new PlacaBase("Asus Prime B360M-A","LGA1151",2666,"MicroATX",80,6);
        PlacaBase pb5 = new PlacaBase("MSI,Z370-A PRO","LGA1151",2666,"ATX",104.90,10);
        PlacaBase pb6 = new PlacaBase("MSI,X470 GAMING PLUS","AM4",3466,"ATX",134.90,10);
        PlacaBase pb7 = new PlacaBase("Asus,Prime B450M-A","AM4","MicroATX",69.99,6);
        PlacaBase pb8 = new PlacaBase("Gigabyte GA-H110M-S2H","H110",2133,32,"MicroATX",50.99,8);
        PlacaBase pb9 = new PlacaBase("MSI,B360M Bazooka","LGA1151",2666,"ATX",84.99,6);
        PlacaBase pb10 = new PlacaBase("MSI MPG Z390 Carbon","LGA1151",2666,"ATX",204.90,8);
        PlacaBase pb11 = new PlacaBase("Gigabyte X299 UD4 Pro","LGA2066",2666,"ATX",243.00,15);
        PlacaBase pb12 = new PlacaBase("MSI Meg Z390 Ace","LGA1151",2666,"ATX",284.90,8);
        PlacaBase pb13 = new PlacaBase("MSI,Z390-A PRO","LGA1151",2666,"ATX",129.90,10);
        PlacaBase pb14 = new PlacaBase("Asrock H110 Pro BTC+","LGA1151",2400,"ATX",34.99,5);
        
        List<Componente> lpb = new ArrayList<>();
        lpb.add(pb1);
        lpb.add(pb2);

        componentes.set(2,lpb);
       // System.out.println(componentes);

        configuraPCs(0, new PC(800));



    }

    public static void configuraPCs(int comp, PC pc) {
        if (completo(pc)) {
            pcs.add(pc);

        }

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

                if (comp + 1 < 3) //este if solo vale para probar, ya que solo tengo 3 componentes, cuando esten los 8 implementados para la prueba se borra
                {
                    configuraPCs(comp + 1, pc);
                }
            }

            System.out.println(pc.getComponentes());
            System.out.println(pc.getComponentes().get(comp));

            if (pc.getComponentes().get(comp)!=null)
            {
                pc.borraComponente(comp, pc.getComponentes().get(comp));
            }
        }
    }
    private static boolean completo(PC pc)
    {
        return pc.getComponentes().size() == 8;
    }

}










