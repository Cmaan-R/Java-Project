package oo.heranca.desafio;

public class Civic extends Carro {
	String nome = "Civic Standart";
	
	void freiar() {
		if (velocidadeAt > 10)
		velocidadeAt -= 15;
	}
}
