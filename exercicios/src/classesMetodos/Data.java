package classesMetodos;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data () {
		dia = 01;
		mes = 01;
		ano = 1970;
		
	}
	
	Data (int diaInicial, int mesInicial, int anoInicial) {
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
		
	}
	
	String dataFormatada() {
		
		return String.format("\nA data de hoje � : %d/%d/%d" , dia, mes, ano);
								
	}
	
	void imprimirData () {
		System.out.printf("\nA data de hoje � : %d/%d/%d\n" , dia, mes, ano);
		
		
	//GITHUB
		
		
	}
}
