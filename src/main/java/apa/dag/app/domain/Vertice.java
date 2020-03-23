package apa.dag.app.domain;

public class Vertice {
	private long id;
	private String nome;
	private int posicao;

	public long getId() {
		return id;
	}


	public String getNome() {
		return nome;
	}

	public int getPosicao() {
		return posicao;
	}


	public void setPoscao(int posicao) {
		this.posicao = posicao;
	}


	public Vertice(long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Vertice [id=" + id + ", nome=" + nome + ", posicao=" + posicao + "]";
	}
	
	
}
