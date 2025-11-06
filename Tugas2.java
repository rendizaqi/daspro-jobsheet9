import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input jumlah pesanan
        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = scanner.nextInt();

        // Membuat array untuk menyimpan nama pesanan dan harga
        String[] namaPesanan = new String[jumlahPesanan];
        double[] hargaPesanan = new double[jumlahPesanan];

        // Memasukkan data pesanan
        for (int i = 0; i < jumlahPesanan; i++) {
            scanner.nextLine(); // membersihkan newline setelah input jumlahPesanan
            System.out.print("Masukkan nama pesanan ke-" + (i + 1) + ": ");
            namaPesanan[i] = scanner.nextLine();

            System.out.print("Masukkan harga pesanan " + namaPesanan[i] + ": ");
            hargaPesanan[i] = scanner.nextDouble();
        }

        // Menghitung total biaya
        double totalBiaya = 0;
        for (int i = 0; i < jumlahPesanan; i++) {
            totalBiaya += hargaPesanan[i];
        }

        // Menampilkan daftar pesanan dan total biaya
        System.out.println("\nDaftar Pesanan yang Telah Dimasukkan:");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("Pesanan ke-" + (i + 1) + ": " + namaPesanan[i] + " - Harga: " + hargaPesanan[i]);
        }

        System.out.println("\nTotal Biaya dari Semua Pesanan: " + totalBiaya);

        scanner.close();
    }
}
