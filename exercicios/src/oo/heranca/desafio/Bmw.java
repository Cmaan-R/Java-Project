package oo.heranca.desafio;

public class Bmw extends Carro implements Esportivo , Luxo{
	
	private boolean ligarTurbo;
	private boolean ligarAr;
	
	public String nome = "Bmw 320i";

	public Bmw () {
		super (350);
	}
	
	public Bmw (int velocidadeMaxima) {
		super(velocidadeMaxima);
		setDelta(15);
	}
	
	public void ligarTurbo () {
		ligarTurbo = true;
	}
	
	public void desligarTurbo() {
		ligarTurbo = false;
	}
	
	public void ligarAr() {
		ligarAr = true;
		
	}
	
	public void desligarAr () {
		ligarAr = false;
	}
	
	@Override
	public int getDelta() {
		if (ligarTurbo && !ligarAr) {
			return 35;
		} else if (ligarTurbo && ligarAr) {
			return 30;
		} else if (!ligarTurbo && ligarAr) {
			return 20;
		} else {
			
		return 15;
		}
	}
}


	
		
	
//	@Override Foi Declarado no valor DELTA ACIMA 
//	public void acelerar() {
//		velocidadeAt += 15;
//	}
//	
//}