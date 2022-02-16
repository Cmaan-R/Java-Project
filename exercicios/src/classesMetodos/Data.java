package classesMetodos;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	
	String dataFormatada() {
		
		return String.format("\nA data de hoje é : %d/%d/%d" , dia, mes, ano);
								
	}
	
	void imprimirData () {
		System.out.printf("\nA data de hoje é : %d/%d/%d" , dia, mes, ano);
		
		
	}
}
