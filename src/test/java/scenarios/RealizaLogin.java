package scenarios;

import core.BaseTest;
import core.DriverSingleton;
import enums.LogType;
import org.junit.Before;
import org.junit.Test;
import pages.TaskitHomePage;

import utils.Log;

public class RealizaLogin extends BaseTest {
    TaskitHomePage taskitHomePage;

    @Before
    public void beforeTest() throws Exception {
        DriverSingleton.navegar(excelManager.getValue("vUrl"));
        taskitHomePage = new TaskitHomePage(evidence, excelManager);
    }

    @Test
    public void script() {
        try {
            executeStep(taskitHomePage.acessaLogin(), "acessa-login");
            executeStep(taskitHomePage.realizaLogin("vLogin", "vPassword"), "realiza-login");
            executeStep(taskitHomePage.validaLogin(), "valida-login");
        }catch (Exception e) {
            Log.sendLog("<====== SCENARIO FAILED ======>", LogType.ERROR);
            if (errorMsg.isEmpty()) {
                errorMsg = "SCRIPT_ERROR: " + e.getMessage();
            }
            Log.sendLog(errorMsg, LogType.ERROR);
        }
    }
}
