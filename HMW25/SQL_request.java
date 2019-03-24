package group23.HMW25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import group23.HMW25.Content;

public class SQL_request {
	Content content;

	public SQL_request(Content content) {
		this.content = content;
	}

	public Content getContent() {
		return content;
	}

	public void fill() {
		String login = null;
		String password = null;
		String email = null;
		String income = null;
		String emailSubject = null;
		String url = "jdbc:mysql://localhost:3306/sys?useSSL=false";
		String userDB = "root";
		String passwordDB = "11111111";

		String query = "SELECT * FROM test.users";
		try (Connection con = DriverManager.getConnection(url, userDB, passwordDB);
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(query)) {
			if (rs.next()) {
				login = rs.getString(1);
				content.setLogin(login);

				password = rs.getString(2);
				content.setPassword(password);

				email = rs.getString(3);
				content.setEmail(email);

				emailSubject = rs.getString(5);
				content.setEmailSubject(emailSubject);

				income = rs.getString(6);
				content.setIncome(income);

			}

			rs.close();
		} catch (SQLException ex) {
			ex.printStackTrace();

		}

	}

}