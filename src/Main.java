import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

		String filename = "resources/input.txt";
//		String filename = "resources/input_prod.txt";
		FicheroService lector = new FicheroService(filename);
		
		List<String> fichero = lector.listar();
		
		EngineService es = new EngineService();
		
		//es.listarPartes(fichero);
		List<char[]> caracteres = es.lineaToArrayChar(fichero);
		
			
		DebugService.listarFichero(caracteres);
		
	}



}
