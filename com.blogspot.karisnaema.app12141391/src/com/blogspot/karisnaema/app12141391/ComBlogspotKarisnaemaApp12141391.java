package com.blogspot.karisnaema.app12141391;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ComBlogspotKarisnaemaApp12141391 {

    public static void main(String[] args) {
        ArrayList <String> namaPemain = new ArrayList<>(); // Membuat array Nama Pemain
        ArrayList <Integer> sekorPermainan = new ArrayList<>(); // Membuat array Sekor Pemain
        Scanner input = new Scanner(System.in); // Input pertama
        Scanner input2= new Scanner(System.in); // Input kedua
        Random angkaRandom=new Random(); // Mengacak angka
        String cariY = null; // Untuk mencari nilai Y, jika input y, maka otomatis akan keluar
        
        do{
            System.out.println("Masukkan 'Nama' anda atau tekan 'y' untuk keluar, kemudian tekan enter = ");
            cariY=input.nextLine();
            namaPemain.add(cariY);
            int NilaiJalan = 0; // Variabel nilai 
            int CekGameOver=0; // Cek Game over. bernilai 1 jika GameOver
            int aKumulasi[]= new int[6]; // Membuat array nilai tiap level permainan
            int NilaiPasJalan=0; // Varibel nilai
         
            // START GAME
            if(!("y").equals(cariY)){  
                // ======================SCRIPT PENEBAKAN====================   
                String nextLevel = null; // untuk Menaikkan Level
                int PiLevel=1;   // Untuk menentukan Level Pertama
                System.out.println("Selamat Datang " + cariY); // Untuk memberikan sambutan kepada Pemain
                
                do{
                }while(!"exit".equals(nextLevel));
                
            }// Stop Looping Nama Pemain
            
            // NGOLAH NILAI
            for(int rO=0; rO<5; rO++){ // membuat array nilai pada tiap level, untuk kemudian dijumlahkan
                NilaiJalan=NilaiJalan+aKumulasi[rO];  
            }
            sekorPermainan.add(NilaiJalan); // Menambahkan Nilai Akhir pada masing masing peserta
            // SCORE SEMENTARA
            
          }while(!"y".equals(cariY)); // Jika diiputkan y, maka akan keluar
        
        int jumPemain=namaPemain.size(); // Mengambil jumlah Rercord dalam array, dan untuk menghilangkan y paling belakang pada loop dikurangi 1 (-1)
        System.out.println("SCORE AKHIR");
        System.out.println("=================================");
        int l;
        for(l=0;l<jumPemain-1;l++){
        System.out.println(namaPemain.get(l) + " : " + sekorPermainan.get(l)); // Menampilkan Skore di Akhir permainan
        }
    }
    
}
