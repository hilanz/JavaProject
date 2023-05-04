import java.util.Scanner;

public class AdminHotel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;

        System.out.println("Tampilan Menu : ");
        System.out.println("1. Total penghasilan ");
        System.out.println("2. Data Penyewa ");
        System.out.println("3. Data Kamar ");
        System.out.print("Masukkan Angka : ");
        menu = input.nextInt();

        switch (menu) {
            case 1:
                System.out.println("Total Penghasilan : ");
                System.out.println("Kamar Single \t\t\t: Rp 175.000");
                System.out.println("Jumlah Kamar \t\t\t: 1");
                System.out.println("Layanan Tambahan : Gym \t\t: Rp 50.000");
                System.out.println("Biaya Admin \t\t\t: Rp 5.000");
                System.out.println("Total Pembayaran \t\t: Rp 230.000");
                break;
            case 2:
                System.out.println("Data Penyewa yang sering menginap: ");
                System.out.println("Nama : gus anwar samsudin");
                System.out.println("Alamat : Jalan inaja dulu rt10 rw05");
                System.out.println("No.Telepon : 089898989898");
                System.out.println("No.KTP : 178902799768");
                System.out.println("Penyewa kamar: Single");
                break;
            case 3:
                System.out.println("Data Kamar : ");lo
                System.out.println("1.Kamar single");
                System.out.println("Status kamar: Tidak tersedia");
                System.out.println("");
                System.out.println("2.kamar Suite");
                System.out.println("Status kamar: tersedia");
                break;

            default:
                System.out.println("Pilihan Tidak Tersedia");
        }
    }

}
