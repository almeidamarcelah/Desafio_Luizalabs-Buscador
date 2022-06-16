package search.main;

import java.util.ArrayList;
import java.util.Scanner;

import search.enums.MessageEnum;
import search.file.FileSearch;
import search.file.IndexFile;

/**
 * 
 * @author Marcela Almeida
 *
 */
public class ChallengeLab {

	public static void main(String[] args) throws Exception {
		if(args.length > 0) {
			String searchWord = args[0];
			
			Scanner path = new Scanner(System.in);
			System.out.println(""
					+ " _____  ______  _____         ______ _____ ____  \r\n"
					+ "|  __ \\|  ____|/ ____|  /\\   |  ____|_   _/ __ \\ \r\n"
					+ "| |  | | |__  | (___   /  \\  | |__    | || |  | |\r\n"
					+ "| |  | |  __|  \\___ \\ / /\\ \\ |  __|   | || |  | |\r\n"
					+ "| |__| | |____ ____) / ____ \\| |     _| || |__| |\r\n"
					+ "|_____/|______|_____/_/    \\_\\_|    |_____\\____/ ");
			new Thread().sleep(1000);
			System.out.println(""
					+ " _     _    _ _____ ______         \r\n"
					+ "| |   | |  | |_   _|___  /   /\\    \r\n"
					+ "| |   | |  | | | |    / /   /  \\   \r\n"
					+ "| |   | |  | | | |   / /   / /\\ \\  \r\n"
					+ "| |___| |__| |_| |_ / /__ / ____ \\ \r\n"
					+ "|______\\____/|_____/_____/_/    \\_\\");
			new Thread().sleep(1000);
			System.out.println(""
					+ " _               ____   _____ \r\n"
					+ "| |        /\\   |  _ \\ / ____|\r\n"
					+ "| |       /  \\  | |_) | (___  \r\n"
					+ "| |      / /\\ \\ |  _ < \\___ \\ \r\n"
					+ "| |____ / ____ \\| |_) |____) |\r\n"
					+ "|______/_/    \\_\\____/|_____/ ");
			new Thread().sleep(1000);
			System.out.println(""
					+ "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\r\n"
					+ "░░░░░░░░░░▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄░░░░░░░░░\r\n"
					+ "░░░░░░░░▄▀░░░░░░░░░░░░▄░░░░░░░▀▄░░░░░░░\r\n"
					+ "░░░░░░░░█░░▄░░░░▄░░░░░░░░░░░░░░█░░░░░░░\r\n"
					+ "░░░░░░░░█░░░░░░░░░░░░▄█▄▄░░▄░░░█░▄▄▄░░░\r\n"
					+ "░▄▄▄▄▄░░█░░░░░░▀░░░░▀█░░▀▄░░░░░█▀▀░██░░\r\n"
					+ "░██▄▀██▄█░░░▄░░░░░░░██░░░░▀▀▀▀▀░░░░██░░\r\n"
					+ "░░▀██▄▀██░░░░░░░░▀░██▀░░░░░░░░░░░░░▀██░\r\n"
					+ "░░░░▀████░▀░░░░▄░░░██░░░▄█░░░░▄░▄█░░██░\r\n"
					+ "░░░░░░░▀█░░░░▄░░░░░██░░░░▄░░░▄░░▄░░░██░\r\n"
					+ "░░░░░░░▄█▄░░░░░░░░░░░▀▄░░▀▀▀▀▀▀▀▀░░▄▀░░\r\n"
					+ "░░░░░░█▀▀█████████▀▀▀▀████████████▀░░░░\r\n"
					+ "░░░░░░████▀░░███▀░░░░░░▀███░░▀██▀░░░░░░\r\n"
					+ "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\r\n"
					+ "");
			new Thread().sleep(1500);
			
			System.out.println(""
					+ "┌───────────────────── .****. ─────────────────┐\r\n"
					+ "  POR FAVOR, PASSE O CAMINHO DO ARQUIVO     \r\n"
					+ "  Exemplo: C:\\Users\\almeida\\OneDrive\\Documentos \r\n"
					+ "└───────────────────── .****. ─────────────────┘");
			if(path.hasNext()) {
				
				//INICIAR CARREGAMENTO DOS ARQUIVOS PARA PROCESSAMENTO
				IndexFile indexFile = new IndexFile(path.next());
				
				long startTime = System.currentTimeMillis();
				
				ArrayList<String> searched = FileSearch.search(indexFile.getMapFile(), searchWord);
				
				long endTime = System.currentTimeMillis();
				
				System.out.printf("%.2f ms%n" , (endTime - startTime) / 1000d);
				System.out.println("Foram encontradas " + FileSearch.getCount() + " ocorrências pelo termo [" + searchWord + "]");
				searched.forEach(System.out::println);
			}else {
				throw new Exception(MessageEnum.PATH_INVALIDO.getMessage());
			}
		}else {
			throw new Exception(MessageEnum.PARAMETRO_INVALIDO.getMessage());
		}
		new Thread().sleep(1500);
		System.out.println(""
				+ "░░░░░░░░░░░░░░░░░░░░░░█████████\r\n"
				+ "░░███████░░░░░░░░░░███▒▒▒▒▒▒▒▒███\r\n"
				+ "░░█▒▒▒▒▒▒█░░░░░░░███▒▒▒▒▒▒▒▒▒▒▒▒▒███\r\n"
				+ "░░░█▒▒▒▒▒▒█░░░░██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██\r\n"
				+ "░░░░█▒▒▒▒▒█░░░██▒▒▒▒▒██▒▒▒▒▒▒██▒▒▒▒▒███\r\n"
				+ "░░░░░█▒▒▒█░░░█▒▒▒▒▒▒████▒▒▒▒████▒▒▒▒▒▒██\r\n"
				+ "░░░█████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██\r\n"
				+ "░░░█▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒██\r\n"
				+ "░██▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒██▒▒▒▒▒▒▒▒▒▒██▒▒▒▒██\r\n"
				+ "██▒▒▒███████████▒▒▒▒▒██▒▒▒▒▒▒▒▒██▒▒▒▒▒██\r\n"
				+ "█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒████████▒▒▒▒▒▒▒██\r\n"
				+ "██▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██\r\n"
				+ "░█▒▒▒███████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██\r\n"
				+ "░██▒▒▒▒▒▒▒▒▒▒████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█\r\n"
				+ "░░████████████░░░█████████████████\r\n"
				+ "");
	}
}
