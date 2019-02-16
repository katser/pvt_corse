package homework11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;

public class Page {
	private ArrayList<Button> button;
	private LinkedList<Field> field;
	private HashSet<Label> label;
	private HashMap<String, Dropdown> dropdown;
	private float id;
	private String title;
	

	public Page() {
		this.button = new ArrayList<Button>();
		this.field = new LinkedList<Field>();
		this.label = new HashSet<Label>();
		this.dropdown = new HashMap<String, Dropdown>();
		this.id = 0f;
		this.title = "";
	}

	public void addArrayList(Button btn) {
		this.button.add(btn);
	}

	public void addLinkedList(Field fld) {
		field.add(fld);
	}

	public void addHashSet(Label lbl) {
		label.add(lbl);
	}

	public void addHashMap(String title, Dropdown drpd) {
		dropdown.put(title, drpd);
	}

	public void removeArrayList(Button btn) {
		try {
			System.out.println(button.remove(btn));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void removeLinkedList(Field fld) {
		System.out.println(field.remove(fld));
	}

	public void removeHashSet(Label lbl) {
		System.out.println(label.remove(lbl));
	}

	public void removeHashMap(String ttl) {
		if (dropdown.containsKey(ttl)) {
			dropdown.remove(ttl);
			System.out.println("success");
		}
		}
	

	public void removeHashMap(String ttl, Dropdown drpd) {
		
		System.out.println(dropdown.remove(ttl, drpd));
	}

	public void replaceArrayList(int ind, Button btn) {
		button.set(ind, btn);
		

	}

	public void replaceLinkedList(int ind, Field fld) {
		field.set(ind, fld);
	}

	public void replaceHashSet(Label a, Label b) {
		if (label.contains(a)) {
			label.remove(a);
			label.add(b);
			System.out.println("success");

		} 
	}

	public void replaceHashMap(String ttl, Dropdown drpd) {
		if (dropdown.containsKey(ttl)) {
			dropdown.replace(ttl, drpd);
			System.out.println("success");

		}
		
	}

	public void replaceHashMap(String ttl, Dropdown a, Dropdown b) {
		System.out.println(dropdown.replace(ttl, a, b));
	}

	public void printArrayList() {
		System.out.println("ArrayList collection: [name][action]");
		for (Button b : button) {
			System.out.println(b);
		}
	}

	public void printLinkedList() {
		System.out.println("LinkedList collection: [id][value]");
		for (Field f : field) {
			System.out.println(f);
		}
	}

	public void printHashSet() {
		System.out.println("HashSet collection: [name]");
		for (Label lab : label) {
			System.out.println(lab);
		}
	}

	public void printHashMap() {
		System.out.println("HashMap collection: [List options][isSelected][name]");
		for (Map.Entry<String, Dropdown> dr : dropdown.entrySet()) {
			System.out.println("Key: " + dr.getKey() + "  Value: " + dr.getValue().toString());
		}
	}

	



	


}
