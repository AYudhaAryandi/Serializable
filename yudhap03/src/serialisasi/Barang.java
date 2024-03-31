/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialisasi;

import java.io.Serializable;

/**
 *
 * @author ydh
 */
public class Barang implements Serializable {
    private final String merek = "Khong Guan"; // contoh buat keyword final
    private String jenis; 
    private transient String kodebarang; //contoh buat keyword transient
    
    public Barang(String merek, String jenis, String kodebarang){
        this.jenis = jenis;
        this.kodebarang = kodebarang;
    }
    
    public String toString(){
        return "\r\nmerek=" + merek + "\r\njenis =" + jenis + "\r\nkode barang =" + kodebarang + "\r\n";
    }
}
