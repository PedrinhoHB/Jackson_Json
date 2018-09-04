package br.com.jj.test;

import java.io.IOException;

import br.com.jj.entity.Aluno;
import br.com.jj.read.AlunoJson;
import br.com.jj.read.AlunoJsonImpl;

public class JsonRead {
	public static void main(String[] args) {
		AlunoJson aj = new AlunoJsonImpl();
		Aluno aluno = new Aluno();

		try {
			aluno = aj.readJson("C:/Json - Jackson/aluno2.json");
			System.out.println("Id : " + aluno.getId());
			System.out.println("Nome : " + aluno.getNome());
			System.out.println("Idade : " + aluno.getIdade());
			System.out.println("Nota : " + aluno.getNota());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
