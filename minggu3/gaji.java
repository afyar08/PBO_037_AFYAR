package minggu3;
import java.util.*;

/**
 * @author Afyar
 */

public class gaji {
	 public static void main(String[] args) {
		 int gajipokok = 500000;
		 int potongangaji = 0;
		 int bonus = 0;
		 int totalpenjualan = 0;
		 int itemterjual = 0;
		 int gajibersih = 0;
		 
		 Scanner sc= new Scanner(System.in);
		 itemterjual = sc.nextInt();
		 totalpenjualan = itemterjual * 50000;
		 
		 if (itemterjual < 15) {
			 potongangaji = (15*(750000 - totalpenjualan))/100;
			 gajibersih = gajipokok - potongangaji;
		 } else if (itemterjual >= 15 && itemterjual < 40) {
			 bonus = (10*totalpenjualan)/100;
			 gajibersih = gajipokok + bonus;
		 } else if (itemterjual >= 40 && itemterjual <=80) {
			 bonus = (25*totalpenjualan)/100;
			 gajibersih = gajipokok + bonus;
		 } else if (itemterjual < 80) {
			 bonus = (25*totalpenjualan)/100;
			 gajibersih = gajipokok + bonus;
		 } else if (itemterjual > 80) {
			 bonus = (35*totalpenjualan)/100;
			 gajibersih = gajipokok + bonus;
		 }
		 System.out.println(gajibersih);
	 }
}
