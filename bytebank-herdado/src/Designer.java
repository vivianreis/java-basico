// Gerente é um funcionário, gerente herda a class Funcionario
public class Designer extends Funcionario {
		
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do Designer");
		return 200;
	}	
	
}
