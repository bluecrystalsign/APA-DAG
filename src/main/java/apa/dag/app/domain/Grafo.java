package apa.dag.app.domain;

import java.util.Arrays;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Grafo {
	private Vertice[] vertices;
	private Aresta[] arestas;

	public Grafo(JSONArray lstaVertices, JSONArray listaArestas) {
		vertices = new Vertice[lstaVertices.size()];
		arestas = new Aresta[listaArestas.size()];

		carregaVertices(lstaVertices);
		carregaArestas(listaArestas);
	}
	
	public Vertice buscaRaiz() {
		System.out.println("\nbuscaRaiz ------------------------------");

		Vertice raiz = null;
		System.out.println("+ Começa a busca pelo vertice raiz");
		for(int i = 0; i < vertices.length; i++) {
			System.out.println("\t+ Testando o vértice seguinte");
			boolean ehRaiz = true;
			if(vertices[i] == null) { continue;}
			System.out.println("\tvertice: ("+i+") "+vertices[i]);
			for(int j = 0; j < arestas.length; j++) {
				System.out.println("\t\t+ Testando a aresta seguinte (se chega no vértice que está sendo testado)");
				if(arestas[j] == null) { continue;}
				System.out.println("\t\taresta: ("+j+") "+arestas[j]+ " Aresta 'Para' ("+arestas[j].getPara()+") == Posição do Vertice("+vertices[i].getPosicao()+")");
				if(arestas[j].getPara() == vertices[i].getPosicao()) {
					ehRaiz = false;
					System.out.println("\n - aresta chegando no vertice encontrada (não é RAIZ)\n");
					break;
				}
			}
			if(ehRaiz) {
				System.out.println("\n-- RAIZ encontrada e apagada!\n");
				raiz = vertices[i]; // primeira raiz foi encontrada
				vertices[i] = null; // vertice é apagado da lista
				break;
			}
		}
		
// apaga todas as arestas que saem da raiz para outros vertices		
		System.out.println("\t+ Apagando arestas que saem da RAIZ para outros vérticees");
		if(raiz!= null) {
			for(int j = 0; j < arestas.length; j++) {
				if(arestas[j] == null) { continue;}
				if(arestas[j].getDe() == raiz.getPosicao()) {
					System.out.println("\tapagando aresta: ("+j+")\t"+arestas[j]+ "\tAresta 'De' ("+arestas[j].getDe()+") == Posição do Vertice("+raiz.getPosicao()+")");
					arestas[j] = null;
				} else {
					System.out.println("\tverificando aresta: ("+j+")\t"+arestas[j]+ "\tAresta 'De' ("+arestas[j].getDe()+") == Posição do Vertice("+raiz.getPosicao()+")");
				}
			}			
		}
		return raiz;
	}

	private void carregaArestas(JSONArray listaArestas) {
		int i = 0;
		Iterator<JSONObject> iterator = listaArestas.iterator();
		while (iterator.hasNext()) {
			JSONObject proximo = iterator.next();
			Long from = (Long) proximo.get("de");
			Long to = (Long) proximo.get("para");
			arestas[i] = new Aresta(converteDePosicao(from), converteParaPosicao(to));
			i++;
		}
	}
	private void carregaVertices(JSONArray nodeList) {
		Iterator<JSONObject> itNodes = nodeList.iterator();
		int i = 0;
		while (itNodes.hasNext()) {
			JSONObject next = itNodes.next();
			Vertice node = new Vertice((Long) next.get("id"), (String) next.get("nome"));
			node.setPoscao(i);
			vertices[i] = node;
			i++;
		}
	}
	private int converteParaPosicao(Long to) {
		for(int i = 0; i < vertices.length; i++) {
			if(to == vertices[i].getId()) {
				return vertices[i].getPosicao();
			}
		}
		return -1;
	}
	private int converteDePosicao(Long from) {
		for(int i = 0; i < vertices.length; i++) {
			if(from == vertices[i].getId()) {
				return vertices[i].getPosicao();
			}
		}
		return -1;
	}
	
	public int getSize() {
		return vertices.length;
	}

	@Override
	public String toString() {
		return "Grafo [\n\tvertices=" + Arrays.toString(vertices) + ",\n\tarestas=" + Arrays.toString(arestas) + "\n]";
	}

}
