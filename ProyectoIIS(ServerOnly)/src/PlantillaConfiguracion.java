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
        CPU cpu1 = new CPU("Intel i3 8100", (float)120.99, "LGA1151", 2400, "DDR4",65);
        CPU cpu2 = new CPU("AMD ryzen 5 1600X", (float)130.99, "AM4", 2400, "DDR4",95);

        List<Componente> lcpu = new ArrayList<>();
        lcpu.add(cpu1);
        lcpu.add(cpu2);

        componentes.set(0,lcpu);



        //Ram
        RAM ram1 = new RAM("Corsair venegance LPX", (float)94.99 , 16, 3000, 4);
        RAM ram2 = new RAM("G.skill Trident Z", 129, 16, 3200, 5);

        List<Componente> lram = new ArrayList<>();
        lram.add(ram1);
        lram.add(ram2);

        componentes.set(1,lram);



        //Placa base //nombre-socket-frecuencia-tamaño-precio
        PlacaBase pb1 = new PlacaBase("Gigabyte Z390 Gaming", "LGA1151" , 2666, "ATX", (float)140.99, 6);
        PlacaBase pb2 = new PlacaBase("MSI X470 Gaming plus", "AM4", 3466, "ATX", (float)134.90,  30);

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










