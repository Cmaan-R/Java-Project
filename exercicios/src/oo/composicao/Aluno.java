package oo.composicao;

import java.util.ArrayList;

public class Aluno {

	final String nome;
	final ArrayList<Curso> cursos = new ArrayList<Curso> ();
	
	Aluno (String nome) {
		this.nome = nome;
		
	}
	
	void adicionarCurso (Curso cursos) {
		this.cursos.add(cursos);
		cursos.alunos.add(this);
		 
	}
	
	Curso obterCursoPorNome (String nome) {
		for (Curso curso: this.cursos) {
		 if(curso.nome.equals(nome)) {
			 return curso;
		 }
		}
		return null;
	}
	
	public String toString() {
		return nome;
	}
	
}
