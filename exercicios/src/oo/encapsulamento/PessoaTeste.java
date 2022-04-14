package oo.encapsulamento;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
	
	Pessoa p1 = new Pessoa(-30);
	p1.alterarIdade(-98); // Alterando
	
	
	System.out.println("A sua idade é: " + p1.lerIdade() + " anos");	//Lendo o valor da variável

	}

}