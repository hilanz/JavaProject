import java.util.Scanner;

public class HotelReservation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input tanggal dan waktu check-in
        System.out.print("Masukkan tanggal check-in (dd/mm/yyyy): ");
        String checkInDate = input.nextLine();
        System.out.print("Masukkan waktu check-in (hh:mm): ");
        String checkInTime = input.nextLine();
        System.out.println();

        // Menampilkan pilihan kamar
        System.out.println("Silakan pilih kamar:");
        System.out.println("1. Single (Rp. 175.000,-/malam)");
        System.out.println("2. Suite (Rp. 300.000,-/malam)");
        System.out.print("Pilihan Anda: ");
        int roomType = input.nextInt();
        System.out.println();

        // Menampilkan ketersediaan kamar
        if (roomType == 1) {
            System.out.println("Kamar single tidak tersedia.");
        } else if (roomType == 2) {
            System.out.println("Kamar suite tersedia.");
        } else {
            System.out.println("Pilihan tidak valid.");
            return;
        }

        // Meminta input data diri jika kamar tersedia
        System.out.println();
        System.out.print("Apakah Anda ingin memesan kamar ini? (Y/N): ");
        String bookRoom = input.next();
        if (bookRoom.equalsIgnoreCase("Y")) {
            input.nextLine(); // mengosongkan buffer
            System.out.print("Masukkan nama lengkap: ");
            String name = input.nextLine();
            System.out.print("Masukkan nomor telepon: ");
            String phone = input.nextLine();
            System.out.println();

            // Memilih metode pembayaran
            System.out.println("Silakan pilih metode pembayaran:");
            System.out.println("1. Cash");
            System.out.println("2. Pembayaran Online");
            System.out.print("Pilihan Anda: ");
            int paymentMethod = input.nextInt();
            System.out.println();

            // Menampilkan bukti pembayaran jika menggunakan pembayaran online
            if (paymentMethod == 2) {
                System.out.println("Bukti pembayaran:");
                System.out.println("Kode booking: " + generateBookingCode());
            }

            // Menampilkan data pemesanan
            System.out.println("Data pemesanan:");
            System.out.println("Nama: " + name);
            System.out.println("Nomor telepon: " + phone);
            System.out.println("Jenis kamar: " + (roomType == 1 ? "Single" : "Suite"));
            System.out.println("Check-in: " + checkInDate + " " + checkInTime);
            System.out.println("Total biaya: " + (roomType == 1 ? "Rp. 175.000,-" : "Rp. 300.000,-"));
        }
    }

    // Menghasilkan kode booking acak
    private static String generateBookingCode() {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder code = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            int index = (int) (Math.random() * alphabet.length());
            code.append(alphabet.charAt(index));
        }
        return code.toString();
    }
}