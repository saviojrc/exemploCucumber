#language: pt

@consultarProdutos
Funcionalidade: Consultar Produtos
	Eu como usuário do e-commerce 
	Quero consultar os produtos
	Para validar a consulta
	
@FluxoBasico
Cenario: Buscar Produtos válido
    Dado que o usuario acesse o site da Amercianas
    Quando buscar o produto "Notebook"
    E seleciona a opção "Buscar"
    Entao retorna a busca de acordo com o produto pesquisado


