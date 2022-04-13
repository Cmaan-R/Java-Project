package oo.heranca.desafio;

public class Bmw extends Carro {
	
	String nome = "Bmw 320i";

	int acelerar () {
		if ( velocidadeAt >= 0) {
			velocidadeAt += 15;
		}
		return 0 ;
	}
	//Acelera mais forte (15)
	
}
