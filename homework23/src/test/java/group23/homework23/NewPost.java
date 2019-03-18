package group23.homework23;

import java.io.IOException;
import java.net.URISyntaxException;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.Assert;

import org.junit.Test;
import org.xml.sax.SAXException;

public class NewPost {
	private HttpClient client = HttpClientBuilder.create().build();
	/*
	 * получение бессрочного токена:
	 * https://oauth.vk.com/authorize?client_id=6900999&display=page&redirect_uri=
	 * https://oauth.vk.com/blank.html&callback&scope=offline&
	 * wall&response_type=token&v=5.92&state=123456
	 */

	@Test
	public void NewPost() throws ClientProtocolException, IOException, URISyntaxException,

			UnsupportedOperationException, SAXException, ParserConfigurationException {

		URIBuilder builder = new URIBuilder("https://api.vk.com/method/wall.post?");
		builder.setParameter("access_token",
				"1cc77419721fc7f01fe0a3c3ec26de02a5f50a8cc103d8a0ade704e63b205c3fb7b7c30f3ddea8cdf8f0e")
				.setParameter("owner_ids", "morkibka").setParameter("message", "gav").setParameter("v", "5.92");
		HttpGet request = new HttpGet(builder.build());
		HttpResponse response = client.execute(request);
		int postId = Integer.parseInt(EntityUtils.toString(response.getEntity()).replaceAll("\\D+", ""));
		System.out.println("postId " + postId);
		Assert.assertTrue(postId >= 1);
	}

}
