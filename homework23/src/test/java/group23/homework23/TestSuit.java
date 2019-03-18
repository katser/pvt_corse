package group23.homework23;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ NewPost.class, EditPost.class, DeletePost.class })

public class TestSuit {
	public static void main(String[] args) {
	}
}