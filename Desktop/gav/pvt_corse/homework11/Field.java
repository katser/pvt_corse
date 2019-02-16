package homework11;

public class Field {
	
	int id;
	String value;
	public Field(int id, String value) {
		super();
		this.id = id;
		this.value = value;
	}

	public String toString() {
		return "Field [id=" + id + ", " + (value != null ? "value=" + value : "") + "]";
	}
	

}
