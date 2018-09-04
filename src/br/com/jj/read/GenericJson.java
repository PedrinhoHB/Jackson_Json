package br.com.jj.read;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public interface GenericJson<T> {

	T readJson(String caminho) throws JsonParseException, JsonMappingException, IOException;

	List<T> readJsonList(String caminho) throws JsonParseException, IOException;

	void writeJson(T entidade, String caminho) throws JsonGenerationException, JsonMappingException, IOException;

	void writeJson(List<T> entidades, String caminho) throws JsonGenerationException, JsonMappingException, IOException;
}
