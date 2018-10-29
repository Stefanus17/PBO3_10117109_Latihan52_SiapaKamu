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
public class Mahasiswa extends Manusia {
    
    private String nim;
    private String kelas;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void kelasApa() {
        System.out.println("Saya "+nama+" umur "+umur+" tahun sedang belajar di kelas "+kelas);
    }

    public void siapaKamu() {
        System.out.println("Saya Mahasiswa");
    }
}
