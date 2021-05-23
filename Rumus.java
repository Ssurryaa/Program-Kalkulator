package Tugas;
import java.util.Scanner; //untuk melakukan user input

public class Rumus implements Kalkulator {

    public void kalkulatorSederhana() {
        Scanner input = new Scanner(System.in);
        float total = 0, bil1 = 1, bil2 = 1;

            System.out.println("\n------------------------");
            System.out.println("  Kalkulator Sederhana  ");
            System.out.println("------------------------");
            System.out.println("| 1.Penjumlahan        |");
            System.out.println("| 2.Pengurangan        |");
            System.out.println("| 3.Perkalian          |");
            System.out.println("| 4.Pembagian          |");
            System.out.println("------------------------");
            System.out.print("Masukan Pilihan Anda = ");
            int pilihan = input.nextInt();

            System.out.print("Masukan Bilangan Ke-1 = ");
            bil1 = input.nextFloat();
            System.out.print("Masukan Bilangan Ke-2 = ");
            bil2 = input.nextFloat();

            switch (pilihan) {

                case 1:
                    System.out.println(+bil1 + " + " + bil2);
                    total = bil1 + bil2;
                    System.out.print("Hasilnya = " + total);
                    break;
                case 2:
                    System.out.println(+bil1 + " - " + bil2);
                    total = bil1 - bil2;
                    System.out.print("Hasilnya = " + total);
                    break;
                case 3:
                    System.out.println(+bil1 + " x " + bil2);
                    total = bil1 * bil2;
                    System.out.print("Hasilnya = " + total);
                    break;
                case 4:
                    System.out.println(+bil1 + " : " + bil2);
                    total = bil1 / bil2;
                    System.out.print("Hasilnya = " + total);
                    break;
                default:
                    System.out.println("Anda harus mengisi angka");

            }

    }

    public void bangunDatar(){
        Scanner input = new Scanner(System.in);
        float p, l, t, s;
        float luas, keliling;

        System.out.println("\n--------------------------");
        System.out.println("  Kalkulator Bangun Datar  ");
        System.out.println("---------------------------");
        System.out.println("| 1.Persegi                |");
        System.out.println("| 2.Persegi Panjang        |");
        System.out.println("| 3.Segitiga               |");
        System.out.println("| 4.Jajar Genjang          |");
        System.out.println("| 5.Layang-layang          |");
        System.out.println("| 6.Belah Ketupat          |");
        System.out.println("| 7.Lingkaran              |");
        System.out.println("---------------------------");
        System.out.print("Masukan Pilihan Anda = ");
        int pilihan = input.nextInt();


        switch (pilihan) {

            case 1:
                System.out.print("Masukan Panjang Sisi = ");
                s = input.nextFloat();
                luas = s*s;
                keliling = 4*s;
                System.out.println("Luasnya = " + luas);
                System.out.println("Kelilingnya = " + keliling);
                break;
            case 2:
                System.out.print("Masukan Panjang = ");
                p = input.nextFloat();
                System.out.print("Masukan Lebar = ");
                l = input.nextFloat();
                luas = p*l;
                keliling = 2*(p*l);
                System.out.println("Luasnya = " + luas);
                System.out.println("Kelilingnya = " + keliling);
                break;
            case 3:
                System.out.print("Masukan Panjang Alas = ");
                s = input.nextFloat();
                System.out.print("Masukan Tinggi = ");
                t = input.nextFloat();
                System.out.print("Masukan Sisi Lainnya = ");
                p = input.nextFloat();
                luas = 1/2*s*t;
                keliling = s+t+p;
                System.out.println("Luasnya = " + luas);
                System.out.println("Kelilingnya = " + keliling);
                break;
            case 4:
                System.out.print("Masukan Panjang Alas = ");
                s = input.nextFloat();
                System.out.print("Masukan Tinggi = ");
                t = input.nextFloat();
                System.out.print("Masukan Sisi Lainnya = ");
                p = input.nextFloat();
                luas = s*t;
                keliling = 2*(s+p);
                System.out.println("Luasnya = " + luas);
                System.out.println("Kelilingnya = " + keliling);
                break;
            case 5:
                System.out.print("Masukan Diagonal 1 = ");
                s = input.nextFloat();
                System.out.print("Masukan Diagonal 2 = ");
                t = input.nextFloat();
                System.out.print("Masukan Panjang Sisinya = ");
                p = input.nextFloat();
                luas = 1/2*s*t;
                keliling = 2*(s+p);
                System.out.println("Luasnya = " + luas);
                System.out.println("Kelilingnya = " + keliling);
                break;
            case 6:
                System.out.print("Masukan Diagonal 1 = ");
                s = input.nextFloat();
                System.out.print("Masukan Diagonal 2 = ");
                t = input.nextFloat();
                System.out.print("Masukan Panjang Sisinya = ");
                p = input.nextFloat();
                luas = 1/2*s*t;
                keliling = 4*p;
                System.out.println("Luasnya = " + luas);
                System.out.println("Kelilingnya = " + keliling);
                break;
            case 7:
                System.out.print("Masukan Jari-jarinya = ");
                s = input.nextFloat();
                luas = 1/4*22/7*s*s;
                keliling = 22/7*2*s;
                System.out.println("Luasnya = " + luas);
                System.out.println("Kelilingnya = " + keliling);
                break;
            default:
                System.out.println("Anda harus mengisi angka");

        }
    }

    public void bangunRuang(){
        Scanner input = new Scanner(System.in);
        float p, l, t, s;
        float volume, luas_permukaan;

        System.out.println("\n--------------------------");
        System.out.println("  Kalkulator Bangun Ruang  ");
        System.out.println("---------------------------");
        System.out.println("| 1.Kubus                  |");
        System.out.println("| 2.Balok                  |");
        System.out.println("| 3.Bola                   |");
        System.out.println("---------------------------");
        System.out.print("Masukan Pilihan Anda = ");
        int pilihan = input.nextInt();


        switch (pilihan) {

            case 1:
                System.out.print("Masukan Panjang Sisi = ");
                s = input.nextFloat();
                volume = s*s*s;
                luas_permukaan = s*s*s;
                System.out.println("volumenya = " + volume);
                System.out.println("luas permukaannya = " + luas_permukaan);
                break;
            case 2:
                System.out.print("Masukan Panjang = ");
                p = input.nextFloat();
                System.out.print("Masukan Lebar = ");
                l = input.nextFloat();
                System.out.print("Masukan Tinggi = ");
                t = input.nextFloat();
                volume = p*l*t;
                luas_permukaan = 2*(p*l + p*t + l*t);
                System.out.println("volumenya = " + volume);
                System.out.println("luas permukaannya = " + luas_permukaan);
                break;
            case 3:
                System.out.print("Masukan Jari-jari = ");
                s = input.nextFloat();
                volume = 3/4 * 22/7 *s*s*s;
                luas_permukaan = 4 * 22/7 *s*s;
                System.out.println("volumenya = " + volume);
                System.out.println("luas permukaannya = " + luas_permukaan);
                break;
            default:
                System.out.println("Anda harus mengisi angka");

        }
    }


}
