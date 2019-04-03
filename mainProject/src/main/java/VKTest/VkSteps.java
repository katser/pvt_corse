package VKTest;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.net.URISyntaxException;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.http.client.ClientProtocolException;
import org.xml.sax.SAXException;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import VKTest.VkAPI;

public class VkSteps {
	private static VkAPI vkApi;

	public VkSteps() {
		vkApi = new VkAPI();
	}

	@When("^I post message$")
	public void postMessage() throws ClientProtocolException, UnsupportedOperationException, IOException,
			URISyntaxException, SAXException, ParserConfigurationException {
		vkApi.NewPost();

	}

	@Then("^I see post on wall$")
	public void isMessagePosted() {
		assertTrue(vkApi.postId >= 1);
	}

	@When("^I delete post$")
	public void editMessage() {
		try {
			vkApi.DeletePost();
		} catch (UnsupportedOperationException | IOException | URISyntaxException | SAXException
				| ParserConfigurationException e) {
			e.printStackTrace();
		}
	}

	@Then("^I cant see my post$")
	public void isMessageEdited() {
		assertTrue(vkApi.responseCode == 1);

	}

}