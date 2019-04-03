package parser;

public class DataTest {
	private int id;

	private String Mail;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMail() {
		return Mail;
	}

	public void setMail(String mail) {
		Mail = mail;
	}

	@Override
	public String toString() {
		return this.Mail;
	}
}