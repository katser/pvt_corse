package homework11;

public class Button {
	private String name;
	private String action;

	public Button(String name, String action) {
		this.name = name;
		this.action = action;
	}





	public String toString() {
		return "Button [" + (name != null ? "name=" + name + ", " : "") + (action != null ? "action=" + action : "")
				+ "]";
	}
	
	
	

}
