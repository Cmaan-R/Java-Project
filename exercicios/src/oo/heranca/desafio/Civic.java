package oo.heranca.desafio;

public class Civic extends Carro {
	String nome = "Civic Standart";

	Civic () {
		super (212);
	}
	
	
	void freiar() {
		if (velocidadeAt > 10)
		velocidadeAt -= 15;
	}
}
