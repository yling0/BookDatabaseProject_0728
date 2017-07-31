package bookdatabase;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class BookAPP {
	/*
	 * Create a class that contains a method that takes one parameter, the SKU, 
	 * and returns a corresponding book object. 
	 */
	
	
	public static void main(String[] args){
		
		String insku;
		
		ArrayList<Books> array = new ArrayList<Books>();
		array = init ();
		
		int indicator=1; String ans;
		do {
			
		System.out.println("Enter the SKU to search:");
		Scanner insku1 = new Scanner (System.in);
		insku = insku1.nextLine();
		
		
		
		indicator = 1;
		for (Books item : array) {
			
			if (insku.equalsIgnoreCase(item.getSKU())) {
				System.out.println("SKU: " + item.getSKU() +";  TITLE: " +item.getTitle() +";  AUTHOR: " +item.getAuth() +";  DESCRIPTION: "+ item.getDescr() +";  PRICE: "+ item.getPrice());
			}
			//System.out.println("SKU: " + item.getSKU() +";  TITLE: " +item.getTitle() +";  AUTHOR: " +item.getAuth() +";  DESCRIPTION: "+ item.getDescr() +";  PRICE: "+ item.getPrice());
		}
		
		System.out.println("Do you want to continue the search (y/n)");
		Scanner ans1 = new Scanner (System.in);
		ans = ans1.nextLine();
		if (ans.equalsIgnoreCase("n")) {
			indicator = 0;
		}
		
		} while (indicator == 1);
		
		
				
	}

	
	private static void showBookList(ArrayList<Books> array) {
		// TODO Auto-generated method stub
		System.out.println("List");
		
		for (int i = 0; i < array.size(); i++);
		Books item = array.get(0);
		System.out.println(item.sku+"");
		
			
	
	}





	private static ArrayList<Books> init() {
		ArrayList<Books> array = new ArrayList<Books>();
		// TODO Auto-generated method stub
		Books b1 = new Books();
		b1.setSKU("Java1001");
		b1.setTitle("Head First Java");
		b1.setAuth("Kathy Sierra and Bert Bates");
		b1.setDescr("Easy to read Java workbook");
		b1.setPrice(47.50);
		
		Books b2 = new Books();
		b2.setSKU("Java1002");
		b2.setTitle("Thinking in Java");
		b2.setAuth("Bruce Eckel");
		b2.setDescr("Details about Java under the hood");
		b2.setPrice(20.00);
		
		Books b3 = new Books();
		b3.setSKU("Orcl1003");
		b3.setTitle("OCP: Oracle Certified Professional Java SE");
		b3.setAuth("Jeanne Boyarsky");
		b3.setDescr("Everything you need to know in one place");
		b3.setPrice(45.00);
		
		Books b4 = new Books();
		b4.setSKU("Python1004");
		b4.setTitle("Automate the Boring Stuff with Python");
		b4.setAuth("Al Sweigart");
		b4.setDescr("Fun with Python");
		b4.setPrice(10.50);
		
		Books b5 = new Books();
		b5.setSKU("Zombie1005");
		b5.setTitle("The Maker's Guide to the Zombie Apocalypse");
		b5.setAuth("Simon Monk");
		b5.setDescr("Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi");
		b5.setPrice(16.50);
		
		Books b6 = new Books();
		b6.setSKU("Rasp1006");
		b6.setTitle("Raspberry Pi Projects for the Evil Genius");
		b6.setAuth("Donald Norris");
		b6.setDescr("A dozen fiendishly fun projects for the Raspberry Pi!");
		b6.setPrice(14.75);
		
		array.add(b1);
		array.add(b2);
		array.add(b3);
		array.add(b4);
		array.add(b5);
		array.add(b6);
		
		
		return array;
		
	}
	


}
