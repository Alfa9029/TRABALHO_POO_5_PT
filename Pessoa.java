package Prin;

public class Pessoa {

	protected String nome;
	protected int idade;

	public Pessoa (String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	public Pessoa(String nome) {
		this.nome=nome;
	}

	public Pessoa() {

	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getIdade() {
		return idade;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	/*public String fullName() {
		return nome + " " + sobrenome;
	}*/
	
	@Override
	public String toString() {
		return nome + ", com "+ idade+ " anos.";
	}

}
