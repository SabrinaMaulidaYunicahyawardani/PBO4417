/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sabrina
 */
public class dosen {
        public class dosenn extends akademik{
    String nama;
    
    public dosen(){
        
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }

    public void Cetak(){
        System.out.println("NAMA DOSEN PENGAMPU");
    }
 }
}
