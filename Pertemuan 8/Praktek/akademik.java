/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sabrina
 */
public class akademik {
    public static void main(String[] args){
        Dsn.nip= "A11";
        Dsn.nama = "";
        Dsn.mata_kuliah = "Pemograman Berbasis Objek";
        Dsn.Cetak();
        
        Mhs Mhs = new mhs();
        Nim = "A11.2019.11738";
        Mhs.nama = "Sabrina Maulida";
        Mhs.Cetak();
        
        Matkulp = new Matkulp();
        Matkulp.matkulp = "Pemograman Berbasis Objek";
        Matkulp.Cetak();
        
        mata matkult = new mata();
        matkult.matkult = "Basis Data";
        matkult.Cetak();
        
        Nilai Nilai = new Nilai();
        nilai.np = 70;
        nilai.nt = 80;
        nilai.Cetak();
        
    }
}

}
