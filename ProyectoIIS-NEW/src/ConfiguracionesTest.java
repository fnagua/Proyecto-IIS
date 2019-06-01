import Componentes.*;

import java.util.*;

import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

class ConfiguracionesTest {




    @org.junit.jupiter.api.Test
    void respuestas2Filtros() {
        String[] uso = {"ofimatica", "gaming", "disenio", "edicion"};
        String[] capacidad = {"250GB", "500GB", "1TB", "2TB", "4TB"};
        String[] tamanio = {"pequeño", "normal", "indiferente"};
        String[] so = {"windows", "linux", "otros"};
        String[] opcionales = {"cds", "tarjetared", "tarjetasonido"};
        String[] iluminacion = {"si", "no"};

        Configuraciones cps = new Configuraciones(200);
        List<List<String>> respuesta = new LinkedList<>();
        List<String> filtros = new LinkedList<>();
        List<String> aux = new LinkedList<>();


        numero(respuesta);
        varias(respuesta, uso);
        una(respuesta, capacidad);
        una(respuesta, tamanio);
        una(respuesta, so);
        varias(respuesta, opcionales);
        una(respuesta, iluminacion);

        filtros = cps.Respuestas2Filtros(respuesta);


        System.out.println("RESPUESTAS(Entrada):");
        for (int i=0; i<respuesta.size(); i++)
        {  //todos los filtros tienen que ser no nulos
            aux = respuesta.get(i);

            for (int j=0; j<aux.size(); j++) {  //todos los filtros tienen que ser no nulos
                System.out.print(aux.get(j)+"\t");
            }
            System.out.print("\n");

        }


       // filtros = cps.Respuestas2Filtros(respuesta);

        /**/
        System.out.println("\n\n");
        /**/

        System.out.println("FILTROS(salida):");
        for (int i=0; i<filtros.size(); i++)
        {
            System.out.println(filtros.get(i)+"\t");
            assertNotNull(filtros.get(i));
        }

    }

    @org.junit.jupiter.api.Test
    void GeneraPCs() {
        Random r = new Random();


        Componente comp = mock(Componente.class);
        when (comp.obtenerComponentes()).thenReturn(mockingComponents());

        Configuraciones cc;


        cc = new Configuraciones(r.nextInt(2000)+134);
        cc.GenerarPCs(0,new Configuraciones(), comp.obtenerComponentes());

        assertNotNull(cc.getPcs());     //lista de configuraciones

        //-------------------------

        cc.setPresupuesto((float)0);
        System.out.println(cc.getPrecioMax());


        cc.GenerarPCs(0,new Configuraciones(), comp.obtenerComponentes());
        SortedSet<Configuraciones> vacio = new TreeSet<>();
        cc.pcs = new TreeSet<>();

        System.out.println(vacio+" "+cc.getPcs());



        assertEquals(cc.getPcs(), vacio);


    }

    private void  numero(List<List<String>> l) {
        List<String> aux = new LinkedList<String>();
        Random r = new Random();
        int aleatorio;

        aleatorio = r.nextInt(4000);
        aux.add(Integer.toString(aleatorio));

        l.add(aux);
    }       //respuestas2Filtros

    private void varias(List<List<String>> l, String[] s) {
        List<String> aux = new LinkedList<String>();
        Random r = new Random();
        int aleatorio;

        for (int i=0; i<s.length; i++) {
            if (r.nextBoolean()) {
                aux.add(s[i]);
            }
        }

        if (aux.isEmpty()) {
            aleatorio = r.nextInt(s.length);
            aux.add(s[aleatorio]);
        }

        l.add(aux);
    }       //respuestas2Filtros

    private void una(List<List<String>> l, String[] s) {
        List<String> aux = new LinkedList<String>();
        Random r = new Random();
        int aleatorio;

        aleatorio = r.nextInt(s.length);
        aux.add(s[aleatorio]);
        l.add(aux);
    }       //respuestas2Filtros

