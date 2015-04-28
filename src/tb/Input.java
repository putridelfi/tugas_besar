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
    
    double hitungluas(){
        luas=this.panjang*this.lebar;
        return luas;
    }
    double hitungrasio(){
        rasio=luas/Jumlahkursi;
        if (rasio>=0.5){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
        return rasio;
        
    }
    double hitungbentuk(){
        bentuk=this.panjang*this.lebar;
        if (panjang!=luas){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
        return luas;
        
        
    }

    public String getNamaruang() {
        return namaruang;
    }

    public void setNamaruang(String namaruang) {
        this.namaruang = namaruang;
    }

    public String getLokasiruang() {
        return lokasiruang;
    }

    public void setLokasiruang(String lokasiruang) {
        this.lokasiruang = lokasiruang;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getJumlahkursi() {
        return Jumlahkursi;
    }

    public void setJumlahkursi(int Jumlahkursi) {
        this.Jumlahkursi = Jumlahkursi;
    }

    public int getJumlahpintu() {
        return jumlahpintu;
    }

    public void setJumlahpintu(int jumlahpintu) {
        this.jumlahpintu = jumlahpintu;
    }

    public int getJumlahjendela() {
        return jumlahjendela;
    }

    public void setJumlahjendela(int jumlahjendela) {
        this.jumlahjendela = jumlahjendela;
    }

    public int getJumlahstopkontak() {
        return jumlahstopkontak;
    }

    public void setJumlahstopkontak(int jumlahstopkontak) {
        this.jumlahstopkontak = jumlahstopkontak;
    }

    public String getKondisistopkontak() {
        return kondisistopkontak;
    }

    public void setKondisistopkontak(String kondisistopkontak) {
        this.kondisistopkontak = kondisistopkontak;
    }

    public String getPosisistopkontak() {
        return posisistopkontak;
    }

    public void setPosisistopkontak(String posisistopkontak) {
        this.posisistopkontak = posisistopkontak;
    }

    public int getJumlahkabellcd() {
        return jumlahkabellcd;
    }

    public void setJumlahkabellcd(int jumlahkabellcd) {
        this.jumlahkabellcd = jumlahkabellcd;
    }

    public String getKondisikabellcd() {
        return kondisikabellcd;
    }

    public void setKondisikabellcd(String kondisikabellcd) {
        this.kondisikabellcd = kondisikabellcd;
    }

    public String getPosisikabellcd() {
        return posisikabellcd;
    }

    public void setPosisikabellcd(String posisikabellcd) {
        this.posisikabellcd = posisikabellcd;
    }

    public int getJumlahlampu() {
        return jumlahlampu;
    }

    public void setJumlahlampu(int jumlahlampu) {
        this.jumlahlampu = jumlahlampu;
    }

    public String getKondisilampu() {
        return kondisilampu;
    }

    public void setKondisilampu(String kondisilampu) {
        this.kondisilampu = kondisilampu;
    }

    public String getPosisilampu() {
        return posisilampu;
    }

    public void setPosisilampu(String posisilampu) {
        this.posisilampu = posisilampu;
    }

    public int getJumlahkipasangin() {
        return jumlahkipasangin;
    }

    public void setJumlahkipasangin(int jumlahkipasangin) {
        this.jumlahkipasangin = jumlahkipasangin;
    }

    public String getKondisikipasangin() {
        return kondisikipasangin;
    }

    public void setKondisikipasangin(String kondisikipasangin) {
        this.kondisikipasangin = kondisikipasangin;
    }

    public String getPosisikipasangin() {
        return posisikipasangin;
    }

    public void setPosisikipasangin(String posisikipasangin) {
        this.posisikipasangin = posisikipasangin;
    }

    public int getJumlahAC() {
        return jumlahAC;
    }

    public void setJumlahAC(int jumlahAC) {
        this.jumlahAC = jumlahAC;
    }

    public String getKondisiAC() {
        return kondisiAC;
    }

    public void setKondisiAC(String kondisiAC) {
        this.kondisiAC = kondisiAC;
    }

    public String getPosisiAC() {
        return posisiAC;
    }

    public void setPosisiAC(String posisiAC) {
        this.posisiAC = posisiAC;
    }

    public String getPilihSSID() {
        return pilihSSID;
    }

    public void setPilihSSID(String pilihSSID) {
        this.pilihSSID = pilihSSID;
    }

    public int getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(int bandwidth) {
        this.bandwidth = bandwidth;
    }

    public int getJumlahCCTV() {
        return jumlahCCTV;
    }

    public void setJumlahCCTV(int jumlahCCTV) {
        this.jumlahCCTV = jumlahCCTV;
    }

    public String getKondisiCCTV() {
        return kondisiCCTV;
    }

    public void setKondisiCCTV(String kondisiCCTV) {
        this.kondisiCCTV = kondisiCCTV;
    }

    public String getPosisiCCTV() {
        return posisiCCTV;
    }

    public void setPosisiCCTV(String posisiCCTV) {
        this.posisiCCTV = posisiCCTV;
    }

    public String getKondisilantai() {
        return kondisilantai;
    }

    public void setKondisilantai(String kondisilantai) {
        this.kondisilantai = kondisilantai;
    }

    public String getKondisidinding() {
        return kondisidinding;
    }

    public void setKondisidinding(String kondisidinding) {
        this.kondisidinding = kondisidinding;
    }

    public String getKondisiatap() {
        return kondisiatap;
    }

    public void setKondisiatap(String kondisiatap) {
        this.kondisiatap = kondisiatap;
    }

    public String getKondisipintu() {
        return kondisipintu;
    }

    public void setKondisipintu(String kondisipintu) {
        this.kondisipintu = kondisipintu;
    }

    public String getKondisijendela() {
        return kondisijendela;
    }

    public void setKondisijendela(String kondisijendela) {
        this.kondisijendela = kondisijendela;
    }

    public String getInputsirkulasiudara() {
        return inputsirkulasiudara;
    }

    public void setInputsirkulasiudara(String inputsirkulasiudara) {
        this.inputsirkulasiudara = inputsirkulasiudara;
    }

    public int getPencahayaan() {
        return pencahayaan;
    }

    public void setPencahayaan(int pencahayaan) {
        this.pencahayaan = pencahayaan;
    }

    public int getKelembapan() {
        return kelembapan;
    }

    public void setKelembapan(int kelembapan) {
        this.kelembapan = kelembapan;
    }

    public int getSuhu() {
        return suhu;
    }

    public void setSuhu(int suhu) {
        this.suhu = suhu;
    }

    public String getKebisingan() {
        return kebisingan;
    }

    public void setKebisingan(String kebisingan) {
        this.kebisingan = kebisingan;
    }

    public String getBau() {
        return bau;
    }

    public void setBau(String bau) {
        this.bau = bau;
    }

    public String getKebocaran() {
        return kebocaran;
    }

    public void setKebocaran(String kebocaran) {
        this.kebocaran = kebocaran;
    }

    public String getKerusakan() {
        return kerusakan;
    }

    public void setKerusakan(String kerusakan) {
        this.kerusakan = kerusakan;
    }

    public String getKeausan() {
        return keausan;
    }

    public void setKeausan(String keausan) {
        this.keausan = keausan;
    }

    public String getKekokohan() {
        return kekokohan;
    }

    public void setKekokohan(String kekokohan) {
        this.kekokohan = kekokohan;
    }

    public String getKuncipintudanjendela() {
        return kuncipintudanjendela;
    }

    public void setKuncipintudanjendela(String kuncipintudanjendela) {
        this.kuncipintudanjendela = kuncipintudanjendela;
    }

    public String getBahaya() {
        return bahaya;
    }

    public void setBahaya(String bahaya) {
        this.bahaya = bahaya;
    }
    
       
 }
  
   
   
    

