# Directed Acyclic Graphs and Topological Ordering

## To compute a topological ordering of G:
## Find a node v with no incoming edges and order it first
##     Delete v from G
##     Recursively compute a topological ordering of G−{v}
##     and append this order after v

++++++++++++++++++++++++++++++
+++++++++TESTE DAG +++++++++++
++++++++++++++++++++++++++++++

Grafo [
	vertices=[Vertice [id=3, nome=v3, posicao=0], Vertice [id=1, nome=v1, posicao=1], Vertice [id=2, nome=v2, posicao=2], Vertice [id=6, nome=v6, posicao=3], Vertice [id=5, nome=v5, posicao=4], Vertice [id=4, nome=v4, posicao=5]],
	arestas=[Aresta [de=1, para=2], Aresta [de=1, para=0], Aresta [de=1, para=4], Aresta [de=1, para=3], Aresta [de=5, para=0], Aresta [de=4, para=3]]
]

buscaRaiz ------------------------------
+ Começa a busca pelo vertice raiz
	+ Testando o vértice seguinte
	vertice: (0) Vertice [id=3, nome=v3, posicao=0]
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (0) Aresta [de=1, para=2] Aresta 'Para' (2) == Posição do Vertice(0)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (1) Aresta [de=1, para=0] Aresta 'Para' (0) == Posição do Vertice(0)

 - aresta chegando no vertice encontrada (não é RAIZ)

	+ Testando o vértice seguinte
	vertice: (1) Vertice [id=1, nome=v1, posicao=1]
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (0) Aresta [de=1, para=2] Aresta 'Para' (2) == Posição do Vertice(1)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (1) Aresta [de=1, para=0] Aresta 'Para' (0) == Posição do Vertice(1)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (2) Aresta [de=1, para=4] Aresta 'Para' (4) == Posição do Vertice(1)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (3) Aresta [de=1, para=3] Aresta 'Para' (3) == Posição do Vertice(1)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (4) Aresta [de=5, para=0] Aresta 'Para' (0) == Posição do Vertice(1)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (5) Aresta [de=4, para=3] Aresta 'Para' (3) == Posição do Vertice(1)

-- RAIZ encontrada e apagada!

	+ Apagando arestas que saem da RAIZ para outros vérticees
	apagando aresta: (0)	Aresta [de=1, para=2]	Aresta 'De' (1) == Posição do Vertice(1)
	apagando aresta: (1)	Aresta [de=1, para=0]	Aresta 'De' (1) == Posição do Vertice(1)
	apagando aresta: (2)	Aresta [de=1, para=4]	Aresta 'De' (1) == Posição do Vertice(1)
	apagando aresta: (3)	Aresta [de=1, para=3]	Aresta 'De' (1) == Posição do Vertice(1)
	verificando aresta: (4)	Aresta [de=5, para=0]	Aresta 'De' (5) == Posição do Vertice(1)
	verificando aresta: (5)	Aresta [de=4, para=3]	Aresta 'De' (4) == Posição do Vertice(1)

buscaRaiz ------------------------------
+ Começa a busca pelo vertice raiz
	+ Testando o vértice seguinte
	vertice: (0) Vertice [id=3, nome=v3, posicao=0]
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (4) Aresta [de=5, para=0] Aresta 'Para' (0) == Posição do Vertice(0)

 - aresta chegando no vertice encontrada (não é RAIZ)

	+ Testando o vértice seguinte
	+ Testando o vértice seguinte
	vertice: (2) Vertice [id=2, nome=v2, posicao=2]
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (4) Aresta [de=5, para=0] Aresta 'Para' (0) == Posição do Vertice(2)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (5) Aresta [de=4, para=3] Aresta 'Para' (3) == Posição do Vertice(2)

-- RAIZ encontrada e apagada!

	+ Apagando arestas que saem da RAIZ para outros vérticees
	verificando aresta: (4)	Aresta [de=5, para=0]	Aresta 'De' (5) == Posição do Vertice(2)
	verificando aresta: (5)	Aresta [de=4, para=3]	Aresta 'De' (4) == Posição do Vertice(2)

