package oo.heranca.desafio;

public class Carro {
	
	int velocidadeAt = 0;
	
	int acelerar () {
		if ( velocidadeAt >= 0) {
			velocidadeAt += 5;
		}
		return 0 ;
	}
	
	void freiar () {
		if ( velocidadeAt >= 5) {
			velocidadeAt -= 5;
	} else {
		velocidadeAt = 0;
		}
	}
	
}
