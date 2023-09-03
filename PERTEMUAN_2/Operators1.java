/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operators1;
/**
 * @author Afyar
 */
public class Operators1 {
    static short methodOne(long l)
    {
        int i = (int) l;
        return (short)i;
    }
    public static void main(String[] args) {
         double d = 10.25;
        System.out.println("Nilai d : " + d);
        float f = (float) d;
        byte b = (byte) methodOne((long) f);
        System.out.println("Nilai b : " + b);
    }
}
