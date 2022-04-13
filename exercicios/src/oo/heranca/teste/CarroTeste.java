package oo.heranca.teste;

import oo.heranca.desafio.Bmw;
import oo.heranca.desafio.Civic;

public class CarroTeste {
	public static void main(String[] args) {
	
	Bmw bmw = new Bmw ();
	System.out.println(bmw.velocidadeAt);

	Civic civic = new Civic ();
	System.out.println(civic.velocidadeAt);
	
	bmw.acelerar();
	civic.acelerar();
	bmw.acelerar();
	civic.acelerar();
	bmw.acelerar();
	civic.acelerar();
	bmw.acelerar();
	civic.acelerar();
	bmw.acelerar();
	civic.acelerar();
	
	System.out.println("A Velocidade Atual da " + bmw.nome + " é de " + bmw.velocidadeAt +"km");
	System.out.println("A Velocidade Atual do " + civic.nome + " é de " + civic.velocidadeAt +"km");
	
	bmw.freiar();
	civic.freiar();
	bmw.freiar();
	civic.freiar();
	bmw.freiar();
	civic.freiar();
	
	System.out.println("A Velocidade Atual da " + bmw.nome + " é de " + bmw.velocidadeAt +"km");
	System.out.println("A Velocidade Atual do " + civic.nome + " é de " + civic.velocidadeAt +"km");
	
	

	}
}
 