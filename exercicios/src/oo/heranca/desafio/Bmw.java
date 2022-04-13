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
		
	
//	@Override Foi Declaro no valor DELTA ACIMA 
//	void acelerar() {
//		velocidadeAt += 15;
//	}
//	
//}
	
	
	
	
//	String nome = "Bmw 320i";
//
//	int acelerar () {
//		if ( velocidadeAt >= 0) {
//			velocidadeAt += 15;
//		}
//		return 0 ;
//	}
//
//	
//}
