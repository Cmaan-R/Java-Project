package oo.heranca.desafio;

public class Bmw extends Carro implements Esportivo , Luxo{
	
	public String nome = "Bmw 320i";

	public Bmw () {
		super (350);
	}
	
	public Bmw (int velocidadeMaxima) {
		super(velocidadeMaxima);
		setDelta(15);
	}
	
	public void ligarTurbo () {
		setDelta(15);
	}
	
	public void desligarTurbo() {
		setDelta(15);
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