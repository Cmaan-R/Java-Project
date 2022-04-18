package oo.heranca.desafio;

public class Carro {
	
	protected final int VELOCIDADE_MAXIMA;
	protected String nome;
	public int velocidadeAt = 0;
	private int delta = 5 ;
	
	protected Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar () {
		
		if ( velocidadeAt + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAt = VELOCIDADE_MAXIMA;
		} else {
		velocidadeAt += getDelta();
	}
}
	
	public void freiar () {
		if ( velocidadeAt > 0) {
			velocidadeAt -= 5;
	} else {
		velocidadeAt = 0;
		}
	}
	
	public int getDelta () {
		return delta;
	}
	
	public void setDelta (int delta) {
		this.delta = delta;
	}
	
//	public String toString () {
//		return "A Velocidade Atual é de"+ this.nome +  velocidadeAt + "km/h"; 
//	}
//	
}
