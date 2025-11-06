import java.util.Scanner;

public class ArrayRataNilai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMahasiswa = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMahasiswa];
        double total = 0;  // menyimpan jumlah total nilai
        double rata2;  // menyimpan nilai rata-rata
        double totalLulus = 0;  // total nilai mahasiswa yang lulus
        double totalTidakLulus = 0;  //  total nilai mahasiswa yang tidak lulus
        int jumlahLulus = 0;  //  menghitung jumlah mahasiswa yang lulus
        int jumlahTidakLulus = 0;  // menghitung jumlah mahasiswa yang tidak lulus

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        // perulangan untuk menghitung jumlah nilai total dan menghitung mahasiswa lulus
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];  // Menambahkan nilai mahasiswa ke total
            if (nilaiMhs[i] > 70) {  // Mengecek apakah mahasiswa lulus
                jumlahLulus++;  // Menambah jumlah mahasiswa yang lulus
                totalLulus += nilaiMhs[i];  // Menambahkan nilai mahasiswa yang lulus ke total lulus
            } else {
                jumlahTidakLulus++;  // Menambah jumlah mahasiswa yang tidak lulus
                totalTidakLulus += nilaiMhs[i];
            }
        }

        rata2 = total / nilaiMhs.length;  // Total dibagi jumlah elemen array
        System.out.println("Rata-rata nilai = " + rata2);  // Menampilkan rata-rata

        // Menghitung rata-rata nilai lulus dan tidak lulus
        if (jumlahLulus > 0) {
            double rataLulus = totalLulus / jumlahLulus;  // Rata-rata mahasiswa lulus
            System.out.println("Rata-rata nilai lulus = " + rataLulus);  // Menampilkan rata-rata nilai lulus
        } else {
            System.out.println("Tidak ada mahasiswa yang lulus.");
        }

        if (jumlahTidakLulus > 0) {
            double rataTidakLulus = totalTidakLulus / jumlahTidakLulus;  // Rata-rata mahasiswa tidak lulus
            System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);  // Menampilkan rata-rata nilai tidak lulus
        } else {
            System.out.println("Tidak ada mahasiswa yang tidak lulus.");
        }

        sc.close();
    }
}
