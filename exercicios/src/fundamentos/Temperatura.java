package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (�F(variavel) - 32(Constante/Ajuste) x 5/9(Constante/Fator) = �C(variavel)
		
		final double Ajuste = 32;
		final double Fator = 5/9.0;
		
		double F = 86;		
		double C = (F - Ajuste) * Fator;
		
		
		System.out.println("O valor da convers�o � = " + C + "�C");
		
		F = 0;		
		C = (F - Ajuste) * Fator;
		
		System.out.println("O valor da convers�o � = " + C + "�C");
		
		
		
		//Comentario Teste Github
		/*
		 * Teste Github 
		 */
		
	}

}
