package fundamentos;

public class DesafioLogicos {

	public static void main(String[] args) {
	
		//Trabalho na terça ( V ou F)
		
		//Trabalho na quinta (V ou F)

		boolean trabalho1= true;
		boolean trabalho2= false;
		
		boolean comprouTv50 = trabalho1 && trabalho2;
		boolean comprouTv32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		boolean naoSorvete = !comprouSorvete;
		
		System.out.println("Comprou tv 50 polegadas? " + comprouTv50);
		System.out.println("Comprou tv 32 polegadas? " + comprouTv32);
		System.out.println("Comprou o sorvete? " + comprouSorvete);
		System.out.println("Ficou mais saudável?: "+ naoSorvete);





		}
}
