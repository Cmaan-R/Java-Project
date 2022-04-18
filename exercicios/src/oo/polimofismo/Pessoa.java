package oo.polimofismo;

public class Pessoa {
	
	private double peso;
	
	public Pessoa (double peso) {
		setPeso(peso);
	}
	
	public void comerA (Arroz arroz) {
		this.peso += arroz.getPeso();
		
	}
	
	public void comerF (Feijao feijao) {
		this.peso += feijao.getPeso();
		
	}
	
	public void comerS (Sorvete sorvete) {
		this.peso += sorvete.getPeso();
		
	}
	
	public double getPeso () {
		return peso;
	}

	public void setPeso (double peso) {
		if ( peso >= 0) {
			this.peso = peso;
		}
	}
		
}