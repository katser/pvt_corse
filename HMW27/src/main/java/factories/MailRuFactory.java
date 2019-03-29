package factories;

import buttons.Button;
import buttons.MailRuButton;

public class MailRuFactory implements GUIFactory {

	@Override
	public Button nameButton() {
		return new MailRuButton();
	}

}
