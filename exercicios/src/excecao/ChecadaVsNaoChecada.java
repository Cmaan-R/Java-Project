package excecao;

public class ChecadaVsNaoChecada {
	
	public static void main(String[] args)  {
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());;
		}
		
		try {
			geraErro2();			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim :D	 !!!");
		
	}

	// Exce��o N�o Checada ou N�o Verificada
	static void geraErro1 () throws RuntimeException {
		throw new RuntimeException("Ocorreu um erro bem legal #01!");
	}
	
	
	// Exce��o Checada ou Verificada
	static void geraErro2 () throws Exception{
		
		throw new RuntimeException("Ocorreu um erro bem legal #02!");
		
	}
	
}
