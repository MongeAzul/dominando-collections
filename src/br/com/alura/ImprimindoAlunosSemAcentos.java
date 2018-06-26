package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class ImprimindoAlunosSemAcentos {
	
	public static void main(String[] args) {
		
		
		Set<String> alunos = new HashSet<>();
		alunos.add("Paulo");
		alunos.add("Alberto");
		alunos.add("Pedro");
		alunos.add("Nico");
		alunos.add("Anderson");
		alunos.add("Natália");
		alunos.add("Caio");
		alunos.add("Rafael");
		alunos.add("Marly");
		alunos.add("Anderson");
		alunos.add("Anderson");

		System.out.println(alunos.size());
		
		boolean adicionou = alunos.add("Wolverine");
		System.out.println("Wolverine foi adicionado ao Set? " + adicionou);
		System.out.println(alunos.contains("Aloha"));
		
//		for (String aluno : alunos) {
//			System.out.println(aluno);
//		}
		
		
	}

}
