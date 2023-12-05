import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

		String filename = "resources/input.txt";
//		String filename = "resources/input_prod.txt";
		LectorFichero lector = new LectorFichero(filename);
		List<String> fichero = lector.listar();

		

	}

	
	private static void listarArray(Collection<Integer> numeros) {
		for (Integer numero : numeros) {
			System.out.println(numero);
		}
	}

}
