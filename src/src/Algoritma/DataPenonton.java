package Algoritma;

import javax.print.DocFlavor;
import java.util.LinkedList;
import java.util.Queue;

public class DataPenonton {
    private String nama;
    private String nomorgenre;
    private String genre;
    private String nomorpaket;
    private String jumlahorang;
    private String paket;
    private String harga;
    private String totalbayar;
    private String antrian;
    private String antrian2;

    public DataPenonton(){
    }
    public DataPenonton(String nama,
                        String nomorgenre,
                        String genre,
                        String nomorpaket,
                        String jumlahorang,
                        String paket,
                        String harga,
                        String totalbayar,
                        String antrian,
                        String antrian2){
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomorgenre() {
        return nomorgenre;
    }

    public void setNomorgenre(String nomorgenre) {
        this.nomorgenre = nomorgenre;
    }

    public String getGenre() {
        char kodegenre = nomorgenre.charAt(0);
        if (kodegenre == '1') {
            return "Komedi";
        } else if (kodegenre == '2') {
            return "Horor";
        } else if (kodegenre == '3') {
            return "Action";
        } else if (kodegenre == '4') {
            return "Romance";
        } else if (kodegenre == '5') {
            return "Sci-Fi";
        } else if (kodegenre == '6') {
            return "Fantasy";
        }
        return "Unknown";
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getNomorpaket() {
        return nomorpaket;
    }
    public void setNomorpaket(String nomorjumlah){
        this.nomorpaket = nomorjumlah;
    }
    public  String getJumlahorang(){
        return jumlahorang;
    }

    public void setJumlahorang(String jumlahorang){
        this.jumlahorang = jumlahorang;
    }

    public String getPaket(){
        char kodeorang = nomorpaket.charAt(0);
        if (kodeorang == '1'){
            return "Satu Orang";
        } else if (kodeorang == '2'){
            return "Diskon 15 %";
        } else if (kodeorang == '3'){
            return "diskon 10 %";
        }
        return "Unknown";
    }

    public void setPaket(String paket) {
        this.paket = paket;
    }

    public String getHarga(){
        return harga;
    }
    public void setHarga(String harga){
        this.harga = harga;
    }

    public String getTotalbayar() {
        return totalbayar;
    }

    public void setTotalbayar(String totalbayar) {
        this.totalbayar = totalbayar;
    }

    public String getAntrian() {
        //Membuat dan menginisialisasi interface queue menggunakan objek linked list
        Queue<String> antrianBioskop = new LinkedList<>();
        //menambahkan data atau nilai element baru ke list queue (Operasi Enqueue)
        antrianBioskop.add("Anggun Tri Utami");
        antrianBioskop.add("Muhammad Vio");
        antrianBioskop.add("Yaskur Bearly");
        antrianBioskop.add("Erni Julita");
        antrianBioskop.add("Natasya");
        return "Dalam Antrian : " + getNama() + " | Daftar Antrian Baru : " + antrianBioskop;
    }

    public void setAntrian(String antrian) {
        this.antrian = antrian;
    }
    public String getAntrian2() {
        //Membuat dan menginisialisasi interface queue menggunakan objek linked list
        Queue<String> antrianBioskop = new LinkedList<>();
        //menambahkan data atau nilai element baru ke list queue (Operasi Enqueue)
        antrianBioskop.add("Anggun Tri Utami");
        antrianBioskop.add("Muhammad Vio");
        antrianBioskop.add("Yaskur Bearly");
        antrianBioskop.add("Erni Julita");
        antrianBioskop.add("Natasya");
        String nama = antrianBioskop.remove();
        return "Menghapus Dari Antrian : " + getNama() + " | Dalam Antrian : " + nama + " | Daftar Antrian Baru : " + antrianBioskop;
    }
    public void setAntrian2(String antrian2){
        this.antrian2 = antrian2;
    }
}
