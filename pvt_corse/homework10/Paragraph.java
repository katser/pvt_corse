package homework10;

import static homework10.Element.div;
import static homework10.Element.sp;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Locale;

public class Paragraph extends Text {

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}

	@Override
	protected String getLetter() {
		return super.getLetter();
	}

	@Override
	protected void setLetter(String letter) {
		super.setLetter(letter);
	}

	@Override
	public int length() {
		return super.length();
	}

	@Override
	public boolean isEmpty() {
		return super.isEmpty();
	}

	@Override
	public char charAt(int index) {
		return super.charAt(index);
	}

	@Override
	public int codePointAt(int index) {
		return super.codePointAt(index);
	}

	@Override
	public int codePointBefore(int index) {
		return super.codePointBefore(index);
	}

	@Override
	public int codePointCount(int beginIndex, int endIndex) {
		return super.codePointCount(beginIndex, endIndex);
	}

	@Override
	public int offsetByCodePoints(int index, int codePointOffset) {
		return super.offsetByCodePoints(index, codePointOffset);
	}

	@Override
	public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) {
		super.getChars(srcBegin, srcEnd, dst, dstBegin);
	}

	@Override
	public void getBytes(int srcBegin, int srcEnd, byte[] dst, int dstBegin) {
		super.getBytes(srcBegin, srcEnd, dst, dstBegin);
	}

	@Override
	public byte[] getBytes(String charsetName) throws UnsupportedEncodingException {
		return super.getBytes(charsetName);
	}

	@Override
	public byte[] getBytes(Charset charset) {
		return super.getBytes(charset);
	}

	@Override
	public byte[] getBytes() {
		return super.getBytes();
	}

	@Override
	public boolean contentEquals(StringBuffer sb) {
		return super.contentEquals(sb);
	}

	@Override
	public boolean contentEquals(CharSequence cs) {
		return super.contentEquals(cs);
	}

	@Override
	public boolean equalsIgnoreCase(String anotherString) {
		return super.equalsIgnoreCase(anotherString);
	}

	@Override
	public int compareTo(String anotherString) {
		return super.compareTo(anotherString);
	}

	@Override
	public int compareToIgnoreCase(String str) {
		return super.compareToIgnoreCase(str);
	}

	@Override
	public boolean regionMatches(int toffset, String other, int ooffset, int len) {
		return super.regionMatches(toffset, other, ooffset, len);
	}

	@Override
	public boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len) {
		return super.regionMatches(ignoreCase, toffset, other, ooffset, len);
	}

	@Override
	public boolean startsWith(String prefix, int toffset) {
		return super.startsWith(prefix, toffset);
	}

	@Override
	public boolean startsWith(String prefix) {
		return super.startsWith(prefix);
	}

	@Override
	public boolean endsWith(String suffix) {
		return super.endsWith(suffix);
	}

	@Override
	public int indexOf(int ch) {
		return super.indexOf(ch);
	}

	@Override
	public int indexOf(int ch, int fromIndex) {
		return super.indexOf(ch, fromIndex);
	}

	@Override
	public int lastIndexOf(int ch) {
		return super.lastIndexOf(ch);
	}

	@Override
	public int lastIndexOf(int ch, int fromIndex) {
		return super.lastIndexOf(ch, fromIndex);
	}

	@Override
	public int indexOf(String str) {
		return super.indexOf(str);
	}

	@Override
	public int indexOf(String str, int fromIndex) {
		return super.indexOf(str, fromIndex);
	}

	@Override
	public int lastIndexOf(String str) {
		return super.lastIndexOf(str);
	}

	@Override
	public int lastIndexOf(String str, int fromIndex) {
		return super.lastIndexOf(str, fromIndex);
	}

	@Override
	public String substring(int beginIndex) {
		return super.substring(beginIndex);
	}

	@Override
	public String substring(int beginIndex, int endIndex) {
		return super.substring(beginIndex, endIndex);
	}

	@Override
	public CharSequence subSequence(int beginIndex, int endIndex) {
		return super.subSequence(beginIndex, endIndex);
	}

	@Override
	public String concat(String str) {
		return super.concat(str);
	}

	@Override
	public String replace(char oldChar, char newChar) {
		return super.replace(oldChar, newChar);
	}

	@Override
	public boolean matches(String regex) {
		return super.matches(regex);
	}

	@Override
	public boolean replace(CharSequence s) {
		return super.replace(s);
	}

	@Override
	public String replaceFirst(String regex, String replacement) {
		return super.replaceFirst(regex, replacement);
	}

	@Override
	public String replace(String regex, String replacement) {
		return super.replace(regex, replacement);
	}

	@Override
	public String replace(CharSequence target, CharSequence replacement) {
		return super.replace(target, replacement);
	}

	@Override
	public String[] split(String regex, int limit) {
		return super.split(regex, limit);
	}

	@Override
	public String[] split(String regex) {
		return super.split(regex);
	}

	@Override
	public String toLowerCase(Locale locale) {
		return super.toLowerCase(locale);
	}

	@Override
	public String toLowerCase() {
		return super.toLowerCase();
	}

	@Override
	public String toUpperCase(Locale locale) {
		return super.toUpperCase(locale);
	}

	@Override
	public String toUpperCase() {
		return super.toUpperCase();
	}

	@Override
	public String trim() {
		return super.trim();
	}

	@Override
	public char[] toCharArray() {
		return super.toCharArray();
	}

	@Override
	public String intern() {
		return super.intern();
	}

	public Paragraph(String paragraph) {
		super(paragraph);
	}

	@Override
	public String[] shareTextletters() {
		return getLetter().split(div);
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