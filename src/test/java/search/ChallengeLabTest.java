package search;

import java.io.IOException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import search.file.FileSearch;
import search.file.IndexFile;
import search.main.ChallengeLab;

/**
 * 
 * @author Marcela Almeida
 *
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ChallengeLabTest {

	@Before
	public void start() {
		System.out.println(" ====== INICIANDO BATERIA TESTE =========== ");
	}
	
	@Test
	public void countValueTest() throws IOException {
		Assert.assertEquals(0, FileSearch.getCount());
	}
	
	/**
	 * Execute test to not found file
	 * @throws IOException
	 */
	@Test(expected=NullPointerException.class)
	public void notFoundFile() throws IOException {
		IndexFile indexFile = new IndexFile(null);
		Assert.assertEquals(indexFile.getMapFile(), indexFile.getMapFile().isEmpty());
	}
	
	/**
	 * Execute Test with params null
	 * @throws IOException
	 */
	@Test(expected=NullPointerException.class)
	public void mapEmptyTest() throws IOException {
		Assert.assertEquals(FileSearch.search(null, null), null);
	}
	
	/**
	 * Execute Test with param args invalid
	 * @throws Exception
	 */
	@Test(expected = Exception.class)
	public void emptyParamExecuteMain() throws Exception {
		ChallengeLab.main(null);
	}
	
	@After
	public void end() {
		System.out.println(" ====== FINALIZANDO TESTE ====== ");
	}
}
