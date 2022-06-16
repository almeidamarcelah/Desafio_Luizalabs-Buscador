package search.file;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 * @author Marcela Almeida
 *
 */
public class FileSearch {
	
	private static int count;

	public static ArrayList<String> search(Map<String, String> mapFile, String searchWord) {
		ArrayList<String> nameFiles = new ArrayList<String>();
		for (Entry<String, String> entry : mapFile.entrySet()) {
			if(entry.getValue().indexOf(searchWord) > -1) {
				nameFiles.add(entry.getKey());
				count++;
			}
		}
		
		Collections.sort(nameFiles);
		
		return nameFiles; 
	}
	
	public static int getCount() {
		return count;
	}
}
