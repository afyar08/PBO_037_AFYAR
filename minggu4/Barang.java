/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventori;

/**
 *
 * @author Afyar
 */
public class Barang {
    String kode_barang;
    String nama_barang;
    int stok;
    
    public Barang(String kode, String nama, int stk) { 
    kode_barang = kode;
    nama_barang = nama; 
    stok = stk;
    }
    
    public int getStock() {
        return stok;
    }
    
    public void setStok(int stok){
        this.stok += stok;
    }
}
