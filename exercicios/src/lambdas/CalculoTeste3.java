package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	public static void main(String[] args) {
		
		BinaryOperator<Double> soma = (x,y) -> {return x + y; };
		
		// int -> Double (N�o Permite Essa Convers�o)
		// double -> Double (Permite Essa Convers�o)
		System.out.println(soma.apply(2.0, 3.0));
		
		soma = (x , y) -> x * y; 
		System.out.println(soma.apply(2.0, 3.0));
		
		BinaryOperator<Integer> calc = (x,y) -> {return x * y; };
		
		// int -> Double (N�o Permite Essa Convers�o)
		// double -> Double (Permite Essa Convers�o)
		System.out.println(calc.apply(2, 3));
		
		soma = (x , y) -> x * y; 
		System.out.println(calc.apply(2, 3));
			
	}

}
