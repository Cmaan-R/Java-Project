package oo.heranca.desafio;

public class Carro {
	
	final int VELOCIDADE_MAXIMA;
	String nome;
	int velocidadeAt = 0;
	int delta = 5 ;
	
	Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	void acelerar () {
		
		if ( velocidadeAt + delta > VELOCIDADE_MAXIMA) {
			velocidadeAt = VELOCIDADE_MAXIMA;
		} else {
		velocidadeAt += delta;
	}
}
	
	void freiar () {
		if ( velocidadeAt > 0) {
			velocidadeAt -= 5;
	} else {
		velocidadeAt = 0;
		}
	}
	
//	public String toString () {
//		return "A Velocidade Atual é de"+ this.nome +  velocidadeAt + "km/h"; 
//	}
//	
}
