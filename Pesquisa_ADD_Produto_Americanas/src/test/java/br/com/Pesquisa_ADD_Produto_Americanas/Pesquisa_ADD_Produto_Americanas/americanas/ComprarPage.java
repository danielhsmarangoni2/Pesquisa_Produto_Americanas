package br.com.Pesquisa_ADD_Produto_Americanas.Pesquisa_ADD_Produto_Americanas.americanas;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ComprarPage {
	 private static WebDriver browser;
		


	    public ComprarPage() {
	     	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	    	ComprarPage.browser = new ChromeDriver();
	    	ComprarPage.browser.navigate().to("https://www.americanas.com.br/");
	    	browser.manage().window().maximize();
	    	
	    	
	    }

		public void fechar() {
			ComprarPage.browser.quit();
			
		}

		public static void PesquisoUmProduto() {
			
			
		}

		public void PesquisarProduto() {
			browser.findElement(By.id("h_search-input")).sendKeys("notebook dell i5 8gb");
			browser.findElement(By.id("h_search-btn")).click();
			Assert.assertTrue(browser.getPageSource().contains("notebook dell i5 8gb"));
			browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			browser.findElement(By.id("lgpd-accept")).click();
					 	
		}

		public void EntrarNoProduto() {
			browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			browser.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div[3]/div[1]/div/a/span[3]")).click();
					//browser.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[3]/div[1]/div/a/span[1]")).click();
			
		}

		public void AddProduto() {
			browser.findElement(By.xpath("//*[@id=\"buy-button\"]/span")).click();
			browser.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/a[2]/span")).click();
		}

		public void ComprarSemSeguro() {
			browser.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/a")).click();
			
		}

		public void ValidarCarrinho() {
			Assert.assertTrue(browser.getPageSource().contains("Notebook Dell Inspiron I15-3583-D3XP Intel Core I5 8ª 8GB 1TB Linux 15\" - Preto"));

			
		}
}
