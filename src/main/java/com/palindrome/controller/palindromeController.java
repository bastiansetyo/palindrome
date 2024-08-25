package com.palindrome.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class palindromeController {

    @PostMapping("/palindrom") //sama dengan @requestmapping tp postmapping tidak bertele2 yaitu untuk metode yang dipakai untuk permintaan post mapping
    public String palindrom(@RequestBody String inputan){ //methode yang dapat digunakan semua folder dengan tipe data pengembalian string kemudian requestbody untuk permintaan di body
        String cekpali = ""; //deklarasi penampungan
        int input; //deklarasi penampungan
        log.info("masukan teks yang di cek : "); //untuk menampilkan hasil pada terminal
        input = inputan.length(); // menghitung panjang inputan
        for (int i = input - 1; i >= 0; i--) // perulangan atau loop dengan kondisi
        {
            cekpali = cekpali + inputan.charAt(i); // kondisi penampung string kosong di isi dengan inputan namun yang sudah dibalik
        }
        if (inputan.equals(cekpali)) //percabangan dengan kondisi jika inputan sama dengan cekpali
            return "palindrom";
        else
            return "tidak palindrom";
    }
    @PostMapping ("/cekPalindrome") //lebih simple tapi pastense
    public String palindrome(@RequestBody String input){
        String palindrom = "";
        int hitung ;
        System.out.print("masukan teks yang mau di cek");
        hitung = input.length();
        for (int i = hitung - 1; i >= 0; i--) {
            palindrom += input.charAt(i);
        }
        if (palindrom.equals(input)){
            return "ini Palindrom";
        }
        return "ini tidak palindrom";
    }
     /* public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan teks yang di cek : ");
        String inputan = scanner.nextLine();
        String cekpali = "";
        int input;

        input = inputan.length();
        for (int i = input - 1; i >= 0; i--)
            cekpali = cekpali + inputan.charAt(i);
        if (inputan.equals(cekpali))
            System.out.print("palindrom");
        else
            System.out.print("tidak palindrom");
    }*/

}
