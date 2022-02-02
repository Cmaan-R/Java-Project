package fundamentos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
				
				String nome = JOptionPane.showInputDialog("Digite seu nome:\n");
				
				System.out.println("Digite seu primeiro salário:");
				int salario1 = entrada.nextInt();
				
				System.out.println("Digite seu segundo salário:");
				int salario2 = entrada.nextInt();
				
				System.out.println("Digite seu terceiro salário:");
				int salario3 = entrada.nextInt();
				
				float n1 = salario1;
				float n2= salario2;
				float n3= salario3;
				
				float soma = n1 + n2+ n3;
						
				System.out.println(nome + " a média dos seus salários é: " + soma);
				
		entrada.close();
				
								
				
	}

}
