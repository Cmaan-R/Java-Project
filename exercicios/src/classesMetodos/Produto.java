package classesMetodos;

public class Produto {

	String nome;
	double preco;
	static double DESCONTO = 0.25;
	
		
	Produto (String nomeinicial , double precoinicial) {
		nome = nomeinicial;
		preco = precoinicial; 
		}
	
	double precoComDesconto() {
		return preco * (1 - DESCONTO);
	}
		
	double precoComDesconto(double descontoGerente) {
		return preco * (1 - DESCONTO + descontoGerente);
	}	
}
	
	