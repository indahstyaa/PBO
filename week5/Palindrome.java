package week5;

import java.util.Scanner; // Import Scanner unt input dr pengguna

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner

        // Meminta input dr pengguna
        System.out.print("Masukkan kata: ");
        String input = scanner.nextLine();

        // Membuat objek dr class TextGame
        TextGame game = new TextGame();

        // Menampilkan hasil apakah input adlh palindrome
        game.displayResult(input);

        scanner.close(); 
    }
}