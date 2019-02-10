package homework10;

import static homework10.Element.sp;

public class Sentence extends Text {

	public Sentence(String sentence) {
		super(sentence);
	}

	@Override
	public String[] shareTextletters() {
		return getLetter().trim().split(sp);
	}

	@Override
	public void appendLetters(String[] letters) {
		StringBuilder strbul = new StringBuilder();

		for (int i = 0; i < letters.length; i++) {
			strbul.append(letters[i]);
			if (i != letters.length - 1) {
				strbul.append(sp);
			}

		}
		setLetter(strbul.toString());
	}

}