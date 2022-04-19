package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia" , "Gui");
		
		
		System.out.println("FORMA TRADICIONAL");
		for (String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nLAMBDA NA VERSÃO 1");
		aprovados.forEach(nome -> System.out.println(nome + "!!!"));
		
		System.out.println("\nMethod Reference 1 ...");
		aprovados.forEach(System.out::println);
		
		System.out.println("\nLAMBDA NA VERSÃO 2");
		aprovados.forEach(nome -> meuImprimir(nome + " !"));
		
		System.out.println("\nMethod Reference 2 ...");
		aprovados.forEach(Foreach:: meuImprimir);
		
	}

	static void meuImprimir (String nome) {
		System.out.println("Oi! Meu nome é: " + nome);
	}
	
	
	
	
	
		
}
