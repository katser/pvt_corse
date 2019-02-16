package homework11;

import java.util.Arrays;
import java.util.List;

public class Toster {

	
	public static void main(String[] args) {
		
		Page pg = new Page();
		
		Button btn0 = new Button("accept", "btn0");
		Button btn1 = new Button("Buy", "btn1");
		Button btn2 = new Button("Close", "pls");
		Button btn3 = new Button("help", "AAAAAAA");
		Button btn4 = new Button("x_x", "btn4");
		Field fld0 = new Field('a', "d");
		Field fld1 = new Field('b', "c");
		Field fld2 = new Field('c', "kill");
		Field fld3 = new Field('m', "e");
		Label lbl0 = new Label("p");
		Label lbl1 = new Label("l");
		Label lbl2 = new Label("s");
		Label lbl3 = new Label("1");
		List<String> lst0 = Arrays.asList("a", "b");
		List<String> lst1 = Arrays.asList("O", "w", "O");
		Dropdown drpd0 = new Dropdown(lst0, true, "drpd0");
		Dropdown drpd1 = new Dropdown(lst1, true, "drpd1");
		Dropdown drpd2 = new Dropdown(Arrays.asList("U", "w", "U"), false, "drpd3");
		Dropdown drpd3 = new Dropdown(Arrays.asList("3"), true, "drpd4");

		pg.addArrayList(btn0);
		pg.addArrayList(btn1);
		pg.addArrayList(btn2);
		pg.addArrayList(btn3);
		pg.addArrayList(btn4);
		pg.printArrayList(); 
		pg.removeArrayList(btn0);
		pg.replaceArrayList(1, btn4); 
		pg.printArrayList();
		pg.addLinkedList(fld0);
		pg.addLinkedList(fld1);
		pg.addLinkedList(fld2);
		pg.addLinkedList(fld3);
		pg.printLinkedList(); 
		pg.removeLinkedList(fld2); 
		pg.replaceLinkedList(1, fld0);
		pg.printLinkedList();
		pg.addHashSet(lbl0);
		pg.addHashSet(lbl1);
		pg.addHashSet(lbl2);
		pg.addHashSet(lbl3);
		pg.printHashSet();
		pg.replaceHashSet(lbl3, lbl0);
		pg.removeHashSet(lbl0);
		pg.printHashSet();
		pg.addHashMap("what", drpd0);
		pg.addHashMap("the", drpd1);
		pg.addHashMap("hell", drpd2);
		pg.addHashMap("is", drpd3);
		pg.removeHashMap("is");
		pg.removeHashMap("hell", drpd2);
		pg.replaceHashMap("the", drpd0);
		pg.replaceHashMap("hell", drpd1, drpd3);
		pg.printHashMap();


	

		
		
	}

		
}
