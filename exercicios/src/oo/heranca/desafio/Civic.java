package oo.heranca.desafio;

public class Civic extends Carro {
	String nome = "Civic Standart";
	
	int freiar () {
		if ( velocidadeAt < 150) {
			velocidadeAt -= 15;
		}
		
		return  0;
	}
}
