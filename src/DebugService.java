import java.util.Collection;
import java.util.List;

public class DebugService {

	
	
	public static void listarArray(Collection<Integer> numeros) {
		for (Integer numero : numeros) {
			System.out.println(numero);
		}
	}

	public static void listarFichero(Collection<String> lineas) {

		for (String linea : lineas) {
			System.out.println(linea);
		}
	}
	
	public static void listarFichero(String[] lineas) {		
		for (String linea : lineas) {
			System.out.println(linea);
		}
	}
	public static void listarFichero(List<char[]> lineas) {		
		for (char[] caracter : lineas) {
			for (char ca : caracter) {
				System.out.print(ca);
			}
			System.out.println("");			
			
		}
	}
	
}
