package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
	
	public static void main(String[] args) {
		
		Trabalhador t1 = new Trabalhador ("Pedro" , false, "Cliente" );
		Trabalhador t2 = new Trabalhador ("Patrícia", true , "Excelente");
		Trabalhador t3 = new Trabalhador ("Vidal" ,  false, "Cliente");
		Trabalhador t4 = new Trabalhador ("Daniel" ,  true, "Muito Bom");
		
		List<Trabalhador> trabalhadores = Arrays.asList(t1 , t2 , t3 , t4);
		Predicate<Trabalhador> fazParte = t -> t.fazParte;
		Function<Trabalhador, String> bemVindo =
				t -> "Bem vindo " 
						+ t.nome
						+ " Desejamos Um Bom dia de trabalho\n"
						+ "Nível de Conceito = "
						+ t.conceito + "\n";
		
		trabalhadores.stream()
		.filter(fazParte)
		.map(bemVindo)
		.forEach(System.out::println);
	}
}
