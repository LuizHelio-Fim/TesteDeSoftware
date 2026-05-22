import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteTradutor {
	
	private Tradutor t;
	
	@Before
	public void criarTradutor() {
		t = new Tradutor();
	}

	//@Test
	public void tradutorSemPalavras() {
		assertTrue(t.isEmpty()); 
	}
	
	//@Test
	public void tradutorUmaPalavra() {
		t.adicionaTraducao("Bom","Good");
		assertFalse(t.isEmpty()); 
		assertEquals("Good",t.traduzir("Bom"));
	}
	
	//@Test
	public void tradutorDuasPalavras() {
		t.adicionaTraducao("Mal", "Bad");
		t.adicionaTraducao("Bem", "Well");
		assertEquals("Bad", t.traduzir("Mal"));
		assertEquals("Well", t.traduzir("Bem"));
	}
	
	//@Test
	public void tradutorDuasPalavrasMesmoSignificado() {
		t.adicionaTraducao("Bom", "Good");
		t.adicionaTraducao("Bom", "Nice");
		assertEquals("Good, Nice", t.traduzir("Bom"));

	}
	
	@Test
	public void tradutorFrase() {
		t.adicionaTraducao("Guerras", "Wars");
		t.adicionaTraducao("sao", "are");
		t.adicionaTraducao("Ruins", "Bad");
		assertEquals("Wars are Bad", t.traduzirFrase("Guerras sao Ruins"));
	}

}