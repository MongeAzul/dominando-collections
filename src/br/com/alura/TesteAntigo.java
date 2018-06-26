package br.com.alura;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TesteAntigo {

	public static void main(String[] args) {
		
		Set<String> conjunto = new HashSet<>();
		conjunto.add("A");
		conjunto.add("A"); //não adiciona por ser repetido
		conjunto.add("B");
		conjunto.add("C");
		conjunto.add("D");
		
		//Com java 8 - lambda
		System.out.println("Com java 8 - lambda");
		conjunto.forEach(letra -> {
			System.out.println(letra);
		});
		
		System.out.println("------------");
		
		//Antes do java 8
		System.out.println("Antes do java 8 - foreach");
		for (String letra : conjunto) {
			System.out.println(letra);
		}
		
		System.out.println("-------------");
		
		//Antes do java 5
		System.out.println("Antes do java 5 - iterator");
		Iterator<String> iterador = conjunto.iterator();
		
		while(iterador.hasNext()){
			System.out.println(iterador.next());
		}
		
	}
	
}
