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
public class Dosen extends Manusia {
    
    private String nip;
    private String mataKuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public void mengajarApa() {
        System.out.println("Saya "+nama+" umur "+umur+" tahun sedang mengajar matakuliah "+mataKuliah);
    }
    public void siapaKamu() {
        System.out.println("Saya Dosen");
    }
}
