package factories;

import buttons.Button;
import buttons.BookingButton;

public class BookingFactory implements GUIFactory {

	@Override
	public Button nameButton() {
		return new BookingButton();
	}

}
