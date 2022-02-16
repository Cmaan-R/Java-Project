package classesMetodos;

public class Produto {

	String nome;
	double preco;
	double desconto;
	
		
	Produto (String nomeinicial , double precoinicial, double descontoInicial) {
		nome = nomeinicial;
		preco = precoinicial;
		desconto = descontoInicial;
	}
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}	
	double precoComDesconto(double descontoGerente) {
		return preco * (1 - desconto + descontoGerente);
	}	
}
	
	