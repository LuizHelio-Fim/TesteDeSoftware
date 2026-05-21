import java.util.HashMap;
import java.util.Map;

public class Tradutor {
	//private String traducao;
	private Map<String, String> dicionario = new HashMap<>();

	public boolean isEmpty() {
		return dicionario.isEmpty();
	}

	public void adicionaTraducao(String palavra, String traducao) {
		this.dicionario.put(palavra, traducao);
	}

	public String traduzir(String palavra) {
		return dicionario.get(palavra);
	}

}
