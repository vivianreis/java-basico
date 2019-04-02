// Gerente é um funcionário, gerente herda a class Funcionario
public class EditorVideo extends Funcionario {
		
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do Editor de Vídeo");
		return super.getBonificacao() + super.getSalario() + 100;
	}	
	
}
