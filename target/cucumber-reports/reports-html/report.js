$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ConsultarProdutos.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 4,
  "name": "Consultar Produtos",
  "description": "Eu como usuário do e-commerce \r\nQuero consultar os produtos\r\nPara validar a consulta",
  "id": "consultar-produtos",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@consultarProdutos"
    }
  ]
});
formatter.before({
  "duration": 6649965500,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Buscar Produtos válido",
  "description": "",
  "id": "consultar-produtos;buscar-produtos-válido",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 9,
      "name": "@FluxoBasico"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "que o usuario acesse o site da Amercianas",
  "keyword": "Dado "
});
formatter.step({
  "line": 12,
  "name": "buscar o produto \"Notebook\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 13,
  "name": "seleciona a opção \"Buscar\"",
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "retorna a busca de acordo com o produto pesquisado",
  "keyword": "Entao "
});
formatter.match({
  "location": "ConsultarProdutosSteps.queOUsuarioAcesseOSiteDaAmercianas()"
});
formatter.result({
  "duration": 3872273900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Notebook",
      "offset": 18
    }
  ],
  "location": "ConsultarProdutosSteps.buscarOProduto(String)"
});
formatter.result({
  "duration": 1385491000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Buscar",
      "offset": 19
    }
  ],
  "location": "ConsultarProdutosSteps.selecionaAOpção(String)"
});
formatter.result({
  "duration": 2340461200,
  "status": "passed"
});
formatter.match({
  "location": "ConsultarProdutosSteps.retornaABuscaDeAcordoComOProdutoPesquisado()"
});
formatter.result({
  "duration": 2336168000,
  "status": "passed"
});
formatter.after({
  "duration": 4301230200,
  "status": "passed"
});
});