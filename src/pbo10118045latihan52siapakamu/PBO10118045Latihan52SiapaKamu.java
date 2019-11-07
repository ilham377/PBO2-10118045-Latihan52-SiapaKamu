/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan52siapakamu;

/**
 *
 * @author
 *  Nama              : Muhammad Ilham Apriyadi
 *  Kelas             : IF2
 *  NIM               : 10118045
 *  Deskripsi Program : Program SiapaKamu
 */
public class PBO10118045Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Manusia manusia1;
        Manusia manusia2;
        
        Dosen dosen = new Dosen();
        manusia1 = new Dosen();
        dosen.setNip("41227829930");
        System.out.println("NIP DOSEN : "+dosen.getNip());
        manusia1.siapaKamu();
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");
        dosen.mengajarApa();
        System.out.println("");
        Mahasiswa mahasiswa = new Mahasiswa();
        manusia2 = new Mahasiswa();
        mahasiswa.setNim("10110269");
        System.out.println("NIM MAHASISWA : "+mahasiswa.getNim());
        manusia2.siapaKamu();
        mahasiswa.setNama("Nindi");
        mahasiswa.setUmur(17);
        mahasiswa.setKelas("PBO2");
        mahasiswa.kelasApa();
        
    }
    
}
