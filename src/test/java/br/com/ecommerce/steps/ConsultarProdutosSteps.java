package br.com.ecommerce.steps;

import org.junit.Assert;

import br.com.ecommerce.baseClass.BaseSteps;
import br.com.ecommerce.pages.BuscaProdutosPage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class ConsultarProdutosSteps {

	/**
	 * Paginas necessaria
	 **/
	private BuscaProdutosPage paginaInicial = new BuscaProdutosPage(BaseSteps.browser);

	@Dado("^que o usuario acesse o site da Amercianas$")
	public void queOUsuarioAcesseOSiteDaAmercianas() throws Throwable {
		paginaInicial.abrirPagina();
	}

	@Quando("^buscar o produto \"([^\"]*)\"$")
	public void buscarOProduto(String arg1) throws Throwable {
		paginaInicial.aceitarCoocks();
		paginaInicial.preencheCampoPesquisa(arg1);
	}

	@Quando("^seleciona a opção \"([^\"]*)\"$")
	public void selecionaAOpção(String arg1) throws Throwable {
		paginaInicial.clicaNoBotaoPesquisar();
	}

	@Entao("^retorna a busca de acordo com o produto pesquisado$")
	public void retornaABuscaDeAcordoComOProdutoPesquisado() throws Throwable {

		String produtoBuscado = "notebook";
		String produtoAtual = paginaInicial.retornarProdutoBuscado();

		Assert.assertEquals(produtoBuscado, produtoAtual);

	}

}
