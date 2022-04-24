package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
	
	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		
		int resultadoFinal = maisDois
				.andThen(vezesDois)
				.andThen(aoQuadrado)
				.apply(0);
		
		System.out.println(resultadoFinal);
		
		int resultado2 = aoQuadrado
				.compose(vezesDois) // Compose funciona debaixo para cima
				.compose(maisDois)
				.apply(0);
		System.out.println(resultado2);
		
		
	}

}