buscaRaiz ------------------------------
+ Começa a busca pelo vertice raiz
	+ Testando o vértice seguinte
	vertice: (0) Vertice [id=3, nome=v3, posicao=0]
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (4) Aresta [de=5, para=0] Aresta 'Para' (0) == Posição do Vertice(0)

 - aresta chegando no vertice encontrada (não é RAIZ)

	+ Testando o vértice seguinte
	+ Testando o vértice seguinte
	+ Testando o vértice seguinte
	vertice: (3) Vertice [id=6, nome=v6, posicao=3]
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (4) Aresta [de=5, para=0] Aresta 'Para' (0) == Posição do Vertice(3)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (5) Aresta [de=4, para=3] Aresta 'Para' (3) == Posição do Vertice(3)

 - aresta chegando no vertice encontrada (não é RAIZ)

	+ Testando o vértice seguinte
	vertice: (4) Vertice [id=5, nome=v5, posicao=4]
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (4) Aresta [de=5, para=0] Aresta 'Para' (0) == Posição do Vertice(4)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (5) Aresta [de=4, para=3] Aresta 'Para' (3) == Posição do Vertice(4)

-- RAIZ encontrada e apagada!

	+ Apagando arestas que saem da RAIZ para outros vérticees
	verificando aresta: (4)	Aresta [de=5, para=0]	Aresta 'De' (5) == Posição do Vertice(4)
	apagando aresta: (5)	Aresta [de=4, para=3]	Aresta 'De' (4) == Posição do Vertice(4)

buscaRaiz ------------------------------
+ Começa a busca pelo vertice raiz
	+ Testando o vértice seguinte
	vertice: (0) Vertice [id=3, nome=v3, posicao=0]
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (4) Aresta [de=5, para=0] Aresta 'Para' (0) == Posição do Vertice(0)

 - aresta chegando no vertice encontrada (não é RAIZ)

	+ Testando o vértice seguinte
	+ Testando o vértice seguinte
	+ Testando o vértice seguinte
	vertice: (3) Vertice [id=6, nome=v6, posicao=3]
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (4) Aresta [de=5, para=0] Aresta 'Para' (0) == Posição do Vertice(3)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)

-- RAIZ encontrada e apagada!

	+ Apagando arestas que saem da RAIZ para outros vérticees
	verificando aresta: (4)	Aresta [de=5, para=0]	Aresta 'De' (5) == Posição do Vertice(3)

buscaRaiz ------------------------------
+ Começa a busca pelo vertice raiz
	+ Testando o vértice seguinte
	vertice: (0) Vertice [id=3, nome=v3, posicao=0]
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (4) Aresta [de=5, para=0] Aresta 'Para' (0) == Posição do Vertice(0)

 - aresta chegando no vertice encontrada (não é RAIZ)

	+ Testando o vértice seguinte
	+ Testando o vértice seguinte
	+ Testando o vértice seguinte
	+ Testando o vértice seguinte
	+ Testando o vértice seguinte
	vertice: (5) Vertice [id=4, nome=v4, posicao=5]
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (4) Aresta [de=5, para=0] Aresta 'Para' (0) == Posição do Vertice(5)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)

-- RAIZ encontrada e apagada!

	+ Apagando arestas que saem da RAIZ para outros vérticees
	apagando aresta: (4)	Aresta [de=5, para=0]	Aresta 'De' (5) == Posição do Vertice(5)

buscaRaiz ------------------------------
+ Começa a busca pelo vertice raiz
	+ Testando o vértice seguinte
	vertice: (0) Vertice [id=3, nome=v3, posicao=0]
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)

-- RAIZ encontrada e apagada!

	+ Apagando arestas que saem da RAIZ para outros vérticees
Topological Ordering: [Vertice [id=1, nome=v1, posicao=1], Vertice [id=2, nome=v2, posicao=2], Vertice [id=5, nome=v5, posicao=4], Vertice [id=6, nome=v6, posicao=3], Vertice [id=4, nome=v4, posicao=5], Vertice [id=3, nome=v3, posicao=0]]
++++++++++++++++++++++++++++++
+++++++++TESTE LIVRO +++++++++
++++++++++++++++++++++++++++++

