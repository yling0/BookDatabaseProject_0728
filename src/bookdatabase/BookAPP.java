package bookdatabase;


import java.util.ArrayList;
import java.util.Scanner;

public class BookAPP {
	/*
	 * Create a class that contains a method that takes one parameter, the SKU, 
	 * and returns a corresponding book object. 
	 */
	public static void main(String[] args){
		ArrayList<Books> array = new ArrayList<Books>();
		init (array);
		
		while (true){
			mainMenu();
			
			int choose = chooseFunction();
			switch (choose){
			case 1:
				showBookList(array);
				break;
				
			}
			
		}
				
	}

	
	private static void showBookList(ArrayList<Books> array) {
		// TODO Auto-generated method stub
		System.out.println("List");
		
		for (int i = 0; i < array.size(); i++);
		Books item = array.get(0);
		System.out.println(item.sku+"");
		
			
	
	}


	private static int chooseFunction() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		return 0;
	}


	private static void mainMenu() {
		// TODO Auto-generated method stub
		System.out.println("Choose options: 1 for show Booklist");
		
	
	}


	private static void init(ArrayList<Books> array) {
		// TODO Auto-generated method stub
		Books b1 = new Books();
		b1.sku = "Java1001";
		b1.title = "Head First Java";
		b1.auth = "Kathy Sierra and Bert Bates";
		b1.descr = "Easy to read Java workbook";
		b1.price = 47.50;
		
		Books b2 = new Books();
		b2.sku = "Java1002";
		b2.title = "Thinking in Java";
		b2.auth = "Bruce Eckel";
		b2.descr = "Details about Java under the hood";
		b2.price = 20.00;
		
		Books b3 = new Books();
		b3.sku = "Orcl1003";
		b3.title = "OCP: Oracle Certified Professional Java SE";
		b3.auth = "Jeanne Boyarsky";
		b3.descr = " 	Everything you need to know in one place";
		b3.price = 45.00;
		
		Books b4 = new Books();
		b4.sku = "Python1004";
		b4.title = "Automate the Boring Stuff with Python";
		b4.auth = "Al Sweigart";
		b4.descr = "Fun with Python";
		b4.price = 10.50;
		
		Books b5 = new Books();
		b5.sku = "Zombie1005";
		b5.title = "The Maker's Guide to the Zombie Apocalypse";
		b5.auth = "Simon Monk";
		b5.descr = "Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi";
		b5.price = 16.50;
		
		Books b6 = new Books();
		b6.sku = "Rasp1006";
		b6.title = "Raspberry Pi Projects for the Evil Genius";
		b6.auth = "Donald Norris";
		b6.descr = "A dozen fiendishly fun projects for the Raspberry Pi!";
		b6.price = 14.75;
		
		array.add(b1);
		array.add(b2);
		array.add(b3);
		array.add(b4);
		array.add(b5);
		array.add(b6);
		
		
		
		
	}
	


}
