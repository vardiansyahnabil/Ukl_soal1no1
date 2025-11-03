import java.util.Scanner;
public class Ukl_Soal1a  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berat paket (kg): ");
        double berat = input.nextDouble();

        System.out.print("Masukkan jarak pengiriman (km): ");
        double jarak = input.nextDouble();

        System.out.print("Masukkan panjang paket (cm): ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar paket (cm): ");
        double lebar = input.nextDouble();`

        System.out.print("Masukkan tinggi paket (cm): ");
        double tinggi = input.nextDouble();

        double volume = panjang * lebar * tinggi;

        double biayaPerKg = (jarak <= 10) ? 4250 : 6000;
        double biayaBerat = berat * biayaPerKg;
        double biayaVolume = (volume > 100) ? 50000 : 0;
        double totalBiaya = biayaBerat + biayaVolume;

        System.out.println("\n=== RINCIAN BIAYA PENGIRIMAN ===");
        System.out.println("Volume paket       : " + volume + " cm³");
        System.out.println("Biaya per kg       : Rp " + biayaPerKg);
        System.out.println("Biaya berat        : Rp " + biayaBerat);
        System.out.println("Biaya volume       : Rp " + biayaVolume);
        System.out.println("TOTAL BIAYA        : Rp " + totalBiaya);

        input.close();
    }
}


