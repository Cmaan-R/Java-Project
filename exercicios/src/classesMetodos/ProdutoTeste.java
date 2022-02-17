package classesMetodos;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook" , 4356.89);
		
		var p2 = new Produto("Caneta Preta" , 12.56);
		
		//Tudo que está abaixo foi declarado no Produtor da Classe Produto 
		//p2.nome = "Caneta Preta";
		//p2.preco = 12.56;
		//p2.desconto = 0.29;
		
		Produto.DESCONTO = 0.50;
		
		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + p2.precoComDesconto());

		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double mediaCarrinho = ((precoFinal1 + precoFinal2) /2 ); 
		
		System.out.printf("Média do carinho = R$%.2f.", mediaCarrinho);
		
		System.out.println();
		
		
	}

}
