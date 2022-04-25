package lambdas;

public class Desafio {
	
	public static void main(String[] args) {
		
		Produto p = new Produto ("Ipad", 3235.89, 0.13);
		
		System.out.println(p.nome);
		
		
		System.out.println(p.preco);
		
//		1. A partir do produto calcular o preco real (com desconto)
//		2. Imposto Municipal : >= 2500 (8,5%)/ < 2500 (Isento)
//		3. Frete: >= 300 (100) / <3000 (50)
//		4. Arredondar: Deixar duas casas decimais
//		5. Formatar : R$1234,56
	}

}
