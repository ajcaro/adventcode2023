import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

//		String filename = "resources/input.txt";
		String filename = "resources/input_prod.txt";
		LectorFichero lector = new LectorFichero(filename);
		List<String> fichero = lector.listar();
		GameService gs = new GameService();

		int resultado = gs.getSumGamesPosibles(fichero);
		System.out.println("Resultado = " + resultado);

	}

	private static void listarArray(Collection<Integer> numeros) {
		for (Integer numero : numeros) {
			System.out.println(numero);
		}
	}

	private static void listarFichero(Collection<String> lineas) {

		for (String linea : lineas) {
			System.out.println(linea);
		}
	}

}
