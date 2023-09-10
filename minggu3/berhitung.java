package minggu3;
import java.util.Scanner;

/**
 * @author Afyar
 */

public class berhitung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca input
        System.out.print("Masukkan inputan : ");
        int angkaA = scanner.nextInt();
        String operator = scanner.next();
        int angkaB = scanner.nextInt();

        // Melakukan operasi matematika
        int hasil = 0;

        switch (operator) {
            case "+":
                hasil = angkaA + angkaB;
                break;
            case "-":
                hasil = angkaA - angkaB;
                break;
            case "*":
                hasil = angkaA * angkaB;
                break;
            case "/":
                if (angkaB != 0) {
                    hasil = angkaA / angkaB;
                } else {
                    System.out.println("Pembagian oleh nol tidak diizinkan.");
                    System.exit(1); // Keluar dari program jika terjadi pembagian oleh nol
                }
                break;
            case "%":
                if (angkaB != 0) {
                    hasil = angkaA % angkaB;
                } else {
                    System.out.println("Modulus oleh nol tidak diizinkan.");
                    System.exit(1); // Keluar dari program jika terjadi modulus oleh nol
                }
                break;
            default:
                System.out.println("Operator tidak valid.");
                System.exit(1); // Keluar dari program jika operator tidak valid
        }

        // Menampilkan hasil
        System.out.println("Hasil " + angkaA + " " + operator + " " + angkaB + " adalah: " + hasil);

        scanner.close();
    }
}
