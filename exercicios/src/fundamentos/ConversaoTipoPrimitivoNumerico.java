package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
		public static void main(String[] args) {
			
			double a = 1; //Implícita
			System.out.println(a);
			
			float b = (float) 1.78945; //Explícita (Cast)
			System.out.println(b);
			
			int c  = 4; //Explícita (Cast)
			byte d = (byte) c;
			System.out.println(d);
			
			double e = 1.9999; //Explícita (Cast)
			int f = (int) e ;
			System.out.println(f);
						

		}

}
