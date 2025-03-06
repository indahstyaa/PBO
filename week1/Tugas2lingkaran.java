package week1;

class Tugas2lingkaran{
    public static void main(String[] lingkaran) {
        int jariJari = 5;
        double pi = 3.14; // Atau Math.PI untuk nilai pi yang lebih akurat

        double luas = pi * jariJari * jariJari;
        double keliling = 2 * pi * jariJari;

        System.out.println("Program Menghitung Luas dan Keliling Lingkaran");
        System.out.println("Jari-jari          : " + jariJari);
        System.out.println("Luas (pi * r * r)  : " + luas);
        System.out.println("Keliling (2 * pi * r) : " + keliling);
    }
}