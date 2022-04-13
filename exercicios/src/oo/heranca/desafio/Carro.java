package oo.heranca.desafio;

public class Carro {
	String nome;
	int velocidadeAt = 0;
	
	void acelerar () {
		if ( velocidadeAt >= 0) {
			velocidadeAt += 5;
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
