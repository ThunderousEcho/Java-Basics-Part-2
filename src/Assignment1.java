import java.util.Scanner;

public class Assignment1 {
	public static void Go(Scanner scanner) {
		
		System.out.println("Type several numbers. Type 0 when done.");
		
		int sum = 0;
		while (true) {
			int read = scanner.nextInt();
			if (read == 0) {
				break;
			} else {
				sum += read;
			}
		}
		
		System.out.println("The sum is " + sum + ".");
	}
}
