package br.com.alura.cap7exercicio;

public class Funcionario {

	private String nome;
	private int idade;
	
	public Funcionario(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		return "[Nome: " + this.nome + ", idade: " + this.idade;
	}
	
}
