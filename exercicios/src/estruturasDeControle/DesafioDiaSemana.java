package estruturasDeControle;

import java.util.Scanner;

public class DesafioDiaSemana {
	
	public static void main(String[] args) {
				
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o dia da semana: ");
		
		String dia = entrada.next();
		
				
		if (dia.equalsIgnoreCase("segunda")) {
			System.out.print(
					"O dia da semana � equivalente a : " +  dia + " � 1");
			
	}	else if ((dia.equalsIgnoreCase("ter�a"))) {
		System.out.print("O dia da semana � equivalente a : " +  dia + " � 2");
		
	}	else if ((dia.equalsIgnoreCase("quarta"))) {
		System.out.print("O dia da semana � equivalente a : " +  dia + " � 3");
		
	}	else if (dia.equalsIgnoreCase("quinta")) {
		System.out.print("O dia da semana � equivalente a : " +  dia + " � 4");
		
	}	else if ((dia.equalsIgnoreCase("sexta"))) {
		System.out.print("O dia da semana � equivalente a : " +  dia + " � 5");
		
	}	else if ((dia.equalsIgnoreCase("sabado"))) {
		System.out.print("O dia da semana � equivalente a : " +  dia + " � 6");
			
	}	else if ((dia.equalsIgnoreCase("domingo"))) {
		System.out.print("O dia da semana � equivalente a : " +  dia + " � 7");
	}	else {
		System.out.println("Dia inv�lido");
	}
		
		
		
		entrada.close();
		
		
		
		
		
		
		
		
	}

}
