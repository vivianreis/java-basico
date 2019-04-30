package login;

public class Sistema {
	
	//depois quero fazer com que essa informação da senha e usuário venha de dentro do banco de dados 
	private int senha = 1234;
	
	public void autentica (Autenticacao aut) {
		boolean autenticou = aut.autentica(this.senha);
		if (autenticou) {
			System.out.println("Pode entrar no sistema");
		} else {
			System.out.println("Não pode entrar no sistema");
		}
	}

}
