package pages;

import consts.Constants;
import core.DriverSingleton;
import org.junit.Assert;
import uimaps.TaskitHomeMap;
import utils.Evidence;
import utils.ExcelManager;

public class TaskitHomePage {
	private Evidence evidence;
	private ExcelManager excelManager;
	private TaskitHomeMap taskitHomeMap = new TaskitHomeMap();

	public TaskitHomePage(Evidence evidence, ExcelManager excelManager) {
		this.evidence = evidence;
		this.excelManager = excelManager;
	}

	/**
	 * Metodo para acessar a tela de login
	 * @return
	 * @throws Exception
	 */
	public String acessaLogin() throws Exception {
		try {
			taskitHomeMap.btnAcessaSignIn.click();
			evidence.takeScreenshot("Acessa_Login", taskitHomeMap.btnAcessaSignIn);

		} catch (Exception e) {
			return e.getMessage();
		}
		return Constants.SUCESSO;
	}

	public String realizaLogin(String login, String password) {
		try {
			taskitHomeMap.inputLogin.sendKeys(excelManager.getValue(login));
			evidence.takeScreenshot("Preenche_Login", taskitHomeMap.inputLogin);
			taskitHomeMap.inputSenha.sendKeys(excelManager.getValue(password));
			evidence.takeScreenshot("Preenche_Senha", taskitHomeMap.inputSenha);
			taskitHomeMap.btnRealizaSignIn.click();
			evidence.takeScreenshot("Acessa-login", taskitHomeMap.btnRealizaSignIn);
		}catch (Exception e) {
			return e.getMessage();
		}
		return Constants.SUCESSO;
	}

	public String validaLogin() {
		try {
			taskitHomeMap.btnUserHome.waitAppearException();
			evidence.takeScreenshot("Validacao_Login", taskitHomeMap.btnUserHome);
		}catch (Exception e) {
			return e.getMessage();
		}
		return Constants.SUCESSO;
	}

}