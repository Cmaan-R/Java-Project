package oo.heranca.desafio;

public class Bmw extends Carro implements Esportivo , Luxo{
	
	public String nome = "Bmw 320i";

	public Bmw () {
		super (350);
	}
	
	public Bmw (int velocidadeMaxima) {
		super(velocidadeMaxima);
		delta = 15;
	}
	
	public void ligarTurbo () {
		delta = 35;
	}
	
	public void desligarTurbo() {
		delta = 15;
	}
	
	public void ligarAr() {
		
	}
	
	public void desligarAr () {
		
	}
	
}


	
		
	
//	@Override Foi Declarado no valor DELTA ACIMA 
//	public void acelerar() {
//		velocidadeAt += 15;
//	}
//	
//}