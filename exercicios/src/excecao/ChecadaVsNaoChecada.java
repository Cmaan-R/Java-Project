package excecao;

public class ChecadaVsNaoChecada {
	
	public static void main(String[] args)  {
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			geraErro2();	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim :D	 !!!");
		
	}

	// Exceção Não Checada ou Não Verificada
	static void geraErro1 () {
		throw new RuntimeException("Ocorreu um erro bem legal #01!");
	}
	
	
	// Exceção Checada ou Verificada
	static void geraErro2 () throws Exception{
		
		throw new RuntimeException("Ocorreu um erro bem legal #02!");
		
	}
	
}
