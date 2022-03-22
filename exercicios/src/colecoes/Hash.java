package colecoes;

import java.util.HashSet;

public class Hash {
	
	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("Pedro"));
		usuarios.add(new Usuario("Rebecca"));
		usuarios.add(new Usuario("Dalia"));
		
		boolean resultado = usuarios.contains(new Usuario ("Dalia")); 
		System.out.println(resultado);
		
		
		
		
		
		
		
	}

}
