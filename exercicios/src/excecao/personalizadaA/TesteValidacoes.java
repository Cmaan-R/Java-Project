package excecao.personalizadaA;

import excecao.Aluno;

public class TesteValidacoes {
	
	public static void main(String[] args) {
		
		try {
			Aluno aluno = new Aluno ("Ana" , -7);
			Validar.aluno(aluno);
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());
		} catch (NumeroForaIntervaloException a) {
			System.out.println("O N�mero est� fora do intervalo");
		}
		
		System.out.println("Fim :D");
		
	}

}