Grafo [
	vertices=[Vertice [id=3, nome=v3, posicao=0], Vertice [id=1, nome=v1, posicao=1], Vertice [id=2, nome=v2, posicao=2], Vertice [id=6, nome=v6, posicao=3], Vertice [id=5, nome=v5, posicao=4], Vertice [id=4, nome=v4, posicao=5], Vertice [id=7, nome=v7, posicao=6]],
	arestas=[Aresta [de=1, para=5], Aresta [de=1, para=4], Aresta [de=1, para=6], Aresta [de=2, para=0], Aresta [de=2, para=4], Aresta [de=2, para=3], Aresta [de=0, para=5], Aresta [de=0, para=4], Aresta [de=5, para=4], Aresta [de=4, para=3], Aresta [de=4, para=6], Aresta [de=3, para=6]]
]

buscaRaiz ------------------------------
+ Começa a busca pelo vertice raiz
	+ Testando o vértice seguinte
	vertice: (0) Vertice [id=3, nome=v3, posicao=0]
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (0) Aresta [de=1, para=5] Aresta 'Para' (5) == Posição do Vertice(0)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (1) Aresta [de=1, para=4] Aresta 'Para' (4) == Posição do Vertice(0)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (2) Aresta [de=1, para=6] Aresta 'Para' (6) == Posição do Vertice(0)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (3) Aresta [de=2, para=0] Aresta 'Para' (0) == Posição do Vertice(0)

 - aresta chegando no vertice encontrada (não é RAIZ)

	+ Testando o vértice seguinte
	vertice: (1) Vertice [id=1, nome=v1, posicao=1]
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (0) Aresta [de=1, para=5] Aresta 'Para' (5) == Posição do Vertice(1)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (1) Aresta [de=1, para=4] Aresta 'Para' (4) == Posição do Vertice(1)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (2) Aresta [de=1, para=6] Aresta 'Para' (6) == Posição do Vertice(1)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (3) Aresta [de=2, para=0] Aresta 'Para' (0) == Posição do Vertice(1)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (4) Aresta [de=2, para=4] Aresta 'Para' (4) == Posição do Vertice(1)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (5) Aresta [de=2, para=3] Aresta 'Para' (3) == Posição do Vertice(1)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (6) Aresta [de=0, para=5] Aresta 'Para' (5) == Posição do Vertice(1)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (7) Aresta [de=0, para=4] Aresta 'Para' (4) == Posição do Vertice(1)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (8) Aresta [de=5, para=4] Aresta 'Para' (4) == Posição do Vertice(1)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (9) Aresta [de=4, para=3] Aresta 'Para' (3) == Posição do Vertice(1)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (10) Aresta [de=4, para=6] Aresta 'Para' (6) == Posição do Vertice(1)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (11) Aresta [de=3, para=6] Aresta 'Para' (6) == Posição do Vertice(1)

-- RAIZ encontrada e apagada!

	+ Apagando arestas que saem da RAIZ para outros vérticees
	apagando aresta: (0)	Aresta [de=1, para=5]	Aresta 'De' (1) == Posição do Vertice(1)
	apagando aresta: (1)	Aresta [de=1, para=4]	Aresta 'De' (1) == Posição do Vertice(1)
	apagando aresta: (2)	Aresta [de=1, para=6]	Aresta 'De' (1) == Posição do Vertice(1)
	verificando aresta: (3)	Aresta [de=2, para=0]	Aresta 'De' (2) == Posição do Vertice(1)
	verificando aresta: (4)	Aresta [de=2, para=4]	Aresta 'De' (2) == Posição do Vertice(1)
	verificando aresta: (5)	Aresta [de=2, para=3]	Aresta 'De' (2) == Posição do Vertice(1)
	verificando aresta: (6)	Aresta [de=0, para=5]	Aresta 'De' (0) == Posição do Vertice(1)
	verificando aresta: (7)	Aresta [de=0, para=4]	Aresta 'De' (0) == Posição do Vertice(1)
	verificando aresta: (8)	Aresta [de=5, para=4]	Aresta 'De' (5) == Posição do Vertice(1)
	verificando aresta: (9)	Aresta [de=4, para=3]	Aresta 'De' (4) == Posição do Vertice(1)
	verificando aresta: (10)	Aresta [de=4, para=6]	Aresta 'De' (4) == Posição do Vertice(1)
	verificando aresta: (11)	Aresta [de=3, para=6]	Aresta 'De' (3) == Posição do Vertice(1)

