import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Daftar menu makanan di kafe
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappuccino", "Chocolate Ice"};

        // Meminta input nama makanan yang ingin dicari
        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String makananYangDicari = scanner.nextLine();

        // Mencari makanan menggunakan Linear Search
        boolean ditemukan = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(makananYangDicari)) {
                ditemukan = true;
                System.out.println("Makanan '" + makananYangDicari + "' ditemukan di menu kafe.");
                break;
            }
        }

        // Jika makanan tidak ditemukan
        if (!ditemukan) {
            System.out.println("Makanan '" + makananYangDicari + "' tidak ditemukan di menu.");
        }

        scanner.close();
    }
}
