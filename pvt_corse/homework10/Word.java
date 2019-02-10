package homework10;

import static homework10.Element.sym;

public class Word extends Text {

	public Word(String word) {
		super(word);
	}

	public void replaceSymbol(int numOfSymbol) {
		String[] symbols = shareTextletters();
		if (symbols.length > numOfSymbol - 1) {
			symbols[numOfSymbol - 1] = String.valueOf(sym);
		}
		appendLetters(symbols);
	}

	@Override
	public String[] shareTextletters() {
		String[] sum = new String[getLetter().length()];
		for (int i = 0; i < getLetter().length(); i++) {
			sum[i] = String.valueOf(getLetter().charAt(i));
		}
		return sum;
	}

	@Override
	public void appendLetters(String[] letters) {
		StringBuilder strbul = new StringBuilder();
		for (String letter : letters) {
			strbul.append(letter);
		}
		setLetter(strbul.toString());
	}
}