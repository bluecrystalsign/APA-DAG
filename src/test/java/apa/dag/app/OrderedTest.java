package apa.dag.app;

import static org.junit.Assert.fail;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;

import apa.dag.app.domain.Grafo;
import apa.dag.app.domain.Vertice;
import apa.dag.app.domain.Ordenador;

public class OrderedTest {

	@Test
	public void testDag() {
		System.out.println("++++++++++++++++++++++++++++++");
		System.out.println("+++++++++TESTE DAG +++++++++++");
		System.out.println("++++++++++++++++++++++++++++++\n");

		
		
		try {
			String nomeArquivo = ".\\sample.json";
			long[] ordemEsperada = {1l, 2l, 5l, 6l, 4l, 3l};
//			Topological Ordering: [Vertice [id=1, nome=v1, posicao=1], Vertice [id=2, nome=v2, posicao=2], Vertice [id=5, nome=v5, posicao=4], 
//			Vertice [id=6, nome=v6, posicao=3], Vertice [id=4, nome=v4, posicao=5], Vertice [id=3, nome=v3, posicao=0]]

			verificaTopOrdem(nomeArquivo, ordemEsperada);

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testLivro() {
		System.out.println("++++++++++++++++++++++++++++++");
		System.out.println("+++++++++TESTE LIVRO +++++++++");
		System.out.println("++++++++++++++++++++++++++++++\n");

		
		
		try {
			String nomeArquivo = ".\\livro.json";
			long[] ordemEsperada = {1l, 2l, 3l, 4l, 5l, 6l, 7l};
			verificaTopOrdem(nomeArquivo, ordemEsperada);

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	
	@Test
	public void testNotDag() {
		System.out.println("++++++++++++++++++++++++++++++");
		System.out.println("++++++TESTE não é DAG ++++++++");
		System.out.println("++++++++++++++++++++++++++++++\n");
		try {
			String nomeArquivo = ".\\notDag.json";
			verificaTopOrdem(nomeArquivo, null);
			fail("Não lançou execção NOT DAG");
		} catch (NotDagException nde) {
			System.err.println("Não é um DAG, pois não encontramos uma RAIZ nessa iteração");
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	private void verificaTopOrdem(String nomeArquivo, long[] ordemEsperada)
			throws Exception {
		JSONParser parser = new JSONParser();

		Object obj = parser.parse(new FileReader(nomeArquivo));

 
		JSONObject jsonObject = (JSONObject) obj;
 
		JSONArray nodeList = (JSONArray) jsonObject.get("vertices");
		JSONArray edgeList = (JSONArray) jsonObject.get("arestas");
		Grafo g = new Grafo(nodeList, edgeList);
		System.out.println(g);

		Ordenador ordered = new Ordenador(g);
		ordered.ordena();
		
		Vertice[] result = ordered.getOrdenado();
		System.out.println("Topological Ordering: "+Arrays.toString(result));
		for(int i = 0; i < result.length; i++) {
			Assert.assertTrue(result[i].getId() == ordemEsperada[i]);
		}
	}

}
