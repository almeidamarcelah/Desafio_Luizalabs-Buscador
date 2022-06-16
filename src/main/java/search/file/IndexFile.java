package search.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 
 * @author Marcela Almeida
 *
 */
public class IndexFile {

	private Map<String, String> mapFile = new HashMap<String, String>();
	
	/**
	 * Constructor of class
	 * @param path
	 * @throws IOException
	 */
	public IndexFile(String path) throws IOException {
		createIndexFile(path);
	}

	/**
	 * Prepared files to search
	 * @param path
	 * @throws IOException
	 */
	private void createIndexFile(String path) throws IOException {
		List<File> files = Files.list(Paths.get(path)).map(Path::toFile).sorted().collect(Collectors.toList());
		
		files.forEach(item -> {
			String line = "";
			try {
				BufferedReader buffer = new BufferedReader(new FileReader(item.getAbsolutePath()));
				while ((line = buffer.readLine()) != null) {
					if(!mapFile.containsKey(item.getName())) {
						mapFile.put(item.getName(), line);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public Map<String, String> getMapFile() {
		return mapFile;
	}

	public void setMapFile(Map<String, String> mapFile) {
		this.mapFile = mapFile;
	}
}
