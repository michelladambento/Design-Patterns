package br.com.vantec.estudo.model;

public class Pessoa {

	String nome;
	String profissao;

	public Pessoa() {
		super();
	}

	public Pessoa(String nome, String profissao) {
		super();
		this.nome = nome;
		this.profissao = profissao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", profissao=" + profissao + "]";
	}

}
