package automatizados.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastroPO extends BasePO {

	public CadastroPO(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "btn-adicionar")
	public WebElement buttonCriar;
	
	@FindBy(css = "cadastro-produto>div>div>div.modal-header>button")
	public WebElement buttonFechar;
	
	@FindBy(id = "codigo")
	public WebElement inputCodigo;
	
	@FindBy(id = "nome")
	public WebElement inputNome;
	
	@FindBy(id = "quantidade")
	public WebElement inputQuantidade;
	
	@FindBy(id = "valor")
	public WebElement inputValor;
	
	@FindBy(id = "data")
	public WebElement inputData;
	
	@FindBy(id = "btn-salvar")
	public WebElement buttonSalvar;
	
	@FindBy(id = "mensagem")
	public WebElement spanMensagem;
		
	@FindBy(css = "body>div>div:nth-child(2)>table>tbody>tr")
	public WebElement trTr;
}
