package com.ivanfaathirza.massajenis;

/**
 *
 * @author Ivan
 * NAMA         : Ivan Faathirza
 * KELAS        : IF1
 * NIM          : 10119003
 * Deskripsi Program : program ini untuk menghitung massa jenis kubus menggunakan
 * getter dan setter dengan berorientasi objek
 */

public class IF110119003Latihan41 {

    public static void main(String[] args) {
        Kubus kubus = new Kubus();
		kubus.setSisi(5);
		kubus.setMassa(250);
		int volume = kubus.hitungVolume(kubus.getSisi());
		int massaJenis = kubus.hitungMassaJenis(volume, kubus.getMassa());
	    System.out.println("======Massa Jenis Kubus======");
	    System.out.println("Sisi : " + kubus.getSisi());
	    System.out.println("Massa : " + kubus.getMassa());
		System.out.println("======Hasil Perhitungan======");
		System.out.println("Volume : " + volume);
		System.out.println("Massa Jenis : " + massaJenis);
    }
}
