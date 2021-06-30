package br.com.ecommerce.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.ecommerce.baseClass.BasePage;

public class BuscaProdutosPage extends BasePage {
	public BuscaProdutosPage(WebDriver _browser) {
		super(_browser);
	}

	private String url = "https://www.americanas.com.br/";
	private By inputPesrquisa = By.id("h_search-input");
	private By btnPesquisar = By.id("h_search-btn");
	private By btnCoocks = By.cssSelector("#footer-lgpd > button:nth-child(2)");
	private By produtoBuscado = By.cssSelector(".full-grid__Title-sc-19t7jwc-0");

	public void abrirPagina() {
		browser.get(url);
	}

	public void aceitarCoocks() {
		try {
			Thread.sleep(5000);
			waitElementVisible(btnCoocks, 5);
			waitElementClickable(btnCoocks, 5);
			browser.findElement(btnCoocks).click();
		}catch (Throwable e){
			e.printStackTrace();
			throw  new IllegalArgumentException(e.getMessage());
		}
	}

	public void verificaSeEstouNaPagina() {
		String paginaAtual = browser.getCurrentUrl();
		Assert.assertEquals(true, url.equals(paginaAtual));
	}

	public void preencheCampoPesquisa(String produto) {
		waitForPageLoad(20);
		waitElementVisible(inputPesrquisa, 10);
		waitElementClickable(inputPesrquisa, 5);
		browser.findElement(inputPesrquisa).sendKeys(produto);
	}

	public void clicaNoBotaoPesquisar() {
		waitElementClickable(btnPesquisar, 5);
		browser.findElement(btnPesquisar).click();
	}

	public String retornarProdutoBuscado() {

		waitElementVisible(produtoBuscado, 30);
		String nomeProduto = produtoBuscado.findElement(browser).getAttribute("innerText");
		return nomeProduto.trim();

	}
}
