package lambdas;

import java.util.function.Predicate;

public class PredicatoComposicao {
	
	public static void main(String[] args) {
		
		Predicate<Integer> isPar =
				numero -> numero %2 == 0;		
		
		Predicate<Integer> isTresDigitos = 
				num -> num >= 100 && num <=999;
				
		System.out.println(isPar.and(isTresDigitos).test(212));
		
		System.out.println(isPar.or(isTresDigitos).negate().test(212));
	}

}
