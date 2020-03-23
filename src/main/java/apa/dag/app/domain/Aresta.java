package apa.dag.app.domain;

public class Aresta {
	private int de;
	private int para;
	public int getDe() {
		return de;
	}
	public int getPara() {
		return para;
	}
	public Aresta(int de, int para) {
		super();
		this.de = de;
		this.para = para;
	}
	@Override
	public String toString() {
		return "Aresta [de=" + de + ", para=" + para + "]";
	}
	
	
}