buscaRaiz ------------------------------
+ Começa a busca pelo vertice raiz
	+ Testando o vértice seguinte
	vertice: (0) Vertice [id=3, nome=v3, posicao=0]
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (3) Aresta [de=2, para=0] Aresta 'Para' (0) == Posição do Vertice(0)

 - aresta chegando no vertice encontrada (não é RAIZ)

	+ Testando o vértice seguinte
	+ Testando o vértice seguinte
	vertice: (2) Vertice [id=2, nome=v2, posicao=2]
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (3) Aresta [de=2, para=0] Aresta 'Para' (0) == Posição do Vertice(2)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (4) Aresta [de=2, para=4] Aresta 'Para' (4) == Posição do Vertice(2)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (5) Aresta [de=2, para=3] Aresta 'Para' (3) == Posição do Vertice(2)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (6) Aresta [de=0, para=5] Aresta 'Para' (5) == Posição do Vertice(2)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (7) Aresta [de=0, para=4] Aresta 'Para' (4) == Posição do Vertice(2)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (8) Aresta [de=5, para=4] Aresta 'Para' (4) == Posição do Vertice(2)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (9) Aresta [de=4, para=3] Aresta 'Para' (3) == Posição do Vertice(2)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (10) Aresta [de=4, para=6] Aresta 'Para' (6) == Posição do Vertice(2)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (11) Aresta [de=3, para=6] Aresta 'Para' (6) == Posição do Vertice(2)

-- RAIZ encontrada e apagada!

	+ Apagando arestas que saem da RAIZ para outros vérticees
	apagando aresta: (3)	Aresta [de=2, para=0]	Aresta 'De' (2) == Posição do Vertice(2)
	apagando aresta: (4)	Aresta [de=2, para=4]	Aresta 'De' (2) == Posição do Vertice(2)
	apagando aresta: (5)	Aresta [de=2, para=3]	Aresta 'De' (2) == Posição do Vertice(2)
	verificando aresta: (6)	Aresta [de=0, para=5]	Aresta 'De' (0) == Posição do Vertice(2)
	verificando aresta: (7)	Aresta [de=0, para=4]	Aresta 'De' (0) == Posição do Vertice(2)
	verificando aresta: (8)	Aresta [de=5, para=4]	Aresta 'De' (5) == Posição do Vertice(2)
	verificando aresta: (9)	Aresta [de=4, para=3]	Aresta 'De' (4) == Posição do Vertice(2)
	verificando aresta: (10)	Aresta [de=4, para=6]	Aresta 'De' (4) == Posição do Vertice(2)
	verificando aresta: (11)	Aresta [de=3, para=6]	Aresta 'De' (3) == Posição do Vertice(2)

buscaRaiz ------------------------------
+ Começa a busca pelo vertice raiz
	+ Testando o vértice seguinte
	vertice: (0) Vertice [id=3, nome=v3, posicao=0]
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (6) Aresta [de=0, para=5] Aresta 'Para' (5) == Posição do Vertice(0)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (7) Aresta [de=0, para=4] Aresta 'Para' (4) == Posição do Vertice(0)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (8) Aresta [de=5, para=4] Aresta 'Para' (4) == Posição do Vertice(0)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (9) Aresta [de=4, para=3] Aresta 'Para' (3) == Posição do Vertice(0)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (10) Aresta [de=4, para=6] Aresta 'Para' (6) == Posição do Vertice(0)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (11) Aresta [de=3, para=6] Aresta 'Para' (6) == Posição do Vertice(0)

-- RAIZ encontrada e apagada!

	+ Apagando arestas que saem da RAIZ para outros vérticees
	apagando aresta: (6)	Aresta [de=0, para=5]	Aresta 'De' (0) == Posição do Vertice(0)
	apagando aresta: (7)	Aresta [de=0, para=4]	Aresta 'De' (0) == Posição do Vertice(0)
	verificando aresta: (8)	Aresta [de=5, para=4]	Aresta 'De' (5) == Posição do Vertice(0)
	verificando aresta: (9)	Aresta [de=4, para=3]	Aresta 'De' (4) == Posição do Vertice(0)
	verificando aresta: (10)	Aresta [de=4, para=6]	Aresta 'De' (4) == Posição do Vertice(0)
	verificando aresta: (11)	Aresta [de=3, para=6]	Aresta 'De' (3) == Posição do Vertice(0)

