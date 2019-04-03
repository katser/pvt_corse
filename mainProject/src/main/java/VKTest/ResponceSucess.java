package VKTest;

import adapter.JSONObject;
import adapter.JSONResponse;
import adapter.XMLResponse;
import adapter.XMLResponseAdapter;

public class ResponceSucess {
	public boolean isApiResponseSuccessfully(String responseString) {
		JSONObject JSONObject = new JSONObject(responseString);
		JSONResponse jSONResponse = new JSONResponse(JSONObject);
		XMLResponse xMLResponse = new XMLResponse();
		XMLResponseAdapter XMLResponseAdapter = new XMLResponseAdapter(xMLResponse.getXMLObject());
		return jSONResponse.isJSONEqual(XMLResponseAdapter.getJSONObject());
	}
}