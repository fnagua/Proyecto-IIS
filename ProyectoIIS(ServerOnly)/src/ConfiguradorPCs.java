import Componentes.Componente;

import java.util.*;

public class ConfiguradorPCs
{

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

}
