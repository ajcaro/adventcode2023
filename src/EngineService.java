import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EngineService {

	
	
	public void listarPartes(List<String> fichero) {
		
		for (String linea : fichero) {	
			String[] elementos = linea.split("\\.");					
			DebugService.listarFichero(elementos);
		}
	}
	
	public List<char[]> lineaToArrayChar(List<String> fichero) {
		
		List<char[]> caracteres = new ArrayList<>();
		
		for (String linea : fichero) {			
			caracteres.add(linea.toCharArray());			
		}
		
		return caracteres;
	}
	
}
