package br.com.jj.read;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GenericJsonImpl<T> implements GenericJson<T> {

	private Class<T> clazz;

	private ObjectMapper mapper;

	@SuppressWarnings("unchecked")
	public GenericJsonImpl() {
		clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		mapper = new ObjectMapper();
	}

	@Override
	public T readJson(String caminho) throws JsonParseException, JsonMappingException, IOException {
		return mapper.readValue(new File(caminho), clazz);
	}

	@Override
	public List<T> readJsonList(String caminho) throws JsonParseException, IOException {
		return mapper.readValue(new File(caminho), new TypeReference<List<T>>() {
		});
	}

	@Override
	public void writeJson(T entidade, String caminho)
			throws JsonGenerationException, JsonMappingException, IOException {
		mapper.writeValue(new File(caminho), entidade);

	}

	@Override
	public void writeJson(List<T> entidades, String caminho)
			throws JsonGenerationException, JsonMappingException, IOException {
		mapper.writeValue(new File(caminho), entidades);
	}

}
