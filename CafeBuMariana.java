import java.util.Scanner;

public class CafeBuMariana {
    // Data penjualan 5 menu dari hari pertama hingga ketujuh
    static int[][] penjualan = new int[5][7]; // Array 5 menu, 7 hari

    // Fungsi untuk memasukkan data penjualan
    public static void inputDataPenjualan() {
        Scanner input = new Scanner(System.in);
        String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
        
        // Input penjualan untuk setiap menu dari hari pertama hingga ketujuh
        for (int i = 0; i < penjualan.length; i++) {
            System.out.println("Masukkan data penjualan untuk menu: " + menu[i]);
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = input.nextInt();
            }
        }
    }

    // Fungsi untuk menampilkan data penjualan
    public static void tampilkanDataPenjualan() {
        System.out.println("Data Penjualan Menu (Hari ke 1 - Hari ke 7):");
        String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
        for (int i = 0; i < penjualan.length; i++) {
            System.out.print(menu[i] + ": ");
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print(penjualan[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Fungsi untuk menampilkan data penjualan pada hari terakhir (Hari ke 7)
    public static void tampilkanPenjualanHariTerakhir() {
        System.out.println("\nPenjualan Hari Terakhir (Hari ke 7):");
        String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
        for (int i = 0; i < penjualan.length; i++) {
            System.out.println(menu[i] + ": " + penjualan[i][6]);
        }
    }

    // Fungsi untuk menampilkan menu dengan penjualan tertinggi
    public static void tampilkanMenuPenjualanTertinggi() {
        int[] totalPenjualan = new int[penjualan.length];
        int maxPenjualan = 0;
        String menuTertinggi = "";
        
        // Hitung total penjualan untuk masing-masing menu
        for (int i = 0; i < penjualan.length; i++) {
            for (int j = 0; j < penjualan[i].length; j++) {
                totalPenjualan[i] += penjualan[i][j];
            }
            if (totalPenjualan[i] > maxPenjualan) {
                maxPenjualan = totalPenjualan[i];
                menuTertinggi = (i == 0) ? "Kopi" : (i == 1) ? "Teh" : (i == 2) ? "Es Degan" :
                                 (i == 3) ? "Roti Bakar" : "Gorengan";
            }
        }
        
        System.out.println("\nMenu dengan penjualan tertinggi: " + menuTertinggi + " dengan total penjualan: " + maxPenjualan);
    }

    // Fungsi untuk menampilkan rata-rata penjualan setiap menu
    public static void tampilkanRataRataPenjualan() {
        System.out.println("\nRata-rata penjualan untuk setiap menu:");
        String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
        for (int i = 0; i < penjualan.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                totalPenjualan += penjualan[i][j];
            }
            double rataRata = (double) totalPenjualan / penjualan[i].length;
            System.out.println(menu[i] + ": " + rataRata);
        }
    }

    public static void main(String[] args) {
        // Memasukkan data penjualan dari user
        inputDataPenjualan();
        
        // Menampilkan data penjualan
        tampilkanDataPenjualan();
        
        // Menampilkan penjualan hari terakhir
        tampilkanPenjualanHariTerakhir();
        
        // Menampilkan menu dengan penjualan tertinggi
        tampilkanMenuPenjualanTertinggi();
        
        // Menampilkan rata-rata penjualan untuk setiap menu
        tampilkanRataRataPenjualan();
    }
}
