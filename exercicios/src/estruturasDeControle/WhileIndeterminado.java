package estruturasDeControle;

import java.util.Scanner;

public class WhileIndeterminado {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);	
		
		String r = "";
		
		while (!r.equalsIgnoreCase("sair")) {
			System.out.println("O que deseja digitar?");
			r = entrada.nextLine();  
		}
		
		
		
		entrada.close();
		
		
	}

}
