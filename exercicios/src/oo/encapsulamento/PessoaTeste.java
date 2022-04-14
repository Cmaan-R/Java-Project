package oo.encapsulamento;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
	
	Pessoa p1 = new Pessoa("Pedro", "Da Silva" , -30);
	p1.setIdade(-98); // Alterando
	
	
	System.out.println(p1.getIdade());	//Lendo o valor da variável
	System.out.println(p1); //Chamando o toString
	System.out.println(p1.getNomeCompleto());

	}

}