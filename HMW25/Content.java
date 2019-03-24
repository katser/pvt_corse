package group23.HMW25;

public class Content {
	private String login;
	private String password;
	private String email;
	private String emailSubject;
	private String income;

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public String getEmailSubject() {
		return emailSubject;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
	}

	public String getIncome() {
		return income;
	}

	void setIncome(String income) {
		this.income = income;
	}

}