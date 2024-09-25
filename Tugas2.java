import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            tampilkanMenu();
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    hitungPersegi();
                    break;
                case 2:
                    hitungPersegiPanjang();
                    break;
                case 3:
                    hitungLingkaran();
                    break;
                case 4:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);

        input.close();
    }

    static void tampilkanMenu() {
        System.out.println("Pilih bangun datar:");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.println("4. Keluar");
        System.out.print("Masukkan pilihan: ");
    }

    static void hitungPersegi() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi: ");
        double sisi = input.nextDouble();
        System.out.println("Luas persegi: " + hitungLuasPersegi(sisi));
        System.out.println("Keliling persegi: " + hitungKelilingPersegi(sisi));
    }

    static void hitungPersegiPanjang() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang: ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar: ");
        double lebar = input.nextDouble();
        System.out.println("Luas persegi panjang: " + hitungLuasPersegiPanjang(panjang, lebar));
        System.out.println("Keliling persegi panjang: " + hitungKelilingPersegiPanjang(panjang, lebar));
    }

    static void hitungLingkaran() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari-jari: ");
        double jariJari = input.nextDouble();
        System.out.println("Luas lingkaran: " + hitungLuasLingkaran(jariJari));
        System.out.println("Keliling lingkaran: " + hitungKelilingLingkaran(jariJari));
    }

    // Method untuk menghitung luas dan keliling persegi
    static double hitungLuasPersegi(double sisi) {
        return sisi * sisi;
    }

    static double hitungKelilingPersegi(double sisi) {
        return 4 * sisi;
    }

    // Method untuk menghitung luas dan keliling persegi panjang
    static double hitungLuasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }

    static double hitungKelilingPersegiPanjang(double panjang, double lebar) {
        return 2 * (panjang + lebar);
    }

    // Method untuk menghitung luas dan keliling lingkaran
    static double hitungLuasLingkaran(double jariJari) {
        return Math.PI * jariJari * jariJari;
    }

    static double hitungKelilingLingkaran(double jariJari) {
        return 2 * Math.PI * jariJari;
    }
}
