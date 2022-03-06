package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBagunçado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" }) //Para retirar as Advertências
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet ();
		
		conjunto.add(1.2); //Double -> Double
		conjunto.add(true); // Bollean -> Boolean
		conjunto.add("Teste"); // String -> String
		conjunto.add(1);	   // Int -> Int
		conjunto.add("x");		// Char -> Char
		
		System.out.println("Tamanho é " + conjunto.size());
		
		conjunto.add("teste"); // Este valor é somado no SIZE (Tamanho) por ser um valor novo.
		conjunto.add("x"); // Este valor não é somado no SIZE(Tamanho) por ser um valor já repetido.
		
		System.out.println("Tamanho é " + conjunto.size());

		System.out.println(conjunto.remove("teste")); //Removendo os elementos de Dentro do Conjunto ( Ele retorna TRUE)
		System.out.println(conjunto.remove("New"));	  //Removendo os elementos de Dentro do Conjunto ( Ele retorna False) , pois este valor não existe no conjunto
		System.out.println(conjunto.remove("x"));	  //Removendo os elementos de Dentro do Conjunto ( Ele retorna TRUE)
		
		System.out.println("Tamanho é " + conjunto.size());
		
		System.out.println(conjunto.contains("x")); //Conferindo se existe o valor "X" dentro do Conjunto (Retorna FALSE) pois não esta dentro do conjunto
		
		Set nums = new HashSet ();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		conjunto.addAll(nums); //União do NUMS com o CONJUNTO
		
		System.out.println(conjunto);
		
		conjunto.retainAll(nums); // Irá unir apenas o que eles tem de comum dentro dos conjuntos NUMS e CONJUNTO
		
		System.out.println(conjunto);
		
		conjunto.clear();
		
		System.out.println(conjunto);
		
				
		//Teste Github
		
	}

}
