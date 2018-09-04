package br.com.jj.test;

import java.io.IOException;
import java.util.List;

import br.com.jj.entity.Aluno;
import br.com.jj.read.AlunoJson;
import br.com.jj.read.AlunoJsonImpl;

public class JsonReadList {

	public static void main(String[] args) {
		AlunoJson aj = new AlunoJsonImpl();

		try {
			List<Aluno> alunos = aj.readJsonList("C:/Json - Jackson/aluno2.json");

			for (int i = 0; i < alunos.size(); i++) {
				System.out.println(alunos.get(i));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
