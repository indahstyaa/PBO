package week1;

class Tugas2kubus{
    public static void main(String[] Kubus) {
        int sisi = 5;

        int luasPermukaan = 6 * sisi * sisi;
        int volume = sisi * sisi * sisi;

        System.out.println("Program Menghitung Luas Permukaan dan Volume Kubus");
        System.out.println("Sisi                        : " + sisi);
        System.out.println("Luas Permukaan (6 * s * s)  : " + luasPermukaan);
        System.out.println("Volume (s * s * s)          : " + volume);
    }
}