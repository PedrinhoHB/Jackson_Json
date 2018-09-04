package br.com.jj.test;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;

import br.com.jj.data.AlunoData;
import br.com.jj.entity.Aluno;
import br.com.jj.read.AlunoJson;
import br.com.jj.read.AlunoJsonImpl;

public class JsonWrite {
	public static void main(String[] args) {
		AlunoJson aj = new AlunoJsonImpl();
		Aluno aluno = new AlunoData().geraJackson();
		String caminho = "C:/Json - Jackson/aluno2.json";

		try {
			aj.writeJson(aluno, caminho);
			System.out.println("Json exportado com sucesso!");
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
