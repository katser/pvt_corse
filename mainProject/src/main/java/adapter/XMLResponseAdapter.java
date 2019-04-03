package adapter;

public class XMLResponseAdapter extends JSONResponse {

	XMLObject xMLObject;

	public XMLResponseAdapter(XMLObject xMLObject) {
		super();
		this.xMLObject = xMLObject;
	}

	@Override
	public JSONObject getJSONObject() {
		return new JSONObject("price: '25';");
	}
}
