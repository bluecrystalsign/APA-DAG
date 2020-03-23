package apa.dag.app.domain;

import apa.dag.app.NotDagException;

public class Ordenador {

	private Vertice[] ordenado;
	private int indice = 0;
	private Grafo g;

	public Ordenador(Grafo grafo) {
		ordenado = new Vertice[grafo.getSize()];
		this.g = grafo;
	}

	public Vertice[] getOrdenado() {
		return ordenado;
	}

	public void ordena() throws NotDagException {
		Vertice raiz = null;
			raiz = g.buscaRaiz();
			if(raiz == null) {
				throw new NotDagException();
			}
			ordenado[indice] = raiz;
			indice++;
			if (indice < ordenado.length) {
//				implemenetação recursiva
				ordena();
			}
	}

//	public void ordena() {
//		Vertice[] roots = null;
//		try {
//			roots = g.buscaRaizes();
//			for(int i = 0; i < roots.length; i++) {
//				ordenado[indice] = roots[i];
//				indice++;
//			}
//			if(indice < ordenado.length) {
////				implemenetação recursiva
//				ordena();
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

}
