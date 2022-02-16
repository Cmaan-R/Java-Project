package estruturasDeControle;

import java.util.Scanner;

public class SwitchComBreak {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a nota do aluno:");
		
		String conceito = "";
		int nota = entrada.nextInt();
		
		switch(nota) {
		case 10: case 9:
			conceito = "A";
			break;
//tambem pode ser usada
		case 8: 
		case 7:
			conceito = "B";
			break;
		case 6: 
		case 5:
			conceito = "C";
			break;
		case 4: case 3:
			conceito = "D";
			break;
		case 2: case 1:
			conceito = "E";
			break;
		// O Default pode ser colocado em qualquer posição , inclusive no meio do Switch.
		default:
			conceito = "não informado";
		
		//Teste Github
		
		 
		}
		
		System.out.println("Conceito é " + conceito);
		
		entrada.close();
	}

}
