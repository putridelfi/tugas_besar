/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tb;

/**
 *
 * @author putri
 */
import java.util.Scanner;
public class Input {
 // deklarasi variabel identitas ruangkelas
    private String namaruang;
    private String lokasiruang;
    private String fakultas;
    
//deklarasi variabel kondisi ruangkelas
    private int panjang;
    private int lebar;
    private int Jumlahkursi;
    private int jumlahpintu;
    private int jumlahjendela;
    
//deklarasi variabel jumlah kondisi dan posisi sarana
    private int jumlahstopkontak;
    private String kondisistopkontak;
    private String posisistopkontak;
    
    private int jumlahkabellcd;
    private String kondisikabellcd;
    private String posisikabellcd;
    
    private int jumlahlampu;
    private String kondisilampu;
    private String posisilampu;
    
    private int jumlahkipasangin;
    private String kondisikipasangin;
    private String posisikipasangin;
    
    private int jumlahAC;
    private String kondisiAC;
    private String posisiAC;
    
    private String pilihSSID;
    private int bandwidth;
    
    private int jumlahCCTV;
    private String kondisiCCTV;
    private String posisiCCTV;
    
//deklarasi variabel lingkungan ruangkelas
    private String kondisilantai;
    private String kondisidinding;
    private String kondisiatap;
    private String kondisipintu;
    private String kondisijendela;
    
//deklarasi variabel kebersihan ruangkelas
    private String inputsirkulasiudara;
    private int pencahayaan;
    private int kelembapan;
    private int suhu;
    
//deklarasi variabel kenyamanan ruangkelas
    private String kebisingan;
    private String bau;
    private String kebocaran;
    private String kerusakan;
    private String keausan;
    
//deklarasi variabel keamanan ruangkelas
    private String kekokohan;
    private String kuncipintudanjendela;
    private String bahaya;
    
    private double luas;
    private double rasio;
    private double bentuk;
      
public void insert (){
    Scanner in = new Scanner (System.in);
    // inputan identitas ruang kelas
        System.out.println("Masukkan nama ruang :");
        this.namaruang=in.next();
        System.out.println("Masukkan lokasi ruang :");
        this.lokasiruang=in.next();
         System.out.println("Masukkan fakultas :");
        this.fakultas=in.next();
        
    // inputan kondisi ruang kelas
        System.out.println("Masukkan panjang ruang :");
        this.panjang=in.nextInt();
        System.out.println("Masukkan lebar ruang :");
        this.lebar=in.nextInt();
        System.out.println("Masukkan jumlah kursi :");
        this.Jumlahkursi=in.nextInt();
        System.out.println("Masukkan jumlah pintu :");
        this.jumlahpintu=in.nextInt();
        System.out.println("Masukkan jumlah jendela :");
        this.jumlahjendela=in.nextInt();
        
    // inputan jumlah,kondisi,posisi sarana
        System.out.println("Masukkan jumlah stopkontak :");
        this.jumlahstopkontak=in.nextInt();
        System.out.println("Masukkan kondisi stopkontak :");
        this.kondisistopkontak=in.next();
        System.out.println("Masukkan posisi stopkontak:");
        this.posisistopkontak=in.next();
        
        System.out.println("Masukkan jumlah kabellcd :");
        this.jumlahkabellcd=in.nextInt();
        System.out.println("Masukkan kondisi kabellcd:");
        this.kondisikabellcd=in.next();
        System.out.println("Masukkan posisi kabellcd:");
        this.posisikabellcd=in.next();
        
        System.out.println("Masukkan jumlah lampu :");
        this.jumlahlampu=in.nextInt();
        System.out.println("Masukkan kondisi lampu:");
        this.kondisilampu=in.next();
        System.out.println("Masukkan posisi lampu:");
        this.posisilampu=in.next();
        
        System.out.println("Masukkan jumlah kipasangin :");
        this.jumlahkipasangin=in.nextInt();
        System.out.println("Masukkan kondisi :");
        this.kondisikipasangin=in.next();
        System.out.println("Masukkan posisi :");
        this.posisikipasangin=in.next();
        
        System.out.println("Masukkan jumlah AC:");
        this.jumlahAC=in.nextInt();
        System.out.println("Masukkan kondisi AC:");
        this.kondisiAC=in.next();
        System.out.println("Masukkan posisi AC:");
        this.posisiAC=in.next();
        
        System.out.println("Masukkan SSID:");
        this.pilihSSID=in.next();
        System.out.println("Masukkan bandwidth :");
        this.bandwidth=in.nextInt();
        
        System.out.println("Masukkan jumlah CCTV:");
        this.jumlahCCTV=in.nextInt();
        System.out.println("Masukkan kondisi CCTV:");
        this.kondisiCCTV=in.next();
        System.out.println("Masukkan posisi CCTV:");
        this.posisiCCTV=in.next();
        
    //inputan  lingkungan ruang kelas     
        System.out.println("Masukkan kondisi lantai:");
        this.kondisilantai=in.next();
        System.out.println("Masukkan kondisi dinding:");
        this.kondisidinding=in.next();
        System.out.println("Masukkan kondisi atap:");
        this.kondisiatap=in.next();
        System.out.println("Masukkan kondisi pintu:");
        this.kondisipintu=in.next();
        System.out.println("Masukkan kondisi jendela:");
        this.kondisijendela=in.next();
        
    //inputan kebersihan ruang kelas
        System.out.println("Masukkan kondisi sirkulasiudara:");
        this.inputsirkulasiudara=in.next();
        System.out.println("Masukkan pencahayaan :");
        this.pencahayaan=in.nextInt();
        System.out.println("Masukkan kelembapan :");
        this.kelembapan=in.nextInt();
        System.out.println("Masukkan suhu :");
        this.suhu=in.nextInt();
        
    //inputan  kenyamanan ruangkelas    
        System.out.println("Masukkan kebisingan :");
        this.kebisingan=in.next();
        System.out.println("Masukkan bau :");
        this.bau=in.next();
        System.out.println("Masukkan kebocoran :");
        this.kebocaran=in.next();
        System.out.println("Masukkan kerusakan :");
        this.kerusakan=in.next();
        System.out.println("Masukkan keausan :");
        this.keausan=in.next();
    
    //inputan keamanan ruangkelas    
        System.out.println("Masukkan kekokohan :");
        this.kekokohan=in.next();
        System.out.println("Masukkan kuncipintudankelas :");
        this.kuncipintudanjendela=in.next();
        System.out.println("Masukkan bahaya :");
        this.bahaya=in.next();
    }
   }
