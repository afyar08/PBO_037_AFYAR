package minggu3;
import java.util.Scanner;

/**
 * @author Afyar
 */

public class soal2 {
	public static void main(String[] args) {
		System.out.println("================================");
		Scanner sc= new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			String myString = sc.next();
			int number = sc.nextInt();
			System.out.printf("%-14s %03d\n", myString, number);
		}
		System.out.println("================================");
	}
}

