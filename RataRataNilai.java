import java.util.Scanner;

public class RataRataNilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();
        double totalNilai = 0;

        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + i + ": ");
            double nilai = scanner.nextDouble();
            totalNilai += nilai; 
        }
        double rataRata = totalNilai / jumlahSiswa;
        System.out.println("Rata-rata nilai dari " + jumlahSiswa + " siswa adalah: " + rataRata);
        scanner.close();
    }
}
