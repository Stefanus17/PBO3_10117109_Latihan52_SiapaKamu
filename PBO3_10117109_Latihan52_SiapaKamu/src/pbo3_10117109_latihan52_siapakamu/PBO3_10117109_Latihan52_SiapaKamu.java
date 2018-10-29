/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117109_latihan52_siapakamu;

/**
 * Nama  : Stefanus Saputra
 * NIM   : 10117109
 * Kelas : IF 3
 * Deskripsi Program : program ini berisi program untuk menampilkan siapa anda, yaitu 
* terdapat manusia, dosen, dan mahasiswa sesuai dengan kententuan
 */
public class PBO3_10117109_Latihan52_SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen dosen = new Dosen();
        dosen.setNip("41227829930");
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");

        System.out.println("NIP DOSEN : "+dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNim("10117109");
        mahasiswa.setNama("Stefanus Saputra");
        mahasiswa.setUmur(19);
        mahasiswa.setKelas("PBO3");

        System.out.println("\nNIP MAHASISWA : "+mahasiswa.getNim());
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();
    }
    
}
