package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		double a = 2.3;
		String s = "Bom Dia X";
		s= s.replace("X","Senhora");
		s = s.toUpperCase();
		s = s.concat ("!!!");
		
		
		
		System.out.println(s);
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X".replace("X", "Gui").toUpperCase().concat("!!!");
		System.out.println(y);  
		
		
		//Tipos primitvos não tem o operador "."
		
		int e = 3;
		System.out.println(e);
	}

}
