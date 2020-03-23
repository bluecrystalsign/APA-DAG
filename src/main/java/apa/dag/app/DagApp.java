package apa.dag.app;


import java.io.FileReader;
import java.util.Arrays;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import apa.dag.app.domain.Grafo;
import apa.dag.app.domain.Vertice;
import apa.dag.app.domain.Ordenador;

public class DagApp {

	public static void main(String[] args) {
		System.out.println("------------------------------------");
		System.out.println("--- Directed Acyclic Graphs and Topological Ordering");
		System.out.println("------------------------------------");
		System.out.println("To compute a topological ordering of G:");
		System.out.println("	Find a node v with no incoming edges and order it first");
		System.out.println("	Delete v from G");
		System.out.println("	Recursively compute a topological ordering of G−{v}");
		System.out.println("	and append this order after v");
		
		JSONParser parser = new JSONParser();
		try {
			String fileName = args.length > 0 ? args[0] : ".\\sample.json";
			System.out.println("\nUsando arquivo: "+fileName);
			
			Object obj = parser.parse(new FileReader(fileName));
 
			JSONObject jsonObject = (JSONObject) obj;
 
			JSONArray nodeList = (JSONArray) jsonObject.get("vertices");
			JSONArray edgeList = (JSONArray) jsonObject.get("arestas");
			Grafo g = new Grafo(nodeList, edgeList);
			System.out.println(g);

			Ordenador ordenador = new Ordenador(g);
			ordenador.ordena();
			System.out.println("Topological Ordering: "+Arrays.toString(ordenador.getOrdenado()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
