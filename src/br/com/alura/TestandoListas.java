package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestandoListas {

	public static void main(String[] args) {
		
		
		String curso1 = "Java 8: Tire proveito dos novos recursos da linguagem";
		String curso2 = "Apache Camel";
		String curso3 = "Certificacao Java SE 8 Programmer I";
		
		List<String> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		
		System.out.println("Primeira lista: " + cursos);
		
		cursos.remove(1);
		
		System.out.println("Lista depois do remove: " + cursos);
		
		System.out.println("O primeiro curso da lista é " + cursos.get(0));
		
		Collections.sort(cursos);
		
		for (String curso : cursos) { //leitura aqui é "Para cada curso do tipo String dentro da List cursos..."
			System.out.println(curso);
		}
		
	}
	
	
}
