package fundamentos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
				
				String nome = JOptionPane.showInputDialog("Digite seu nome:\n");
				
				System.out.println("Digite seu primeiro sal�rio:");
				int salario1 = entrada.nextInt();
				
				System.out.println("Digite seu segundo sal�rio:");
				int salario2 = entrada.nextInt();
				
				System.out.println("Digite seu terceiro sal�rio:");
				int salario3 = entrada.nextInt();
				
				float n1 = salario1;
				float n2= salario2;
				float n3= salario3;
				
				float soma = n1 + n2+ n3;
						
				System.out.println(nome + " a m�dia dos seus sal�rios �: " + soma);
				
		entrada.close();
				
								
				
	}

}
