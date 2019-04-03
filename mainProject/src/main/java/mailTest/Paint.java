package mailTest;

import buttons.Button;
import factories.GUIFactory;

public class Paint {

	private Button button;

	public Paint(GUIFactory factory) {
		button = factory.nameButton();
	}

	public void paint() {
		button.paint();
	}

}
