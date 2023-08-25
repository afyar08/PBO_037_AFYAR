package minggu1;

/**
 *
 * @author HP
 */
public class welcome {
    // Metode utama yang akan dieksekusi saat program berjalan
    public static void main(String[] args) {
        // Auto-generated method stub

        // Mendefinisikan variabel "greeting" dengan nilai awal "Welcome to Core Java"
        String greeting = "Welcome to Core Java!";

        // Mencetak isi dari variabel "greeting" ke konsol
        System.out.println(greeting);

        // Loop untuk mencetak tanda "=" sebanyak panjang "greeting"
        for (int i = 0; i < greeting.length(); i++)
            System.out.print("=");

        // Mencetak baris kosong untuk pemisah
        System.out.println();
    }
}
