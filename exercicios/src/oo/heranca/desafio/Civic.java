package oo.heranca.desafio;

public class Civic extends Carro {
	String nome = "Civic Standart";
	
	void freiar () {
		if ( velocidadeAt >= 5) {
			velocidadeAt -= 15;
	} else {
		velocidadeAt = 0;
		}
	}
	
}
