package automatizados;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import automatizados.pageObject.CadastroPO;

public class CadastroTest extends BaseTest {

	private static CadastroPO CadastroPage;
	
	@Before
	public void prepararTestes() {
		CadastroPage = new CadastroPO(driver);
	}
	
	@Test
	public void TC001_naoDeveAdicionarUmProdutoComAlgunsCamposDoModalDeCadastroVazios() {
		CadastroPage.buttonCriar.click();
		CadastroPage.inputCodigo.sendKeys("1");
		CadastroPage.inputNome.sendKeys("Teste");
		CadastroPage.inputQuantidade.sendKeys(""); 
		CadastroPage.inputValor.sendKeys(""); 
		CadastroPage.inputData.sendKeys("");
		CadastroPage.buttonSalvar.click();
		
		String mensagem = CadastroPage.spanMensagem.getText();
		
		assertEquals(mensagem,"Todos os campos são obrigatórios para o cadastro!");
	}
	
	@Test
	public void TC002_naoDeveAdicionarUmProdutoComTodosOsCamposDoModalDeCadastroVazios() {
		CadastroPage.buttonCriar.click();
		CadastroPage.inputCodigo.sendKeys("");
		CadastroPage.inputNome.sendKeys("");
		CadastroPage.inputQuantidade.sendKeys("");
		CadastroPage.inputValor.sendKeys("");
		CadastroPage.inputData.sendKeys("");
		CadastroPage.buttonSalvar.click();
		
		String mensagem = CadastroPage.spanMensagem.getText();
		
		assertEquals(mensagem,"Todos os campos são obrigatórios para o cadastro!");
	}
	
	@Test
	public void TC003_deveAdicionarUmProdutoAoPreencherTodosOsCamposDoModalDeCadastroCorretamente() {
		CadastroPage.buttonCriar.click();
		CadastroPage.inputCodigo.sendKeys("1");
		CadastroPage.inputNome.sendKeys("Teste");
		CadastroPage.inputQuantidade.sendKeys("10");
		CadastroPage.inputValor.sendKeys("10");
		CadastroPage.inputData.sendKeys("28/06/2024");
		CadastroPage.buttonSalvar.click();
		
		String resultado = CadastroPage.inputCodigo.getText();
		
		assertEquals(resultado, "");
		
	}
}