buscaRaiz ------------------------------
+ Começa a busca pelo vertice raiz
	+ Testando o vértice seguinte
	+ Testando o vértice seguinte
	+ Testando o vértice seguinte
	+ Testando o vértice seguinte
	vertice: (3) Vertice [id=6, nome=v6, posicao=3]
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (8) Aresta [de=5, para=4] Aresta 'Para' (4) == Posição do Vertice(3)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (9) Aresta [de=4, para=3] Aresta 'Para' (3) == Posição do Vertice(3)

 - aresta chegando no vertice encontrada (não é RAIZ)

	+ Testando o vértice seguinte
	vertice: (4) Vertice [id=5, nome=v5, posicao=4]
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (8) Aresta [de=5, para=4] Aresta 'Para' (4) == Posição do Vertice(4)

 - aresta chegando no vertice encontrada (não é RAIZ)

	+ Testando o vértice seguinte
	vertice: (5) Vertice [id=4, nome=v4, posicao=5]
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (8) Aresta [de=5, para=4] Aresta 'Para' (4) == Posição do Vertice(5)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (9) Aresta [de=4, para=3] Aresta 'Para' (3) == Posição do Vertice(5)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (10) Aresta [de=4, para=6] Aresta 'Para' (6) == Posição do Vertice(5)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (11) Aresta [de=3, para=6] Aresta 'Para' (6) == Posição do Vertice(5)

-- RAIZ encontrada e apagada!

	+ Apagando arestas que saem da RAIZ para outros vérticees
	apagando aresta: (8)	Aresta [de=5, para=4]	Aresta 'De' (5) == Posição do Vertice(5)
	verificando aresta: (9)	Aresta [de=4, para=3]	Aresta 'De' (4) == Posição do Vertice(5)
	verificando aresta: (10)	Aresta [de=4, para=6]	Aresta 'De' (4) == Posição do Vertice(5)
	verificando aresta: (11)	Aresta [de=3, para=6]	Aresta 'De' (3) == Posição do Vertice(5)

buscaRaiz ------------------------------
+ Começa a busca pelo vertice raiz
	+ Testando o vértice seguinte
	+ Testando o vértice seguinte
	+ Testando o vértice seguinte
	+ Testando o vértice seguinte
	vertice: (3) Vertice [id=6, nome=v6, posicao=3]
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (9) Aresta [de=4, para=3] Aresta 'Para' (3) == Posição do Vertice(3)

 - aresta chegando no vertice encontrada (não é RAIZ)

	+ Testando o vértice seguinte
	vertice: (4) Vertice [id=5, nome=v5, posicao=4]
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (9) Aresta [de=4, para=3] Aresta 'Para' (3) == Posição do Vertice(4)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (10) Aresta [de=4, para=6] Aresta 'Para' (6) == Posição do Vertice(4)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (11) Aresta [de=3, para=6] Aresta 'Para' (6) == Posição do Vertice(4)

-- RAIZ encontrada e apagada!

	+ Apagando arestas que saem da RAIZ para outros vérticees
	apagando aresta: (9)	Aresta [de=4, para=3]	Aresta 'De' (4) == Posição do Vertice(4)
	apagando aresta: (10)	Aresta [de=4, para=6]	Aresta 'De' (4) == Posição do Vertice(4)
	verificando aresta: (11)	Aresta [de=3, para=6]	Aresta 'De' (3) == Posição do Vertice(4)

buscaRaiz ------------------------------
+ Começa a busca pelo vertice raiz
	+ Testando o vértice seguinte
	+ Testando o vértice seguinte
	+ Testando o vértice seguinte
	+ Testando o vértice seguinte
	vertice: (3) Vertice [id=6, nome=v6, posicao=3]
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (11) Aresta [de=3, para=6] Aresta 'Para' (6) == Posição do Vertice(3)

-- RAIZ encontrada e apagada!

	+ Apagando arestas que saem da RAIZ para outros vérticees
	apagando aresta: (11)	Aresta [de=3, para=6]	Aresta 'De' (3) == Posição do Vertice(3)

buscaRaiz ------------------------------
+ Começa a busca pelo vertice raiz
	+ Testando o vértice seguinte
	+ Testando o vértice seguinte
	+ Testando o vértice seguinte
	+ Testando o vértice seguinte
	+ Testando o vértice seguinte
	+ Testando o vértice seguinte
	+ Testando o vértice seguinte
	vertice: (6) Vertice [id=7, nome=v7, posicao=6]
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)

