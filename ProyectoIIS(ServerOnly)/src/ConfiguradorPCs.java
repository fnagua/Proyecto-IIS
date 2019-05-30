import Componentes.Componente;

import java.util.List;

public class ConfiguradorPCs
{
    List<Componente>[] piezas;
    
    public List<String> Respuestas2Filtros(List<List<String>> respuestas)
    {
    	private List<String> filtros = new ArrayList<>();
    	
    
		StringJoiner cadena=new StringJoiner(",","","");
		for(int i=0;i<respuestas.size();i++){
			if(i==0)
			{//Precio maximo
				cadena.add("precio<"+respuestas.get(i).get(0).toString());
				filtros.add(i, cadena.toString());
				cadena.setEmptyValue(null);
			}
			if(i==1)
			{
				for(int j=0;j<respuestas.get(i).size();j++){
					cadena.add("Usos=");
					if(respuestas.get(i).get(j).compareTo("ofimatica")==0){
						cadena.add("ofimatica");
					}
					if(respuestas.get(i).get(j).compareTo("gaming")==0){
						cadena.add("gaming");
					}
					if(respuestas.get(i).get(j).compareTo("disenio")==0){
						cadena.add("disenio");
					}
					if(respuestas.get(i).get(j).compareTo("edicion")==0){
						cadena.add("edicion");
					}
				}
							
				filtros.add(i,cadena.toString());
				cadena.setEmptyValue(null);
			}
			if(i==2)
			{//Tamaño disco duro
				cadena.add("tamanio>"+respuestas.get(i).get(0).toString());
				filtros.add(i,cadena.toString());
				cadena.setEmptyValue(null); 
			}
			if(i==3)
			{//Tamaño caja/placa base
				cadena.add("Tamanio=");
				if(respuestas.get(i).contains("pequenio")){
					cadena.add("micro-atx");
				}else if(respuestas.get(i).contains("normal")){
					cadena.add("atx");
				}else if(respuestas.get(i).contains("indiferente")){
					cadena.add("atx || micro-atx");
				}
				filtros.add(i,cadena.toString());
				cadena.setEmptyValue(null);
			}
			if(i==4)
			{
				cadena.add("SistemaOperativo=");
				if(respuestas.get(i).contains("windows")){
					
				}else if(respuestas.get(i).contains("linux")){
					
				}else if(respuestas.get(i).contains("otros")){
					
				}
				filtros.add(i, cadena.toString());
				cadena.setEmptyValue(null);
			}
			if(i==5)
			{
				cadena.add("Opcionales=");
				if(respuestas.get(i).contains("cds")){
					cadena.add("LectoraGrabadora");
				}
				if(respuestas.get(i).contains("tarjetared")){
					cadena.add("tarjetaRed");
				}
				if(respuestas.get(i).contains("tarjetasonido")){
					cadena.add("tarjetaSonido");
				}
				filtros.add(i, cadena.toString());
				cadena.setEmptyValue(null);
			}
			if(i==6)
			{
				cadena.add("Iluminacion=");
				if(respuestas.get(i).contains("si")){
					cadena.add("true");
				}else{
					cadena.add("false");
				}
				filtros.add(i, cadena.toString());
				cadena.setEmptyValue(null);
			}
		}
		return filtros;
    }
}
