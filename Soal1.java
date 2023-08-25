package minggu1;

public class Soal1 {       
	// Mendefinisikan kelas bernama Soal1
	
    public static void main(String[] args) {     
    	// Metode utama
        byte angka1 = 125;       
        // Mendeklarasikan variabel angka1 dengan nilai 125
        byte angka2 = 6;        
        // Mendeklarasikan variabel angka2 dengan nilai 6
        byte hasil = (byte) (angka1 + angka2);   
        //Mendeklarasikan variabel hasil sebagai hasil penjumlahan angka1 dan angka2, 
        //dengan pemunculan (casting) ke byte
        
        System.out.println("hasil =" + hasil);  
        // Mencetak keluaran berisi teks "hasil =" diikuti oleh nilai variabel hasil
    }
}   // Menutup kelas Soal1
