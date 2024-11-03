import java.util.Scanner;

public class perhitungan_lingkaran {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inputValid = false;
        double diameter = 0;

        System.out.println("======Perhitungan Lingkaran======");

        // Looping sampai input yang valid diterima
        while (!inputValid) {
            System.out.print("Masukkan nilai diameter lingkaran: ");
            String input = scanner.nextLine();

            try {
                // Coba parsing input ke tipe double
                diameter = Double.parseDouble(input);

                // Cek jika diameter lebih besar dari 0
                if (diameter > 0) {
                    inputValid = true; // Input valid
                } else {
                    System.out.println("Nilai Diameter Tidak Sesuai");
                }

            } catch (NumberFormatException e) {
                // Tangani input tidak valid yang tidak bisa diubah ke angka
                System.out.println("Nilai Diameter Tidak Sesuai");
            }
        }

        // Menghitung jari-jari, luas, dan keliling lingkaran
        double jariJari = diameter / 2;
        double luas = Math.PI * jariJari * jariJari;
        double keliling = 2 * Math.PI * jariJari;

        // Menampilkan hasil perhitungan
        System.out.println("======Hasil Perhitungan Lingkaran======");
        System.out.printf("Jari-jari Lingkaran = %.2f cm\n", jariJari);
        System.out.printf("Luas Lingkaran = %.2f cm\n", luas);
        System.out.printf("Keliling Lingkaran = %.2f cm\n", keliling);
    }
}
