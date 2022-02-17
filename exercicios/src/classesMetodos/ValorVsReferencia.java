package classesMetodos;

public class ValorVsReferencia {
	
	public static void main(String[] args) {
		
		double a = 2;
		double b = a; //Atribuição por valor (Tipo Primitivo)
		
		a++;
		b--;
		
		System.out.println(a + "-------------" + b);
		
		Data d1 = new Data(1, 6, 2022);
		
		Data d2 = d1; //Atribuição por Referência (Objeto)
		
		
		d1.dia = 31;
		d2.mes = 06;
		
		d1.ano = 2025;
		
		
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
		
		voltarDataParaValorPadrao(d2);
		
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
	
		
	}
	
	static void voltarDataParaValorPadrao (Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
		
		
	}

}
