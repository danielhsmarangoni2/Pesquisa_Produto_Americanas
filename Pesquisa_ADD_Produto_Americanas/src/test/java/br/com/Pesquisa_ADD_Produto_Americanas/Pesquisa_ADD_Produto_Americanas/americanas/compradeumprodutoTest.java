package br.com.Pesquisa_ADD_Produto_Americanas.Pesquisa_ADD_Produto_Americanas.americanas;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;

public class compradeumprodutoTest {

	    private ComprarPage ComprarPage;
		
	    @BeforeEach 
	    public void beforeeach () {
	    	this.ComprarPage =new ComprarPage();
	    }
	        
	    @AfterEach
	    public void afterEach(){
	    this.ComprarPage.fechar();
	    }

	    @Test
	    public void deveriaEfetuarLoginComDadosValidos() {
	        
	    	ComprarPage.PesquisarProduto();
	    	ComprarPage.EntrarNoProduto();
	    	ComprarPage.AddProduto();
	    	ComprarPage.ComprarSemSeguro();
	    	ComprarPage.ValidarCarrinho();
	    	
	    	
	    
	    }

	  
}
