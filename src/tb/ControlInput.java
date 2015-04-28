/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tb;

/**
 *
 * @author putri
 */ import java.util.Scanner;
public class ControlInput {
  
      void InsertData(){
       int a;
       Input [] tebe ; 
       tebe = new Input [1]; 
       for (a=0;a<tebe.length;a++){
       tebe [a] = new Input(); 
       Scanner in = new Scanner (System.in);
       
       // inputan identitas ruang kelas
       System.out.println("Masukkan nama ruang :");
       tebe[a].setNamaruang(in.next());
       System.out.println("Masukkan lokasi ruang :");
       tebe[a].setLokasiruang(in.next());
       System.out.println("Pilih Fakultas/program studi :");
       tebe[a].setFakultas(in.next());
       
       // inputan kondisi ruang kelas
       System.out.println("Masukkan panjang ruang :");
       tebe[a].setPanjang(in.nextInt());
       System.out.println("Masukkan lebar ruang :");
       tebe[a].setLebar(in.nextInt());
       System.out.println("Masukkan jumlah kursi :");
       tebe[a].setJumlahkursi(in.nextInt());
       System.out.println("Masukkan jumlah pintu :");
       tebe[a].setJumlahpintu(in.nextInt());
        if (tebe[a].jumlahpintu>=2){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }    
       System.out.println("Masukkan jumlah jendela:");
       tebe[a].setJumlahjendela(in.nextInt());
       if (tebe[a].jumlahjendela>=1){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }    
       tebe[a].hitungluas();
       tebe[a].hitungrasio();
       tebe[a].hitungbentuk();
       
       // inputan jumlah,kondisi,posisi sarana
       System.out.println("Masukkan jumlah stop kontak :");
       tebe[a].setJumlahstopkontak(in.nextInt());
        if (tebe[a].jumlahstopkontak>=4){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
       System.out.println("Masukkan kondisi stop kontak :");
       tebe[a].setKondisistopkontak(in.next());
        if (tebe[a].jumlahstopkontak==4 && tebe[a].kondisistopkontak.equals("baik")){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
       System.out.println("Masukkan posisi stop kontak :");
       tebe[a].setPosisistopkontak(in.next());
       if (tebe[a].posisistopkontak.equals("pojok ruangan") && tebe[a].posisistopkontak.equals("Dekat dosen")){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
       
       System.out.println("Masukkan jumlah kabel LCD :");
       tebe[a].setJumlahkabellcd(in.nextInt());
       if (tebe[a].jumlahkabellcd>=1){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
       System.out.println("Masukkan kondisi kabel LCD :");
       tebe[a].setKondisikabellcd(in.next());
       if (tebe[a].kondisikabellcd.equals("Berfungsi")){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
       System.out.println("Masukkan posisi kabel LCD :");
       tebe[a].setPosisikabellcd(in.next());
       if (tebe[a].posisikabellcd.equals("Dekat dosen")){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
       System.out.println("Masukkan jumlah lampu :");
       tebe[a].setJumlahlampu(in.nextInt());
       if (tebe[a].jumlahlampu>=18 ){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
       System.out.println("Masukkan kondisi lampu :");
       tebe[a].setKondisilampu(in.next());
       if (tebe[a].kondisilampu.equals("baik") && tebe[a].jumlahlampu==18){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
       System.out.println("Masukkan posisi lampu :");
       tebe[a].setPosisilampu(in.next());
       if (tebe[a].posisilampu.equals("Atap ruangan")){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
       System.out.println("Masukkan jumlah kipas angin :");
       tebe[a].setJumlahjendela(in.nextInt());
       if (tebe[a].jumlahkipasangin>=2){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
       System.out.println("Masukkan kondisi kipas angin :");
       tebe[a].setKondisikipasangin(in.next());
       if (tebe[a].kondisikipasangin.equals("baik") && tebe[a].jumlahkipasangin==2){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
       System.out.println("Masukkan jumlah AC :");
       tebe[a].setJumlahAC(in.nextInt());
       if (tebe[a].jumlahAC>=1){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
       System.out.println("Masukkan kondisi AC:");
       tebe[a].setKondisiAC(in.next());
       if (tebe[a].kondisiAC.equals("baik")){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
       System.out.println("Masukkan posisi AC :");
       tebe[a].setPosisiAC(in.next());
       if (tebe[a].posisiAC.equals("Atap ruangan")){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
       System.out.println("Masukkan SSID:");
       tebe[a].setPilihSSID(in.next());
       System.out.println("Masukkan bandwidth :");
       tebe[a].setBandwidth(in.nextInt());
       if (tebe[a].pilihSSID.equals("UMM Hotspot")){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
       if (tebe[a].pilihSSID.equals("Bisa login")){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
       System.out.println("Masukkan jumlah CCTV:");
       tebe[a].setJumlahCCTV(in.nextInt());
       if (tebe[a].jumlahCCTV==2){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
       System.out.println("Masukkan kondisi CCTV:");
       tebe[a].setKondisiCCTV(in.next());
       if (tebe[a].kondisiCCTV.equals("Baik") && tebe[a].jumlahCCTV==2){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
       System.out.println("Masukkan posisi CCTV:");
       tebe[a].setPosisiCCTV(in.next());
       if (tebe[a].posisiCCTV.equals("Depan") && tebe[a].posisiCCTV.equals("Belakang")){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
       
 //inputan  linngkungan ruang kelas      
       System.out.println("Masukkan kondisi lantai  :");
       tebe[a].setKondisilantai(in.next());
       System.out.println("Masukkan kondisi dinding:");
       tebe[a].setKondisidinding(in.next());
       System.out.println("Masukkan kondisi atap :");
       tebe[a].setKondisiatap(in.next());
       System.out.println("Masukkan kondisi pintu:");
       tebe[a].setKondisipintu(in.next());
       System.out.println("Masukkan kondisi jendela:");
       tebe[a].setKondisijendela(in.next());
       System.out.println("1.Baik");
       System.out.println("1.Kotor");
           int b = in.nextInt();
           if (b==1){
               System.out.println("Sesuai");
           }
           if (b==2){
               System.out.println("Tidak sesuai");
           
           }
       
       //inputan kebersihan ruang kelas
       System.out.println("Masukkan sirkulasi udara :");
       tebe[a].setInputsirkulasiudara(in.next());
       if (tebe[a].inputsirkulasiudara.equals("Lancar")){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
       System.out.println("Masukkan nilai pencahayaan:");
       tebe[a].setPencahayaan(in.nextInt());
       if (tebe[a].pencahayaan>=250 && tebe[a].pencahayaan<=350){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
       System.out.println("Masukkan kelembapan (%):");
       tebe[a].setKelembapan(in.nextInt());
       if (tebe[a].kelembapan>=70 && tebe[a].kelembapan<=80){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
       System.out.println("Masukkan suhu (celcius) :");
       tebe[a].setSuhu(in.nextInt());
       if (tebe[a].suhu>=25 && tebe[a].suhu<=35){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
       
       //inputan kenyamanan ruang kelas
       int c,d,e,f,g;
       System.out.println("Masukkan kebisingan:");
       System.out.println("1.Bising");
       System.out.println("1.Tidak Bising");
       c = in.nextInt();
//       tebe[a].setKebisingan(in.next());
       System.out.println("Masukkan bau:");
       System.out.println("1.Bau");
       System.out.println("1.Tidak Bau");
       d = in.nextInt();
//       tebe[a].setBau(in.next());
       System.out.println("Masukkan kebocoran:");
       System.out.println("1.Bocor");
       System.out.println("1.Tidak Bocor");
       e = in.nextInt();
//       tebe[a].setKebocaran(in.next());
       System.out.println("Masukkan kerusakan:");
       System.out.println("1.Rusak");
       System.out.println("1.Tidak Rusak");
       f = in.nextInt();
//       tebe[a].setKerusakan(in.next());
       System.out.println("Masukkan keausan:");
       System.out.println("1.Aus");
       System.out.println("1.Tidak Aus");
       g = in.nextInt();
       if (c==1 && d==1 && e==1 && f==1 && g==1){
           System.out.println("Sesuai");
       }
        if (c==2 && d==2 && e==2 && f==2 && g==2){
           System.out.println("Tidak Sesuai");
//       tebe[a].setKeausan(in.next());
        }
       
       //inputan keamanan ruang kelas
        int h,i,j;
       System.out.println("Masukkan kekokohan:");
       System.out.println("1.Kokoh");
       System.out.println("1.Tidak Kokoh");
       h = in.nextInt();
       
//       tebe[a].setKekokohan(in.next());
       System.out.println("Masukkan kunci pintu dan jendela:");
       System.out.println("1.Ada");
       System.out.println("1.Tidak ada");
       i = in.nextInt();
//       tebe[a].setKuncipintudanjendela(in.next());
       System.out.println("Masukkan bahaya:");
       System.out.println("1.Aman");
       System.out.println("1.Tidak Aman");
       j = in.nextInt();
//       tebe[a].setBahaya(in.next());
       if (h==1 && i==1 && j==1){
           System.out.println("Sesuai");
       }
        if (h==2 && i==2 && j==2){
           System.out.println("Tidak Sesuai");
//       tebe[a].setKeausan(in.next());
        }
       
       }
      }
      void CetakData(){
       Input [] tebe ; 
       int a;
       tebe = new Input [1]; 
       for (a=0;a<tebe.length;a++){
       tebe [a] = new Input(); 
       Scanner in = new Scanner (System.in);
       
       // Output identitas ruang kelas
       System.out.println("Masukkan nama ruang :");
       tebe[a].getNamaruang();
       System.out.println("Masukkan lokasi ruang :");
       tebe[a].getLokasiruang();
       System.out.println("Pilih Fakultas/program studi :");
       tebe[a].getFakultas();
       
       // Output kondisi ruang kelas
       System.out.println("Masukkan panjang ruang :");
       tebe[a].getPanjang();
       System.out.println("Masukkan lebar ruang :");
       tebe[a].getLebar();
       System.out.println("Masukkan jumlah kursi :");
       tebe[a].getJumlahkursi();
       System.out.println("Masukkan jumlah pintu :");
       tebe[a].getJumlahpintu();
       System.out.println("Masukkan jumlah jendela:");
       tebe[a].getJumlahjendela();
       
       // Output jumlah,kondisi,posisi sarana
       System.out.println("Masukkan jumlah stop kontak :");
       tebe[a].getJumlahstopkontak();
       System.out.println("Masukkan kondisi stop kontak :");
       tebe[a].getKondisistopkontak();
       System.out.println("Masukkan posisi stop kontak :");
       tebe[a].getPosisistopkontak();
       System.out.println("Masukkan jumlah kabel LCD :");
       tebe[a].getJumlahkabellcd();
       System.out.println("Masukkan kondisi kabel LCD :");
       tebe[a].getKondisikabellcd();
       System.out.println("Masukkan posisi kabel LCD :");
       tebe[a].getPosisikabellcd();
       System.out.println("Masukkan jumlah lampu :");
       tebe[a].getJumlahlampu();
       System.out.println("Masukkan kondisi lampu :");
       tebe[a].getKondisilampu();
       System.out.println("Masukkan posisi lampu :");
       tebe[a].getPosisilampu();
       System.out.println("Masukkan jumlah kipas angin :");
       tebe[a].getJumlahkipasangin();
       System.out.println("Masukkan kondisi kipas angin :");
       tebe[a].getKondisikipasangin();
       System.out.println("Masukkan jumlah AC :");
       tebe[a].getJumlahAC();
       System.out.println("Masukkan kondisi AC:");
       tebe[a].getKondisiAC();
       System.out.println("Masukkan posisi AC :");
       tebe[a].getPosisiAC();
       System.out.println("Masukkan SSID:");
       tebe[a].getPilihSSID();
       System.out.println("Masukkan banwidth :");
       tebe[a].getBandwidth();
       System.out.println("Masukkan jumlah CCTV:");
       tebe[a].getJumlahCCTV();
       System.out.println("Masukkan kondisi CCTV:");
       tebe[a].getKondisiCCTV();
       System.out.println("Masukkan posisi CTV:");
       tebe[a].getPosisiCCTV();
       
       //Ouput lingkungan ruang kelas
       System.out.println("Masukkan kondisi lantai  :");
       tebe[a].getKondisilantai();
       System.out.println("Masukkan kondisi dinding:");
       tebe[a].getKondisidinding();
       System.out.println("Masukkan kondisi atap :");
       tebe[a].getKondisiatap();
       System.out.println("Masukkan kondisi pintu:");
       tebe[a].getKondisipintu();
       System.out.println("Masukkan jendela:");
       tebe[a].getKondisijendela();
       
       //Output kebersihan ruang kelas
       System.out.println("Masukkan sirkulasi udara :");
       tebe[a].getInputsirkulasiudara();
       System.out.println("Masukkan nilai pencahayaan:");
       tebe[a].getPencahayaan();
       System.out.println("Masukkan kelembapan (%):");
       tebe[a].getKelembapan();
       System.out.println("Masukkan suhu (celcius) :");
       tebe[a].getSuhu();
       
       //Ouput kenyamanan ruang kelas
       System.out.println("Masukkan kebisingan:");
       tebe[a].getKebisingan();
       System.out.println("Masukkan bau:");
       tebe[a].getBau();
       System.out.println("Masukkan kebocoran:");
       tebe[a].getKebocaran();
       System.out.println("Masukkan kerusakan:");
       tebe[a].getKerusakan();
       System.out.println("Masukkan keausan:");
       tebe[a].getKeausan();
       
       //Output keamanan ruang kelas
       System.out.println("Masukkan kekokohan:");
       tebe[a].getKekokohan();
       System.out.println("Masukkan kunci pintu dan jendela:");
       tebe[a].getKuncipintudanjendela();
       System.out.println("Masukkan bahaya:");
       tebe[a].getBahaya();     
    
}
}
}
    