    private List<List<Componente>> mockingComponents () {
        List<List<Componente>> componentesfilt = new LinkedList<>();
        for (int i = 0; i < 4; i++) {
            componentesfilt.add(null);
        }

        //cpus
        CPU cpu0 = new CPU("Intel Core i5-8400", (float) 193.99, "LGA1151", 2666, 42);
        CPU cpu1 = new CPU("Intel Core i3-8100", (float) 120.99, "LGA1151", 2400, 65);
        CPU cpu2 = new CPU("Intel Core i7-7700", (float) 314.99, "LGA1151", 2400, 65);
        CPU cpu3 = new CPU("Intel Pentium G4560", (float) 62.99, "LGA1151", 2400, 54);
        CPU cpu4 = new CPU("Intel Core i7-8700K", (float) 379.90, "LGA1151", 2666, 95);
        CPU cpu5 = new CPU("Intel Core i5-8700K", (float) 262.99, "LGA1151", 2666, 95);
        CPU cpu6 = new CPU("Intel Celereon G4920", (float) 59.99, "LGA1151", 2400, 54);
        CPU cpu7 = new CPU("AMD Ryzen 3", (float) 92.99, "AM4", 2666, 65);
        CPU cpu8 = new CPU("AMD Ryzen 5 1600X", (float) 139.90, "AM4", 2400, 95);
        CPU cpu9 = new CPU("AMD Ryzen 7 2700", (float) 230.99, "AM4", 2993, 100);
        CPU cpu10 = new CPU("AMD A6-9500 3", (float) 50.99, "AM4", 2400, 35);
        CPU cpu11 = new CPU("AMD Athlon 240GE", (float) 71.99, "AM4", 2667, 43);
        CPU cpu12 = new CPU("AMD A12-9800E", (float) 104.99, "AM4", 2400, 51);


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


        componentesfilt.set(0, lcpu);


        //Ram
        RAM ram0 = new RAM("G.Skill Trident Z RGB", 129, 16, 3200, 6);
        RAM ram1 = new RAM("Corsair Vengeance LPX", (float) 94.99, 16, 3000, 4);
        RAM ram2 = new RAM("Corsair Vengeance LPX", 188, 32, 3200, 6);
        RAM ram3 = new RAM("Corsair Vengeance RGB Pro", 249, 32, 3200, 6);
        RAM ram4 = new RAM("G.Skill Ripjaws V Red", 399, 64, 3200, 7);
        RAM ram5 = new RAM("G.Skill Trident Z RGB", 849, 64, 3200, 8);
        RAM ram6 = new RAM("G.Skill Trident Z RGB", 699, 64, 3333, 8);
        RAM ram7 = new RAM("Kingston HyperX Fury Black", 49, 32, 2400, 3);
        RAM ram8 = new RAM("HyperX Predator", 199, 16, 4000, 5);
        RAM ram9 = new RAM("G.Skill Aegis", (float) 29.99, 4, 2133, 3);
        RAM ram10 = new RAM("Crucial 2400 PC4-19200 4GB CL17", (float) 28.3, 4, 2400, 3);
        RAM ram11 = new RAM("Crucial 2400 PC4-19200 8GB CL17", 45, 8, 2400, 3);
        RAM ram12 = new RAM("HyperX Predator RGB", 99, 8, 4000, 4);


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


        componentesfilt.set(1, lram);


        //Placa base //nombre-socket-frecuencia-tamaño-precio
        PlacaBase pb0 = new PlacaBase("Gigabyte GA-B360M DS3H", "LGA1151", 2666, "MicroATX", (float) 71.99, 6);
        PlacaBase pb1 = new PlacaBase("Gigabyte B450M DS3H", "AM4", 2993, "MicroATX", (float) 67.99, 6);
        PlacaBase pb2 = new PlacaBase("Gigabyte Z390 Gaming X", "LGA1151", 2666, "ATX", (float) 140.99, 8);
        PlacaBase pb3 = new PlacaBase("Asus Prime B250M-A", "LGA1151", 2400, "MicroATX", (float) 63.99, 10);
        PlacaBase pb4 = new PlacaBase("Asus Prime B360M-A", "LGA1151", 2666, "MicroATX", (float) 80, 6);
        PlacaBase pb5 = new PlacaBase("MSI,Z370-A PRO", "LGA1151", 2666, "ATX", (float) 104.90, 10);
        PlacaBase pb6 = new PlacaBase("MSI X470 GAMING PLUS", "AM4", 3466, "ATX", (float) 134.90, 10);
        PlacaBase pb7 = new PlacaBase("Asus,Prime B450M-A", "AM4", 2666, "MicroATX", (float) 69.99, 5);
        PlacaBase pb8 = new PlacaBase("Gigabyte GA-H110M-S2H", "LGA1151", 2133, "MicroATX", (float) 50.99, 8);
        PlacaBase pb9 = new PlacaBase("MSI,B360M Bazooka", "LGA1151", 2666, "ATX", (float) 84.99, 6);
        PlacaBase pb10 = new PlacaBase("MSI MPG Z390 Carbon", "LGA1151", 2666, "ATX", (float) 204.90, 8);
        PlacaBase pb11 = new PlacaBase("Gigabyte X299 UD4 Pro", "LGA2066", 2666, "ATX", (float) 243.00, 15);
        PlacaBase pb12 = new PlacaBase("MSI Meg Z390 Ace", "LGA1151", 2666, "ATX", (float) 284.90, 8);
        PlacaBase pb13 = new PlacaBase("MSI,Z390-A PRO", "LGA1151", 2666, "ATX", (float) 129.90, 10);
        PlacaBase pb14 = new PlacaBase("Asrock H110 Pro BTC+", "LGA1151", 2400, "ATX", (float) 34.99, 5);

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


        componentesfilt.set(2, lpb);
        // System.out.println(componentes);

        //Placa base //nombre-socket-frecuencia-tamaño-precio
        Carcasa cc1 = new Carcasa("Tempest Spectra ATX", "ATX", (float) 1, 1, (float) 34.99, 0);
        Carcasa cc2 = new Carcasa("Sample MicroATX", "MicroATX", (float) 1, 1, (float) 19.99, 0);
        Carcasa cc3 = new Carcasa("Sample2 ATX", "ATX", (float) 1, 1, (float) 22.99, 0);
        Carcasa cc4 = new Carcasa("HighQuality ATX", "ATX", (float) 1, 1, (float) 200.99, 0);
        Carcasa cc5 = new Carcasa("LowQuality ATX", "ATX", (float) 1, 1, (float) 10.99, 0);
        Carcasa cc6 = new Carcasa("HQuality MicroATX", "MicroATX", (float) 1, 1, (float) 40.99, 0);
        Carcasa cc7 = new Carcasa("Regular MicroATX", "MicroATX", (float) 1, 1, (float) 15.99, 0);

        List<Componente> lcc = new ArrayList<>();
        lcc.add(cc1);
        lcc.add(cc2);
        lcc.add(cc3);
        lcc.add(cc4);
        lcc.add(cc5);
        lcc.add(cc6);
        lcc.add(cc7);

        componentesfilt.set(3, lcc);

        return componentesfilt;
    }
}




/*
List<List<String>>

0   precio
1   uso                 (ofimatica, gaming, disenio, edicion)   varias
2   capacidad DD        (250GB, 500GB, 1TB, 2TB, 4TB)           una
3   tamaño caja         (pequeño, mediano, indiferente)         una
4   SO                  (windows, linux, otros)                 una
5   opcionales          (cds, tarjetared, tarjetasonido)        varias
6   iluminacion         (si, no)                                una

 */

/*
List<List<Componente>>






 */