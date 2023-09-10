package minggu3;
import java.util.*;

/**
 * @author Afyar
 */

public class soal1 {
	static Scanner keyboard = new Scanner (System.in);
    public static void main(String[] args) {
    	String s;
        int n,k;
        
        System.out.println("ketikkan kata : ");
        s = keyboard.nextLine();
        
        String[] stringarr = s.split("[!,?._' @]+");
        
        n = stringarr.length;
        
        System.out.println("jumlah kata : "+n);
        k = 1;
        	for(int i=0; i < n; i++){
        		System.out.println("kata "+k + " : "+stringarr[i]);
        		k = k+1;
        }
    }
}