package fundamentos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioConversaoSegundaForma {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
		String n1 = JOptionPane.showInputDialog("Digite Seu primeiro sal�rio");
		String n2 = JOptionPane.showInputDialog("Digite seu segundo sal�rio");
		String n3 = JOptionPane.showInputDialog("Digite seu terceiro sal�rio");
		
		float valor1 = Float.parseFloat(n1);
		float valor2= Float.parseFloat(n2);
		float valor3= Float.parseFloat(n3);
		
		float media= valor1 + valor2 + valor3;
		
		System.out.println(nome + " a m�dia do seu sal�rio �: " + media);
		
		entrada.close();

	}

}
