package week3;
import java.util.Scanner;
import java.util.Random;

class Tugaspraktikum 
{
    public static void main (String[] aaa)
    {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        System.out.println("=================");
        System.out.println("    TEBAK ANGKA    ");
        System.out.println("=================");

        int angka = 37;//r.nextInt(100) + 1; // Menghasilkan angka acak antara 1 dan 100
        int tebakan;

        do 
        {
            System.out.print("Masukkan angka: ");
            tebakan = s.nextInt();
            if (!cekAngka(tebakan, angka)) 
            { // Memanggil fungsi cekAngka
                statusAngka(tebakan, angka); // Memanggil fungsi statusAngka
            }
        } 
        while (tebakan != angka);

        System.out.println("Tebakan kamu benar!");
    }

    // Fungsi untuk mengecek apakah tebakan sama dengan angka acak
    public static boolean cekAngka(int tebakan, int angka) 
    {
        return tebakan == angka;
    }

    // Fungsi untuk memberikan status tebakan (terlalu besar atau terlalu kecil)
    public static void statusAngka(int tebakan, int angka) 
    {
        if (tebakan < angka) 
        {
            System.out.println("Angka terlalu kecil");
        } else 
        {
            System.out.println("Angka terlalu besar");
        }
        System.out.println("Coba lagi");
    }
}