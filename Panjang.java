package Tugas;
import java.util.Scanner;

public class Panjang extends Converter {

    float getConvert() {
        Scanner input = new Scanner(System.in);

        System.out.print("\nMasukkan Panjang dalam Meter : ");
        double meter = input.nextDouble();
        double km = meter /1000;
        double hm = meter /100;
        double dam = meter /10;
        double dm = meter *10;
        double cm = meter *100;
        double mm = meter *1000;
        double mil = meter *0.000621371;
        double inci = meter *39.3701;
        double yard = meter *1.093613888889;
        double mil_laut = meter *0.000539957;
        double kaki = meter *3.28084;

        System.out.println("\n--------------------------------");
        System.out.println("   " + meter + " meter sama dengan : ");
        System.out.println("--------------------------------");
        System.out.println("-> " + km + " km");
        System.out.println("-> " + hm + " hm");
        System.out.println("-> " + dam + " dam");
        System.out.println("-> " + dm + " dm");
        System.out.println("-> " + cm + " cm");
        System.out.println("-> " + mm + " mm");
        System.out.println("-> " + mil + " mil");
        System.out.println("-> " + inci + " inci");
        System.out.println("-> " + yard + " yard");
        System.out.println("-> " + mil_laut + " mil laut");
        System.out.println("-> " + kaki + " kaki");
        System.out.println("--------------------------------");

        return 0;
    }
}
