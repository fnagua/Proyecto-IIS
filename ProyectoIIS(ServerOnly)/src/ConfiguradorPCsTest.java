import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ConfiguradorPCsTest {

    @org.junit.jupiter.api.Test
    void respuestas2Filtros() {
        String[] uso = {"ofimatica", "gaming", "disenio", "edicion"};
        String[] capacidad = {"250GB", "500GB", "1TB", "2TB", "4TB"};
        String[] tamanio = {"pequeño", "mediano", "indiferente"};
        String[] so = {"windows", "linux", "otros"};
        String[] opcionales = {"cds", "tarjetared", "tarjetasonido"};
        String[] iluminacion = {"si", "no"};

        ConfiguradorPCs cps = new ConfiguradorPCs();
        List<List<String>> respuesta = new LinkedList<List<String>>();
        List<String> filtros = new LinkedList<String>();
        List<String> aux = new LinkedList<String>();


        numero(respuesta);
        varias(respuesta, uso);
        una(respuesta, capacidad);
        una(respuesta, tamanio);
        una(respuesta, so);
        varias(respuesta, opcionales);
        una(respuesta, iluminacion);

        filtros = cps.Respuestas2Filtros(respuesta);


        System.out.println("RESPUESTAS:");
        for (int i=0; i<respuesta.size(); i++) {  //todos los filtros tienen que ser no nulos
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

        System.out.println("FILTROS:");
        for (int i=0; i<filtros.size(); i++) {
            System.out.print(filtros.get(i)+"\t");
            assertNotNull(filtros.get(i));
        }

    }

    private void  numero(List<List<String>> l) {
        List<String> aux = new LinkedList<String>();
        Random r = new Random();
        int aleatorio;

        aleatorio = r.nextInt(4000);
        aux.add(Integer.toString(aleatorio));

        l.add(aux);
    }

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
    }

    private void una(List<List<String>> l, String[] s) {
        List<String> aux = new LinkedList<String>();
        Random r = new Random();
        int aleatorio;

        aleatorio = r.nextInt(s.length);
        aux.add(s[aleatorio]);
        l.add(aux);
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