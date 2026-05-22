import java.util.HashMap;
import java.util.Map;

public class Tradutor {
	//private String traducao;
	private Map<String, String> dicionario = new HashMap<>();

	public boolean isEmpty() {
		return dicionario.isEmpty();
	}

	public void adicionaTraducao(String palavra, String traducao) {
		if (dicionario.containsKey(palavra)) {
			traducao = traduzir(palavra) + ", " + traducao;
		}
		dicionario.put(palavra, traducao);
	}

	public String traduzir(String palavra) {
		return dicionario.get(palavra);
	}
	
	public String traduzirFrase(String frase) {
		String[] palavras = frase.split(" "); 
		String traducao;
		String phrase = "";
		
		for(String palavra : palavras) {
			traducao = traduzir(palavra);
			phrase += traducao + " ";
		}
		
		return phrase.trim();
	}

}
