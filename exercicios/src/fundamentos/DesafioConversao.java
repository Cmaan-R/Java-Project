package fundamentos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
				
				String nome = JOptionPane.showInputDialog("Digite seu nome:\n");
				
				System.out.println("Digite seu primeiro sal�rio:");
				String salario1 = entrada.next().replace(",", ".");
				
				System.out.println("Digite seu segundo sal�rio:");
				String salario2 = entrada.next().replace(",", ".");
				
				System.out.println("Digite seu terceiro sal�rio:");
				String salario3 = entrada.next().replace(",", ".");
				
				float n1 = Float.parseFloat(salario1);
				float n2 = Float.parseFloat(salario2);
				float n3 = Float.parseFloat(salario3);
				
				float media = (n1 + n2+ n3) /2;
						
				System.out.println(nome + " a m�dia dos seus sal�rios �: " + media);
				
		entrada.close();
				
								
				
	}

}
