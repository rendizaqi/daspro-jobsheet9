import java.util.Scanner;
public class SearchNilai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Meminta input jumlah nilai yang akan dimasukkan
        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int n = sc.nextInt();

        // Membuat array dengan ukuran sesuai input jumlah nilai
        int[] arrNilai = new int[n];

        // Meminta input nilai-nilai mahasiswa
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            arrNilai[i] = sc.nextInt();  // Menerima input nilai mahasiswa
        }

        // Meminta input nilai yang ingin dicari
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        // Variabel untuk menyimpan hasil pencarian
        int hasil = -1;

        // Mencari nilai dalam array
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;  // Menyimpan indeks jika ditemukan
                break;  // Menghentikan pencarian setelah menemukan nilai
            }
        }

        // Menampilkan hasil pencarian
        if (hasil != -1) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1));
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan.");
        }

        sc.close();  // Menutup scanner
    }
}
