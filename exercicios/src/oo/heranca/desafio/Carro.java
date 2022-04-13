package oo.heranca.desafio;

public class Carro {
	
	int velocidadeAt = 0;
	
	int acelerar () {
		if ( velocidadeAt >= 0) {
			velocidadeAt += 5;
		}
		return 0 ;
	}
	
	int freiar () {
		if ( velocidadeAt <= 150) {
			velocidadeAt -= 5;
		}
		
		return  0;
	}
	
}
