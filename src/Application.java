// interact with user
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
		
	}

}
