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

        Random r = new Random();
        List<List<String>> respuesta = new LinkedList<List<String>>();
        List<String> filtros = new LinkedList<String>();
        List<String> aux = new LinkedList<String>();
        int aleatorio;

        /**/

        for (int i=0; i<uso.length; i++) {
            if (r.nextBoolean()) {
                aux.add(uso[i]);
                System.out.print(uso[i]+"\t");
            }
        }

        if (aux.isEmpty()) {
            aleatorio = r.nextInt(uso.length);
            aux.add(uso[aleatorio]);
            System.out.print(uso[aleatorio]+"\t");
        }

        respuesta.add(aux);

        /**/
        aux.clear();
        System.out.print("\n");
        /**/

        aleatorio = r.nextInt(capacidad.length);
        aux.add(capacidad[aleatorio]);
        System.out.print(capacidad[aleatorio]+"\t");
        respuesta.add(aux);

        /**/
        aux.clear();
        System.out.print("\n");
        /**/

        aleatorio = r.nextInt(tamanio.length);
        aux.add(tamanio[aleatorio]);
        System.out.print(tamanio[aleatorio]+"\t");
        respuesta.add(aux);

        /**/
        aux.clear();
        System.out.print("\n");
        /**/

        aleatorio = r.nextInt(so.length);
        aux.add(so[aleatorio]);
        System.out.print(so[aleatorio]+"\t");
        respuesta.add(aux);

        /**/
        aux.clear();
        System.out.print("\n");
        /**/

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