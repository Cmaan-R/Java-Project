package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	
	public static void main(String[] args) {
		
		Consumer<String> print =  System.out::print;
		Consumer<Integer> println =  System.out::print;
		
		Stream<String> langs = Stream.of("Java||", "Lua||", "JS\n");
		langs.forEach(print);
		
		String[] maisLangs = { "Python ", "Lisp ", "Perl ", "Go\n"};
		
		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 1, 2).forEach(print); //Elemento de indíce 1 é o segundo pois começa do 0 e vai até o 2, no caso o elemento 2 , não é adicionado.
		
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);
		
		//Stream.generate(() -> "a").forEach(print);
		//Stream.iterate(0, n -> n + 1).forEach(println);
		
	}

}
