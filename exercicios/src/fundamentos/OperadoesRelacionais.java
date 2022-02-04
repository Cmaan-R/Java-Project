package fundamentos;

public class OperadoesRelacionais {
	
		public static void main(String[] args) {
			
			int a = 97;
			int b = 'a';
			
			System.out.println(a == b);
			System.out.println(3 > 4);
			System.out.println(3 < 4);
			System.out.println(3 >= 4);
			System.out.println(3 <= 4);
			System.out.println(3 != 4);
			
			double nota = 9.3;
			boolean bomComportamento = true;
			boolean passouPorMedia = nota >= 7;
			boolean temDesconto = bomComportamento && passouPorMedia;
			
			System.out.println("Tem Desconto? " + temDesconto);	
			
		}

}
