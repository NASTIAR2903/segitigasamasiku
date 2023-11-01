import java.util.Scanner;

public class SegitigaSamaSiku {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Meminta pengguna memasukkan panjang alas dan tinggi segitiga
            System.out.print("Masukkan panjang alas segitiga: ");
            double alas = input.nextDouble();

            System.out.print("Masukkan tinggi segitiga: ");
            double tinggi = input.nextDouble();

            // Menghitung luas segitiga
            double luas = 0.5 * alas * tinggi;

            // Menampilkan hasil
            System.out.println("Luas segitiga adalah: " + luas);

            // Menutup scanner
            input.close();
        }
}
