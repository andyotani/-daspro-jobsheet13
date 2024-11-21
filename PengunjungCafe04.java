import java.util.Scanner;

public class PengunjungCafe04 {
    public static void main(String[] args) {
        daftarpengunjung("Andi", "Budi", "Citra");
        Menu("Andi", true);

        Scanner sc = new Scanner(System.in);

        int totalHargaKeseluruhan = 0;

        System.out.print("\nMasukkan jumlah jenis menu yang ingin Anda pesan: ");
        int jumlahPesanan = sc.nextInt();

        for (int i = 1; i <= jumlahPesanan; i++) {
            System.out.println("\nPesanan ke-" + i);
            System.out.print("Masukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = sc.nextInt();

            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();

            System.out.print("Masukkan kode promo (jika ada): ");
            String kodePromo = sc.next();

            int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
            totalHargaKeseluruhan += totalHarga;
        }

        System.out.println("\nTotal keseluruhan pesanan Anda: Rp " + totalHargaKeseluruhan);

    }

    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat Datang, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15.000");
        System.out.println("2. Cappucinno - Rp 20.000");
        System.out.println("3. Latte - Rp 22.000");
        System.out.println("4. Teh Tarik - Rp 12.000");
        System.out.println("5. Roti Bakar - Rp 10.000");
        System.out.println("6. Mie Goreng - Rp 18.000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Anda mendapatkan diskon 50% dengan kode promo!");
            hargaTotal *= 0.5; // Diskon 50%
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Anda mendapatkan diskon 30% dengan kode promo!");
            hargaTotal *= 0.7; // Diskon 30%
        } else {
            System.out.println("Kode promo tidak valid.");
        }

        return hargaTotal;
    }

    public static void daftarpengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung:");
        for (int i = 0; i < namaPengunjung.length; i++) {
            System.out.println("- " + namaPengunjung[i]);
        }
    }
}
