package br.com.jj.data;

import br.com.jj.entity.Aluno;

public class AlunoData {

	private Aluno aluno;

	public AlunoData() {
		aluno = new Aluno();
	}

	public Aluno geraJackson() {
		aluno.setId(1);
		aluno.setNome("Jackson Antonio de Lima");
		aluno.setIdade(21);
		aluno.setNota(9.5);
		return aluno;
	}
}
