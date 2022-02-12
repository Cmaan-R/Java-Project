package estruturasDeControle;

import java.util.Scanner;

public class If_Else_If {
	
		public static void main(String[] args) {
			
			Scanner entrada = new Scanner (System.in);
					
			System.out.println("Digite a primeiro nota: ");
			double nota = entrada.nextDouble();
			
			
			if ( nota > 10  || nota < 0) {
				System.out.println("Nota inválida"); }
			else if(nota >= 8.1 ) {
				System.out.println("Conceito A"); 
		}	else if (nota >= 6.1) {
			System.out.println("Conceito B");
		}	else if (nota <= 6 && nota > 5.4) {
			System.out.println("Conceito C!");
		}	else {
			System.out.println("Conceito D - Aluno Reprovado \n\n");
		}
				
			
			System.out.println("Fim da Execução!");				
			entrada.close();
			}
			
			
			
			
			
		}

