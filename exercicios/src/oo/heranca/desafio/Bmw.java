package oo.heranca.desafio;

public class Bmw extends Carro {
	
	String nome = "Bmw 320i";

	Bmw () {
		super (350);
	}
	
	Bmw (int velocidadeMaxima) {
		super(velocidadeMaxima);
		delta = 15;
	}
	
	
}
		
	
//	@Override Foi Declarado no valor DELTA ACIMA 
//	void acelerar() {
//		velocidadeAt += 15;
//	}
//	
//}