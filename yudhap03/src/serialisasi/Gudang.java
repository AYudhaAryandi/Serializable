/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialisasi;

import java.io.Serializable;
import java.util.List;
/**
 *
 * @author ydh
 */
public class Gudang implements Serializable{
    private String id;
    private String tipebarang;
    private List<Barang> barangs;
    
    public void setId(String id){
        this.id =id;
    }
    public void setTipe(String tipebarang){
        this.tipebarang = tipebarang;
    }
    
    public List<Barang> getBarangs() {
        return barangs;
    }
    public void setBarangs(List<Barang> barangs){
        this.barangs = barangs;
    }
    
    @Override
    public String toString(){
        String Barang, item = "";
        Barang = "Gudang : \r\n"
                + "id = " + id + "\r\n"
                +"tipebarang=" + tipebarang + "\r\n"
                + "=========================\r\n"
                + "Detail:\r\n";
        item = barangs.stream().map((obj)->
    obj.toString()).reduce(item, String::concat);
        return Barang + item;
    }
    
}
