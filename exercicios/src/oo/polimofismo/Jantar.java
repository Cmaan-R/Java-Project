package oo.polimofismo;

public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa ( 99.65);
		
		Arroz ingrediente1 =  new Arroz(0.150);
		Feijao ingrediente2 =  new Feijao(0.180);
		
		System.out.println("Estou pesando " + convidado.getPeso() + "Kg");
		
		convidado.comerA(ingrediente1);
		convidado.comerF(ingrediente2);
		
		System.out.println("Estou pesando " + convidado.getPeso() + "Kg");

		
		Sorvete ingrediente3 = new Sorvete (0.50);
		convidado.comerS(ingrediente3);
		
		System.out.println("Estou pesando " + convidado.getPeso() + "Kg");

		
	}

}
