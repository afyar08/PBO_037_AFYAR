package minggu3;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Afyar
 */


public class bignumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String angka1 = sc.nextLine();
		String angka2 = sc.nextLine();
		BigInteger angk1 = new BigInteger(angka1);
		BigInteger angk2 = new BigInteger(angka2);
		System.out.println(angk1.add(angk2));
		System.out.println(angk1.multiply(angk2));
	}
}
