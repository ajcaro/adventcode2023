import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

//		 String filename = "resources/input.txt";
		String filename = "resources/input_prod.txt";
		LectorFichero lector = new LectorFichero(filename);
		List<String> fichero = lector.listar();

		List<Integer> numeros = new ArrayList<>();
		List<Integer> numeros_linea = new ArrayList<>();
		for (String linea : fichero) {
			System.out.println("Linea: " + linea);

			numeros_linea.clear();
			for (int i = 0; i < linea.length(); i++) {
				char character = linea.charAt(i);
				if (Character.isDigit(character)) {
					numeros_linea.add(Character.getNumericValue(character));
				}
			}
			numeros.add(getSecuencia(numeros_linea));

		}

		listarArray(numeros);
		Integer res = sumarNumeros(numeros);
		System.out.println("Resultado combinado: " + res);

	}

	private static Integer sumarNumeros(List<Integer> numeros) {

		Integer res = 0;
		for (Integer i : numeros) {
			res = res + i;
		}
		return res;
	}

	private static void listarArray(Collection<Integer> numeros) {
		for (Integer numero : numeros) {
			System.out.println(numero);
		}
	}

	private static Integer getSecuencia(List<Integer> numeros) {
		if (numeros.isEmpty())
			return 0;

		int first = numeros.getFirst();
		int last = numeros.getLast();

		// System.out.println("first: " + first + " last: " + last);

		return first * 10 + last;
	}

}
