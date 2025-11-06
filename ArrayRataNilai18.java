import java.util.Scanner;

public class ArrayRataNilai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        double total = 0;
        double rata2;
        int jumlahLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        // perulangan untuk menghitung jumlah nilai total dan menghitung mahasiswa lulus
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];  // Menambahkan nilai mahasiswa ke total
            if (nilaiMhs[i] > 70) {  // Mengecek apakah mahasiswa lulus
                jumlahLulus++;  // Menambah jumlah mahasiswa yang lulus
            }
        }

        rata2 = total / nilaiMhs.length;  // Total dibagi jumlah elemen array
        System.out.println("Rata-rata nilai = " + rata2);  // Menampilkan rata-rata

        // Menampilkan jumlah mahasiswa yang lulus
        System.out.println("Jumlah mahasiswa yang lulus: " + jumlahLulus);

        sc.close();  // Menutup scanner
    }
}
