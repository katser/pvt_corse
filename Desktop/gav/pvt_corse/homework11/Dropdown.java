package homework11;

import java.util.List;

public class Dropdown {
	
	List<String> options;
	boolean isSelected;
	String name;
	public Dropdown(List<String> options, boolean isSelected, String name) {
		super();
		this.options = options;
		this.isSelected = isSelected;
		this.name = name;
	}
	public String toString() {
		return "Dropdown [" + (options != null ? "options=" + options + ", " : "") + "isSelected=" + isSelected + ", "
				+ (name != null ? "name=" + name : "") + "]";
	}
	
	

}