-- RAIZ encontrada e apagada!

	+ Apagando arestas que saem da RAIZ para outros vérticees
Topological Ordering: [Vertice [id=1, nome=v1, posicao=1], Vertice [id=2, nome=v2, posicao=2], Vertice [id=3, nome=v3, posicao=0], Vertice [id=4, nome=v4, posicao=5], Vertice [id=5, nome=v5, posicao=4], Vertice [id=6, nome=v6, posicao=3], Vertice [id=7, nome=v7, posicao=6]]
++++++++++++++++++++++++++++++
++++++TESTE não é DAG ++++++++
++++++++++++++++++++++++++++++

Grafo [
	vertices=[Vertice [id=3, nome=v3, posicao=0], Vertice [id=1, nome=v1, posicao=1], Vertice [id=2, nome=v2, posicao=2], Vertice [id=6, nome=v6, posicao=3], Vertice [id=5, nome=v5, posicao=4], Vertice [id=4, nome=v4, posicao=5]],
	arestas=[Aresta [de=1, para=2], Aresta [de=2, para=1], Aresta [de=1, para=0], Aresta [de=1, para=4], Aresta [de=1, para=3], Aresta [de=5, para=0], Aresta [de=4, para=3]]
]

buscaRaiz ------------------------------
+ Começa a busca pelo vertice raiz
	+ Testando o vértice seguinte
	vertice: (0) Vertice [id=3, nome=v3, posicao=0]
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (0) Aresta [de=1, para=2] Aresta 'Para' (2) == Posição do Vertice(0)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (1) Aresta [de=2, para=1] Aresta 'Para' (1) == Posição do Vertice(0)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (2) Aresta [de=1, para=0] Aresta 'Para' (0) == Posição do Vertice(0)

 - aresta chegando no vertice encontrada (não é RAIZ)

	+ Testando o vértice seguinte
	vertice: (1) Vertice [id=1, nome=v1, posicao=1]
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (0) Aresta [de=1, para=2] Aresta 'Para' (2) == Posição do Vertice(1)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (1) Aresta [de=2, para=1] Aresta 'Para' (1) == Posição do Vertice(1)

 - aresta chegando no vertice encontrada (não é RAIZ)

	+ Testando o vértice seguinte
	vertice: (2) Vertice [id=2, nome=v2, posicao=2]
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (0) Aresta [de=1, para=2] Aresta 'Para' (2) == Posição do Vertice(2)

 - aresta chegando no vertice encontrada (não é RAIZ)

	+ Testando o vértice seguinte
	vertice: (3) Vertice [id=6, nome=v6, posicao=3]
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (0) Aresta [de=1, para=2] Aresta 'Para' (2) == Posição do Vertice(3)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (1) Aresta [de=2, para=1] Aresta 'Para' (1) == Posição do Vertice(3)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (2) Aresta [de=1, para=0] Aresta 'Para' (0) == Posição do Vertice(3)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (3) Aresta [de=1, para=4] Aresta 'Para' (4) == Posição do Vertice(3)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (4) Aresta [de=1, para=3] Aresta 'Para' (3) == Posição do Vertice(3)

 - aresta chegando no vertice encontrada (não é RAIZ)

	+ Testando o vértice seguinte
	vertice: (4) Vertice [id=5, nome=v5, posicao=4]
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (0) Aresta [de=1, para=2] Aresta 'Para' (2) == Posição do Vertice(4)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (1) Aresta [de=2, para=1] Aresta 'Para' (1) == Posição do Vertice(4)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (2) Aresta [de=1, para=0] Aresta 'Para' (0) == Posição do Vertice(4)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (3) Aresta [de=1, para=4] Aresta 'Para' (4) == Posição do Vertice(4)

 - aresta chegando no vertice encontrada (não é RAIZ)

	+ Testando o vértice seguinte
	vertice: (5) Vertice [id=4, nome=v4, posicao=5]
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (0) Aresta [de=1, para=2] Aresta 'Para' (2) == Posição do Vertice(5)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (1) Aresta [de=2, para=1] Aresta 'Para' (1) == Posição do Vertice(5)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (2) Aresta [de=1, para=0] Aresta 'Para' (0) == Posição do Vertice(5)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (3) Aresta [de=1, para=4] Aresta 'Para' (4) == Posição do Vertice(5)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (4) Aresta [de=1, para=3] Aresta 'Para' (3) == Posição do Vertice(5)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (5) Aresta [de=5, para=0] Aresta 'Para' (0) == Posição do Vertice(5)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (6) Aresta [de=4, para=3] Aresta 'Para' (3) == Posição do Vertice(5)

