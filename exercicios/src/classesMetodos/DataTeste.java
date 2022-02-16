package classesMetodos;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data();
		
		//Tudo que está abaixo foi declarado no Produtor da Classe Data 
		//d1.dia = 01;
		//d1.mes = 01;
		//d1.ano = 1970;
		
		//System.out.printf ("A data de hoje é : %d/%d/%d" , d1.dia, d1.mes, d1.ano);
		
		var d2 = new Data(28 , 06 , 1997);
		
		String dataFormatada1 = d1.dataFormatada();
		
		System.out.println(dataFormatada1);
		System.out.println(d2.dataFormatada());
		
		d1.imprimirData(); //System.out.printf da Classe DATA
		d2.imprimirData(); //System.out.printf da Classe DATA
		
		
		
		
	}

}
 