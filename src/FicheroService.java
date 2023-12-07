import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FicheroService {

	private String fileName;

	public FicheroService(String fileName) {
		this.fileName = fileName;
	}

	public List<String> listar() throws IOException {

		List<String> fichero = new ArrayList<>();

		ClassLoader cl = getClass().getClassLoader();
		File file = new File(cl.getResource(this.fileName).getFile());

		BufferedReader br = new BufferedReader(new FileReader(file));
		String str;

		while ((str = br.readLine()) != null) {
			fichero.add(str);
		}

		return fichero;

	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}
