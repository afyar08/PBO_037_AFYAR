package minggu3;
import java.util.Scanner;

/**
 * @author Afyar
 */

public class jalan {
	public static void main(String[] args) {
		int index = 0;
		String gabung, hasil;
		Scanner sc =new Scanner(System.in);
		
		gabung = sc.nextLine();
		String[] pisah = gabung.split("[ ]+");
		hasil = pisah[0]+pisah[2]+pisah[3];
		long hasilKonversi = Long.parseLong(hasil);
		
		hasilKonversi = hasilKonversi-999999;
		
		if (hasilKonversi % 5 != 0) {
			System.out.println("berhenti");
		} else {
			System.out.println("jalan");
		}
	}
}
