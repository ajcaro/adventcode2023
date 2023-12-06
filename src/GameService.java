import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameService {

	private static final int MAX_BLUE_CUBES = 14;
	private static final int MAX_RED_CUBES = 12;
	private static final int MAX_GREEN_CUBES = 13;
	private static final String BLUE = "blue";
	private static final String RED = "red";
	private static final String GREEN = "green";
	private Map<String, Integer> map;

	public GameService() {

		this.map = new HashMap<>();
		map.put(BLUE, MAX_BLUE_CUBES);
		map.put(RED, MAX_RED_CUBES);
		map.put(GREEN, MAX_GREEN_CUBES);
	}

	public int getSumGamesPosibles(List<String> fichero) {
		int total = 0;
		for (String linea : fichero) {

			String[] parts = linea.split(":");
			int gameId = getGameId(parts[0]);

			String[] data = parts[1].split(";");
			if (isPosibleGame(data)) {
				System.out.println("game " + gameId + "  es posible");
				total = total + gameId;
			}
		}

		return total;
	}

	public boolean isPosibleGame(String[] data) {

		boolean isPosibleGame = true;
		int max_color;

		// LEER LA LINEA Y RECOPILAR LOS DATOS

		for (String cube : data) {
			String[] tirada = cube.split(",");
			for (String dato : tirada) {
				String[] dc = dato.split(" ");
				int num_cube = getNumCube(dc);
				String colour = getColour(dc);
				max_color = map.get(colour);
				if (num_cube > max_color) {
					return false;
				}
			}

		}

		return isPosibleGame;

	}

	private int getNumCube(String[] parts) {
		return Integer.parseInt(parts[1]);
	}
	private String getColour(String[] parts) {
		return parts[2];
	}
	
	private int getGameId(String game) {
		String[] parts = game.split(" ");
		return Integer.parseInt(parts[1]);
	}

	private void listarFragmentos(String[] parts) {
		for (String s : parts) {
			System.out.println(s);
		}

	}

}
