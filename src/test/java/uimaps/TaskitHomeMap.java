package uimaps;

import core.Element;
import enums.ByValue;

public class TaskitHomeMap {
    public Element btnAcessaSignIn = new Element(ByValue.XPATH, "//ul[@class='right hide-on-med-and-down']//a[text()='Sign in']");
    public Element inputLogin = new Element(ByValue.XPATH, "//div[@class='modal modal-fixed-footer open']//input[contains(@placeholder,'login')]");
    public Element inputSenha = new Element(ByValue.XPATH, "//div[@class='modal modal-fixed-footer open']//input[contains(@placeholder,'secret')]");
    public Element btnRealizaSignIn = new Element(ByValue.XPATH, "//div[@class='modal-footer']//a[text()='Sign in']");
    public Element btnUserHome = new Element(ByValue.XPATH, "//ul[@class='right hide-on-med-and-down']//a[contains(text(),'Hi')]");
}
