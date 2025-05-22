package week9;
import java.util.InputMismatchException;
import java.util.Scanner;

class PecahanTidakTersediaException extends Exception {
    public PecahanTidakTersediaException(String message) {
        super(message);
    }
}

public class ATM {
    private static int saldo = 500000; // saldo awal

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n===== MENU ATM =====");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Tarik Tunai");
            System.out.println("3. Setor Tunai");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    cekSaldo();
                    break;
                case 2:
                    try {
                        tarikTunai(input);
                    } catch (PecahanTidakTersediaException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 3:
                    setorTunai(input);
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan ATM.");
                    break;
                default:
                    System.out.println("Menu tidak tersedia.");
            }
        } while (pilihan != 4);

        input.close();
    }

    public static void cekSaldo() {
        System.out.println("Saldo Anda saat ini: Rp" + saldo);
    }

    public static void tarikTunai(Scanner input) throws PecahanTidakTersediaException {
        System.out.print("Masukkan jumlah yang ingin ditarik: Rp");
        int jumlah = input.nextInt();

        if (jumlah < 20000) {
            System.out.println("Minimal penarikan adalah Rp20.000.");
            return;
        }

        // Validasi jumlah harus kelipatan dari 20k, 50k, atau 100k menggunakan FPB
        if (!validPecahan(jumlah)) {
            throw new PecahanTidakTersediaException("Jumlah tidak bisa diberikan dalam pecahan Rp20K, Rp50K, atau Rp100K.");
        }

        if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi.");
        } else {
            saldo -= jumlah;
            System.out.println("Penarikan berhasil. Sisa saldo: Rp" + saldo);
        }
    }

    public static void setorTunai(Scanner input) {
        System.out.print("Masukkan jumlah yang ingin disetor: Rp");
        int jumlah = input.nextInt();

        if (jumlah <= 0) {
            System.out.println("Jumlah setor tidak valid.");
        } else {
            saldo += jumlah;
            System.out.println("Setoran berhasil. Saldo baru: Rp" + saldo);
        }
    }

    public static boolean validPecahan(int jumlah) {
        int[] pecahan = {20000, 50000, 100000};
        for (int p : pecahan) {
            if (jumlah % p == 0) return true;
        }
        return false;
    }

    // Contoh fungsi KPK dan FPB jika diperlukan:
    public static int fpb(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int kpk(int a, int b) {
        return (a * b) / fpb(a, b);
    }
}