
public class TesteSistema {
	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		SistemaInteiro si = new SistemaInteiro();
		si.autentica(g);
	}

}
