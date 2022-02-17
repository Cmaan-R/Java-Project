package desafio;

public class Pessoa {
	
	String nome;
	double peso;
	//double pesoSomado = peso + pesoFinal;
	
	Pessoa (String nomeInicial , double pesoInicial) {
	
		this.nome = nomeInicial;
		this.peso = pesoInicial;
		
		
	}
	
		
	
	void comer (Comida comida) {
		if(comida !=null) {
			this.peso += comida.pesoComida;
			
		}
	}
		
		String apresentar() {
			return "Olá eu sou o " + nome + "e tenho" + peso + "Kgs.";
		
	}
}	
	
	
	

