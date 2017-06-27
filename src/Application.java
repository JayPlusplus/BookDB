// interact with user
//Create a method that returns the pricing for a requested number of books. Five books at $20.00 should return $100, 
//if they are in stock. If they are not in stock, that should be handled appropriately (hint - you decide
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		//Book b = new Book();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input your sku #");
		input = keyboard.next();
		Book b = BookDB.returnBook(input);
		b.printDescription();
		System.out.println();
		System.out.println("How many books do you need?");
		int quantity = keyboard.nextInt();
		b.printPrice(quantity);

	}

}
