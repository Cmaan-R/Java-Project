package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	
		public static void main(String[] args) {
			
	//Set<String> listaAprovados = new HashSet <String> ();
			SortedSet<String> listaAprovados = new TreeSet <String> ();
			
			listaAprovados.add("Ana");
			listaAprovados.add("Carlos");
			listaAprovados.add("Lucas");
			listaAprovados.add("Pedro");
			
			for (String candidato: listaAprovados) {
				System.out.println(candidato);
				
			}
			
			Set<Integer> nums = new HashSet <> ();
			
			nums.add(12);
			nums.add(01);
			nums.add(212);
			nums.add(28);
			
			//nums.get(1); N�o � poss�vel acessar pelo �ndice
			
			for (int numero : nums) {
				System.out.println(numero);
			}
			
			
		}

}
