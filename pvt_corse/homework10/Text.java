package homework10;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.IntStream;

import homework10.Paragraph;
import homework10.Sentence;
import homework10.Text;
import homework10.Word;

public abstract class Text {

	private String letter;

	public static void TextInput() {
		System.err.println(Messages.getString("Text.0")); //$NON-NLS-1$

	}

	public static void ScannerText() {
		Scanner s = new Scanner(System.in);
		String line = Messages.getString("Text.1"); //$NON-NLS-1$
		String text = Messages.getString("Text.2"); //$NON-NLS-1$
		while (true) {
			line = s.nextLine();
			if (Messages.getString("Text.3").equals(line)) { //$NON-NLS-1$
				break;
			}
			text = line + text;
		}

		System.out.println(Messages.getString("Text.4") + text + line); //$NON-NLS-1$

	}

	public static void InputNumber() {
		System.err.println(Messages.getString("Text.5")); //$NON-NLS-1$

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(Messages.getString("Text.6") + n + Messages.getString("Text.7")); //$NON-NLS-1$ //$NON-NLS-2$

	}
	

	@Override
	public int hashCode() {
		return Objects.hash(letter);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Text)) {
			return false;
		}
		Text other = (Text) obj;
		return Objects.equals(letter, other.letter);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return Messages.getString("Text.8") + (letter != null ? Messages.getString("Text.9") + letter + Messages.getString("Text.10") : Messages.getString("Text.11")) + Messages.getString("Text.12") + hashCode() + Messages.getString("Text.13") //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$
				+ (getLetter() != null ? Messages.getString("Text.14") + getLetter() + Messages.getString("Text.15") : Messages.getString("Text.16")) + Messages.getString("Text.17") + length() //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
				+ Messages.getString("Text.18") + isEmpty() + Messages.getString("Text.19") //$NON-NLS-1$ //$NON-NLS-2$
				+ (getBytes() != null ? Messages.getString("Text.20") + Arrays.toString(getBytes()) + Messages.getString("Text.21") : Messages.getString("Text.22")) //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				+ (toLowerCase() != null ? Messages.getString("Text.23") + toLowerCase() + Messages.getString("Text.24") : Messages.getString("Text.25")) //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				+ (toUpperCase() != null ? Messages.getString("Text.26") + toUpperCase() + Messages.getString("Text.27") : Messages.getString("Text.28")) //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				+ (trim() != null ? Messages.getString("Text.29") + trim() + Messages.getString("Text.30") : Messages.getString("Text.31")) //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				+ (toCharArray() != null ? Messages.getString("Text.32") + Arrays.toString(toCharArray()) + Messages.getString("Text.33") : Messages.getString("Text.34")) //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				+ (intern() != null ? Messages.getString("Text.35") + intern() + Messages.getString("Text.36") : Messages.getString("Text.37")) //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				+ (getClass() != null ? Messages.getString("Text.38") + getClass() + Messages.getString("Text.39") : Messages.getString("Text.40")) //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				+ (super.toString() != null ? Messages.getString("Text.41") + super.toString() : Messages.getString("Text.42")) + Messages.getString("Text.43"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}

	protected String getLetter() {
		return letter;
	}

	protected void setLetter(String letter) {
		this.letter = letter;
	}

	

	public int length() {
		return letter.length();
	}

	public boolean isEmpty() {
		return letter.isEmpty();
	}

	public char charAt(int index) {
		return letter.charAt(index);
	}

	public int codePointAt(int index) {
		return letter.codePointAt(index);
	}

	public int codePointBefore(int index) {
		return letter.codePointBefore(index);
	}

	public int codePointCount(int beginIndex, int endIndex) {
		return letter.codePointCount(beginIndex, endIndex);
	}

	public int offsetByCodePoints(int index, int codePointOffset) {
		return letter.offsetByCodePoints(index, codePointOffset);
	}

	public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) {
		letter.getChars(srcBegin, srcEnd, dst, dstBegin);
	}

	public void getBytes(int srcBegin, int srcEnd, byte[] dst, int dstBegin) {
		letter.getBytes(srcBegin, srcEnd, dst, dstBegin);
	}

	public byte[] getBytes(String charsetName) throws UnsupportedEncodingException {
		return letter.getBytes(charsetName);
	}

	public byte[] getBytes(Charset charset) {
		return letter.getBytes(charset);
	}

	public byte[] getBytes() {
		return letter.getBytes();
	}

	public boolean contentEquals(StringBuffer sb) {
		return letter.contentEquals(sb);
	}

	public boolean contentEquals(CharSequence cs) {
		return letter.contentEquals(cs);
	}

	public boolean equalsIgnoreCase(String anotherString) {
		return letter.equalsIgnoreCase(anotherString);
	}

	public int compareTo(String anotherString) {
		return letter.compareTo(anotherString);
	}

	public int compareToIgnoreCase(String str) {
		return letter.compareToIgnoreCase(str);
	}

	public boolean regionMatches(int toffset, String other, int ooffset, int len) {
		return letter.regionMatches(toffset, other, ooffset, len);
	}

	public boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len) {
		return letter.regionMatches(ignoreCase, toffset, other, ooffset, len);
	}

	public boolean startsWith(String prefix, int toffset) {
		return letter.startsWith(prefix, toffset);
	}

	public boolean startsWith(String prefix) {
		return letter.startsWith(prefix);
	}

	public boolean endsWith(String suffix) {
		return letter.endsWith(suffix);
	}

	public int indexOf(int ch) {
		return letter.indexOf(ch);
	}

	public int indexOf(int ch, int fromIndex) {
		return letter.indexOf(ch, fromIndex);
	}

	public int lastIndexOf(int ch) {
		return letter.lastIndexOf(ch);
	}

	public int lastIndexOf(int ch, int fromIndex) {
		return letter.lastIndexOf(ch, fromIndex);
	}

	public int indexOf(String str) {
		return letter.indexOf(str);
	}

	public int indexOf(String str, int fromIndex) {
		return letter.indexOf(str, fromIndex);
	}

	public int lastIndexOf(String str) {
		return letter.lastIndexOf(str);
	}

	public int lastIndexOf(String str, int fromIndex) {
		return letter.lastIndexOf(str, fromIndex);
	}

	public String substring(int beginIndex) {
		return letter.substring(beginIndex);
	}

	public String substring(int beginIndex, int endIndex) {
		return letter.substring(beginIndex, endIndex);
	}

	public CharSequence subSequence(int beginIndex, int endIndex) {
		return letter.subSequence(beginIndex, endIndex);
	}

	public String concat(String str) {
		return letter.concat(str);
	}

	public String replace(char oldChar, char newChar) {
		return letter.replace(oldChar, newChar);
	}

	public boolean matches(String regex) {
		return letter.matches(regex);
	}

	public boolean replace(CharSequence s) {
		return letter.contains(s);
	}

	public String replaceFirst(String regex, String replacement) {
		return letter.replaceFirst(regex, replacement);
	}

	public String replace(String regex, String replacement) {
		return letter.replaceAll(regex, replacement);
	}

	public String replace(CharSequence target, CharSequence replacement) {
		return letter.replace(target, replacement);
	}

	public String[] split(String regex, int limit) {
		return letter.split(regex, limit);
	}

	public String[] split(String regex) {
		return letter.split(regex);
	}

	public String toLowerCase(Locale locale) {
		return letter.toLowerCase(locale);
	}

	public String toLowerCase() {
		return letter.toLowerCase();
	}

	public String toUpperCase(Locale locale) {
		return letter.toUpperCase(locale);
	}

	public String toUpperCase() {
		return letter.toUpperCase();
	}

	public String trim() {
		return letter.trim();
	}

	public char[] toCharArray() {
		return letter.toCharArray();
	}

	public String intern() {
		return letter.intern();
	}

	public Text(String letter) {
		super();
		this.letter = letter;
	}

	public Text() {
		super();
	}
	public abstract String[] shareTextletters();

	public abstract void appendLetters(String[] letters);
	
	public static void Fin(String text, int symbol) {
		Text paragraph = new Paragraph(text);
		String[] sentLetters = paragraph.shareTextletters();
		String[] changedSentLetters = new String[sentLetters.length];
		for (int j = 0; j < sentLetters.length; j++) {
			Text sentence = new Sentence(sentLetters[j]);

			String[] wordLetters = sentence.shareTextletters();
			String[] changedWordLetters = new String[wordLetters.length];

			for (int i = 0; i < wordLetters.length; i++) {
				Text word = new Word(wordLetters[i]);
				((Word) word).replaceSymbol(symbol);
				changedWordLetters[i] = word.getLetter();
				  
			}
			System.out.println(" ");

			sentence.appendLetters(changedWordLetters);
			changedSentLetters[j] = sentence.getLetter();

		}

		paragraph.appendLetters(changedSentLetters);
		System.out.println(Messages.getString(Messages.getString("Text.50")) + paragraph.getLetter());  

	}
	public static void NewText() {
		System.err.println(Messages.getString(Messages.getString("Text.51")));  

	}

}
