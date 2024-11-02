package Tugas_Latihan;
/**
 *
 * @author user
 * NAMA     : Afsani Wahyu Mawardi
 * KELAS    : TI RegPagi
 * NIM      : 23215058
 * Dekskipsi 
 * Progam   : Progam ini untuk menampilkan Do-while, While
 *          Perhitungan Lingkaran
 */
import java.util.Scanner;

public class Latihan_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double diameter;

        // Looping hingga input diameter valid
        do {
            System.out.print("Masukkan nilai diameter lingkaran = ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Nilai diameter harus berupa angka! Coba lagi.");
                scanner.next();
            }
            diameter = scanner.nextDouble();
        } while (diameter <= 0);

        // Hitung jari-jari, luas, dan keliling
        double jariJari = diameter / 2;
        double luas = Math.PI * jariJari * jariJari;
        double keliling = 2 * Math.PI * jariJari;

        // Tampilkan hasil
        System.out.println("======Hasil Perhitungan Lingkaran=====");
        System.out.printf("Jari-jari Lingkaran = %.2f cm\n", jariJari);
        System.out.printf("Luas Lingkaran = %.2f cm²\n", luas);
        System.out.printf("Keliling Lingkaran = %.2f cm\n", keliling);
    }
}