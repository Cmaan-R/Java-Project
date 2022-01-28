package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá".charAt(2));
		
		String s = "Boa tarde";
		s = "Bom Dia";
		s = s.toUpperCase();
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.toLowerCase().startsWith("Bom"));
		System.out.println(s.toUpperCase().endsWith("DIA"));
		System.out.println(s.length());
		System.out.println(s.equals("boa Tarde"));
		System.out.println(s.equalsIgnoreCase("bom dia"));
		
		var nome = "Pedro";
		
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987f;
		
		System.out.println("Nome:" + nome + "\nSobrenome: " + sobrenome + "\nIdade:" + idade + "\nSalario: " + salario + "\n\n");
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.1f.",
				nome, sobrenome, idade , salario);
		
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.1f.",
				nome, sobrenome, idade , salario);
		System.out.println("\n" + frase);
		
	}
}