-- RAIZ encontrada e apagada!

	+ Apagando arestas que saem da RAIZ para outros vérticees
	verificando aresta: (0)	Aresta [de=1, para=2]	Aresta 'De' (1) == Posição do Vertice(5)
	verificando aresta: (1)	Aresta [de=2, para=1]	Aresta 'De' (2) == Posição do Vertice(5)
	verificando aresta: (2)	Aresta [de=1, para=0]	Aresta 'De' (1) == Posição do Vertice(5)
	verificando aresta: (3)	Aresta [de=1, para=4]	Aresta 'De' (1) == Posição do Vertice(5)
	verificando aresta: (4)	Aresta [de=1, para=3]	Aresta 'De' (1) == Posição do Vertice(5)
	apagando aresta: (5)	Aresta [de=5, para=0]	Aresta 'De' (5) == Posição do Vertice(5)
	verificando aresta: (6)	Aresta [de=4, para=3]	Aresta 'De' (4) == Posição do Vertice(5)

buscaRaiz ------------------------------
+ Começa a busca pelo vertice raiz
	+ Testando o vértice seguinte
	vertice: (0) Vertice [id=3, nome=v3, posicao=0]
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (0) Aresta [de=1, para=2] Aresta 'Para' (2) == Posição do Vertice(0)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (1) Aresta [de=2, para=1] Aresta 'Para' (1) == Posição do Vertice(0)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (2) Aresta [de=1, para=0] Aresta 'Para' (0) == Posição do Vertice(0)

 - aresta chegando no vertice encontrada (não é RAIZ)

	+ Testando o vértice seguinte
	vertice: (1) Vertice [id=1, nome=v1, posicao=1]
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (0) Aresta [de=1, para=2] Aresta 'Para' (2) == Posição do Vertice(1)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (1) Aresta [de=2, para=1] Aresta 'Para' (1) == Posição do Vertice(1)

 - aresta chegando no vertice encontrada (não é RAIZ)

	+ Testando o vértice seguinte
	vertice: (2) Vertice [id=2, nome=v2, posicao=2]
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (0) Aresta [de=1, para=2] Aresta 'Para' (2) == Posição do Vertice(2)

 - aresta chegando no vertice encontrada (não é RAIZ)

	+ Testando o vértice seguinte
	vertice: (3) Vertice [id=6, nome=v6, posicao=3]
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (0) Aresta [de=1, para=2] Aresta 'Para' (2) == Posição do Vertice(3)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (1) Aresta [de=2, para=1] Aresta 'Para' (1) == Posição do Vertice(3)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (2) Aresta [de=1, para=0] Aresta 'Para' (0) == Posição do Vertice(3)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (3) Aresta [de=1, para=4] Aresta 'Para' (4) == Posição do Vertice(3)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (4) Aresta [de=1, para=3] Aresta 'Para' (3) == Posição do Vertice(3)

 - aresta chegando no vertice encontrada (não é RAIZ)

	+ Testando o vértice seguinte
	vertice: (4) Vertice [id=5, nome=v5, posicao=4]
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (0) Aresta [de=1, para=2] Aresta 'Para' (2) == Posição do Vertice(4)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (1) Aresta [de=2, para=1] Aresta 'Para' (1) == Posição do Vertice(4)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (2) Aresta [de=1, para=0] Aresta 'Para' (0) == Posição do Vertice(4)
		+ Testando a aresta seguinte (se chega no vértice que está sendo testado)
		aresta: (3) Aresta [de=1, para=4] Aresta 'Para' (4) == Posição do Vertice(4)

 - aresta chegando no vertice encontrada (não é RAIZ)

	+ Testando o vértice seguinte
	+ Apagando arestas que saem da RAIZ para outros vérticees
Não é um DAG, pois não encontramos uma RAIZ nessa iteração
