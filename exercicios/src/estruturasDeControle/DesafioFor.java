package estruturasDeControle;

public class DesafioFor {

	
		public static void main(String[] args) {
			
			
			String valor = "#";
			
			for (int i = 1; i <=1; i++) {
				System.out.println(valor);
				valor += "#";
			}
				
			//Desafio 
			//N�o pode usar valor numerico para controlar o la�o!	
				
			for(String v = "#"; !v.equals("######"); v+="#" ) {
				System.out.println(v);
			
			}
		}
    }			
			
			
			
