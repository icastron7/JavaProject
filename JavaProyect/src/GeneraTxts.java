import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;

class Ingredientes
{
	String nombre;
	
}

class Preparacion
{
	String dificultad;
	String tiempoTotal;
	String elaboracion;
	String coccion;
	String reposo;
}


interface genSalida
{
	public void generaSalida(Path file, String texto, Path file2, String texto2);
}



public class GeneraTxts implements genSalida
{

	public static void main(String[] args) 
	{
		
		// Ingredientes e instrucciones

		Ingredientes ing1 = new Ingredientes();
		ing1.nombre = "Arroz bomba 1500g";
		
		Ingredientes ing2 = new Ingredientes();
		ing2.nombre = "1 pollo de corral";
		
		Ingredientes ing3 = new Ingredientes();
		ing3.nombre = "medio conejo";

		Ingredientes ing4 = new Ingredientes();
		ing4.nombre = "Judía verde plana 500g";

		Ingredientes ing5 = new Ingredientes();
		ing5.nombre = "Garrofó 500g";
		
		Ingredientes ing6 = new Ingredientes();
		ing6.nombre = "Alcachofa (opcional) 500g";
		
		Ingredientes ing7 = new Ingredientes();
		ing7.nombre ="Aceite de oliva virgen extra";
		
		Ingredientes ing8 = new Ingredientes();
		ing8.nombre ="Pimentón dulce";
		
		Ingredientes ing9 = new Ingredientes();
		ing9.nombre ="Tomate triturado";
		
		Ingredientes ing10 = new Ingredientes();
		ing10.nombre ="Azafran";
		
		Ingredientes ing11 = new Ingredientes();
		ing11.nombre ="Romero fresco y sal";
		
		String texto1 = ing1.nombre + "\n" + "\n" + ing2.nombre + "\n" + "\n" + ing3.nombre +
				ing4.nombre + "\n" + "\n" + ing5.nombre + "\n" + "\n" + ing6.nombre + "\n" + "\n" +
				ing7.nombre + "\n" + "\n" + ing8.nombre + "\n" + "\n" + ing9.nombre + "\n" + "\n" +
				ing10.nombre + "\n" + "\n";
		
		
		Preparacion prep = new Preparacion();
		prep.dificultad = "Dificultad: Media";
		prep.tiempoTotal = "Tiempo Total: 1h 25m";
		prep.elaboracion = "Elaboracion: 10m";
		prep.coccion = "Coccion: 1h 15m";
		prep.reposo = "Repooso: 5m";
		
		String texto2 = prep.dificultad + "\n" + "\n" + prep.tiempoTotal + "\n" + "\n" +
		prep.elaboracion + "\n" + "\n" + prep.coccion + "\n" + "\n" + prep.reposo + "\n" + "\n";
		
		
		String recetaIngredientes = "recetaIngredientes_salida.txt";
		Path camino1 = Paths.get(recetaIngredientes);
		String recetaInstrucciones = "recetaInstrucciones_salida.txt";
		Path camino2 = Paths.get(recetaInstrucciones);
		
		
	}
	
	public void generaSalida(Path camino1, String texto1, Path camino2, String texto2) 
	{
		try
        {
            Files.write(camino1, Collections.singleton(texto1) , StandardCharsets.UTF_8);
        }
        catch(IOException ep) 
		{
            System.out.println("Ocurrio un error");
            ep.printStackTrace();
        }
		try
        {
            Files.write(camino2, Collections.singleton(texto2) , StandardCharsets.UTF_8);
        }
        catch(IOException ep) 
		{
            System.out.println("Ocurrio un error");
            ep.printStackTrace();
        }		
		
	}
	
	

}
