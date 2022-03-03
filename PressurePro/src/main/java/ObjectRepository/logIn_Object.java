package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class logIn_Object {

	@FindBy(xpath = "//input[@id=\"username\"]")
	private WebElement id;

	public WebElement getName() {
		return id;
		// TODO Auto-generated method stub

	}

	@FindBy(xpath = "//input[@id=\"password\"]")
	private WebElement pwd;

	public WebElement getPwd() {
		return pwd;

	}

	@FindBy(xpath = "//input[@id=\"loginSubmit\"]")
	private WebElement btn;

	public WebElement getLogInBtn() {
		return btn;
	}

}
