package estruturasDeControle;

import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double total = 0;
		double qnotas = 0;
		double resposta = 0;
		
		while(resposta != -1) {
			System.out.println("Digita a nota do aluno: ");
			resposta = entrada.nextDouble();
			
			if(resposta <=10 && resposta>=0) {
			total += resposta;
			qnotas++;
			
		} 	else if(resposta !=1) {
			System.out.println("Nota inválida!");
	}
}
		double media = total / qnotas; 
		System.out.println("A média dos alunos é" + media);
		
		entrada.close();
	}

}
