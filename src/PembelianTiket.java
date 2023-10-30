import java.util.Scanner;

/**
 * Program sederhana untuk menghitung total harga tiket berdasarkan jumlah tiket yang dibeli.
 */
public class PembelianTiket {
    /**
     * Metode utama yang akan dijalankan ketika program dimulai.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam program ini).
     */
    public static void main(String[] args) {
        // Harga tiket dalam Rupiah
        int hargaTiket = 50000;

        // Input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
        int jumlahTiket = scanner.nextInt();

        // Menghitung total harga
        int totalHarga = hargaTiket * jumlahTiket;

        // Output hasil
        System.out.println("Anda telah membeli " + jumlahTiket + " tiket.");
        System.out.println("Total harga: " + formatRupiah(totalHarga));
    }

    /**
     * Fungsi untuk mengubah jumlah dalam bentuk angka menjadi format mata uang Rupiah.
     *
     * @param amount Jumlah dalam bentuk angka yang akan diubah menjadi format Rupiah.
     * @return String berisi jumlah dalam format Rupiah (contoh: "Rp 50.000").
     */
    public static String formatRupiah(int amount) {
        String rupiah = "Rp ";
        String amountString = Integer.toString(amount);
        int length = amountString.length();
        int count = 0;

        for (int i = length - 1; i >= 0; i--) {
            rupiah = amountString.charAt(i) + rupiah;
            count++;
            if (count == 3 && i != 0) {
                rupiah = "." + rupiah;
                count = 0;
            }
        }

        return rupiah;
    }
}
