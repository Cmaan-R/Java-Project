package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
		public static void main(String[] args) {
			
			double a = 1; //Impl�cita
			System.out.println(a);
			
			float b = (float) 1.78945; //Expl�cita (Cast)
			System.out.println(b);
			
			int c  = 4; //Expl�cita (Cast)
			byte d = (byte) c;
			System.out.println(d);
			
			double e = 1.9999; //Expl�cita (Cast)
			int f = (int) e ;
			System.out.println(f);
						

		}

}
