package br.com.alura;

import java.util.HashMap;
import java.util.Map;

public class Exercicio {

	public static void main(String[] args) {
		
		Map<Integer, String> pessoas = new HashMap<>();
		pessoas.put(21, "Leonardo Silveira");
		pessoas.put(27, "F�bio Pimentel");
		pessoas.put(19, "Silvio Matos");
		pessoas.put(23, "R�mulo Henrique");
		
		pessoas.keySet().forEach(idade -> {
			System.out.println(pessoas.get(idade));
		});;
		
		
	}
	
	
}
