package oo.encapsulamento;

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private int idade;
	
	public Pessoa (String nome,String sobreNome,  int idade) {
		setNome(nome);
		setIdade(idade);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome () {
		return sobrenome;
	}
	
	public String getNomeCompleto () {
		return getNome() + " " + getSobrenome();	
	}

	//Getter 
	public int getIdade() {
		return idade;
	}
	
	//Setter
	public void setIdade (int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if (novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;
		}
		
	}
	
	
	public String toString () {
		return "Olá eu sou o " + getNome()
			+ " e tenho " + getIdade() + " Anos";
			
	}
	
}
