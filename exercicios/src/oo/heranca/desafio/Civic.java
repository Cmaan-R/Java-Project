package oo.heranca.desafio;

public class Civic extends Carro {
	public String nome = "Civic Standart";

	public Civic () {
		super (212);
	}
	
	
	public void freiar() {
		if (velocidadeAt > 10)
		velocidadeAt -= 15;
	}
}
