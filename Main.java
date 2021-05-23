package Tugas;
import java.util.Scanner;


class Main {
    static void programUlang () {

        Scanner input = new Scanner(System.in);
        System.out.println("\n      Kembali Ke Menu Utama?");
        System.out.println("==================================");
        System.out.println("| 1. Ya                          |");
        System.out.println("| 2. Tidak                       |");
        System.out.println("==================================");
        System.out.print("  Masukkan pilihan : ");
        int pilih = input.nextInt();
        if (pilih == 1) {
            menuUtama();
        } else if (pilih == 2) {
            System.exit(0);
        } else {
            System.out.println("Maaf, Input yang Anda Masukkan Salah!\n");
            programUlang();
        }
    }

    static void menuUtama(){
        Kalkulator phone = new Rumus();
        Converter p = new Panjang();
        KalkulatorUser user = new KalkulatorUser(phone);

        Scanner input = new Scanner(System.in);
        int aksi;

        System.out.println("\n===     PILIHAN MENU      ===");
        System.out.println("[1] Kalkulator Sederhana    |");
        System.out.println("[2] Kalkulator Bangun Datar |");
        System.out.println("[3] Kalkulator Bangun Ruang |");
        System.out.println("[4] Unit Converter          |");
        System.out.println("[0] Keluar                  |");
        System.out.println("-----------------------------");
        System.out.print("Pilih aksi> ");
        aksi = input.nextInt();

        if(aksi==1){
            user.useKalkulatorSederhana();
        }else if(aksi==2){
            user.usebangunRuang();
        }else if(aksi==3){
            user.usebangunDatar();
        }else if(aksi==4){
            p.getConvert();
        }else {
            System.out.println("Kamu memilih aksi yang salah!");
        }
        programUlang ();
    }

    public static void main(String[] args) {
        menuUtama();

    }
}
