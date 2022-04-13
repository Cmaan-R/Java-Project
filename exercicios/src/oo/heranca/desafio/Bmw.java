package oo.heranca.desafio;

public class Bmw extends Carro {
	
	public String nome = "Bmw 320i";

	public Bmw () {
		super (350);
	}
	
	public Bmw (int velocidadeMaxima) {
		super(velocidadeMaxima);
		delta = 15;
	}
	
}
		
	
//	@Override Foi Declarado no valor DELTA ACIMA 
//	public void acelerar() {
//		velocidadeAt += 15;
//	}
//	
//}