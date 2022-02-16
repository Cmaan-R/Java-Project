package classesMetodos;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 24;
		d1.mes = 01;
		d1.ano = 2022;
		
		//System.out.printf ("A data de hoje é : %d/%d/%d" , d1.dia, d1.mes, d1.ano);
		
		var d2 = new Data();
		d2.dia = 16;
		d2.mes = 02;
		d2.ano = 2022;
		
		String dataFormatada1 = d1.dataFormatada();
		
		System.out.println(dataFormatada1);
		System.out.println(d2.dataFormatada());
		
		d1.imprimirData(); //System.out.printf da Classe DATA
		
		
		
		
	}

}
