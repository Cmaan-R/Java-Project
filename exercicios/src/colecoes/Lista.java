package colecoes;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<> ();
		
		Usuario u1 = new Usuario ("Ana");
		lista.add(u1);
		
		lista.add( new Usuario ("Carlos"));
		lista.add( new Usuario ("Dalia"));
		lista.add( new Usuario ("Robson"));
		lista.add( new Usuario ("Deberton"));
		
		System.out.println(lista.get(3)); // acessar pelo índice
		
		
		lista.remove(2); //Remove o índice 2
		System.out.println("Removido >>>>>>> " + lista.remove(1)); //Apresenta o item que foi removido pelo Syso
		System.out.println(lista.remove(new Usuario ("Deberton"))); //Remove o "Deberton" da Lista
		
		System.out.println("Na Lista contém? " +lista.contains(new Usuario ("Lia"))); //Confere se contém
		
		for ( Usuario u: lista) {
			System.out.println(u.nome);
		}
		
		
		
				
		
	}

}
