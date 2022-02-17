package classesMetodos;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	
	Data () {
		//dia = 01;
		//mes = 01;
		//ano = 1970;
		
		this (1, 1, 1970);
		
	}
	
	Data (int dia, int mes, int ano) {
		this.dia = dia; //THIS está fazendo referência ao PUBLIC CLASS DATA
		this.mes = mes;
		this.ano = ano;  
		
	}
	
	String dataFormatada() {
		
		final String formato = "\n A data de hoje é : %d/%d/%d";
		return String.format(formato, this.dia, mes, ano);
								
	}
	
	void imprimirData () {	
		System.out.printf(this.dataFormatada());
	}
}
