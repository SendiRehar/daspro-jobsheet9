import java.util.Scanner;

public class Tugas121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int batasLulus = 60;

        int banyak;
        do {
            System.out.print("Masukkan banyaknya nilai mahasiswa: ");
            banyak = sc.nextInt();
            if (banyak <= 0) {
                System.out.println("Banyaknya nilai harus lebih dari 0.");
            }
        } while (banyak <= 0);

        
        int[] nilai = new int[banyak];
        for (int i = 0; i < banyak; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }

        
        double jumlahNilai = 0;
        for (int i = 0; i < banyak; i++) {
            jumlahNilai = jumlahNilai + nilai[i];
        }
        double rataRata = jumlahNilai / banyak;

        
        int tertinggi = nilai[0];
        int terendah = nilai[0];
        for (int i = 1; i < banyak; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }

        
        System.out.println();
        System.out.println("===== DAFTAR NILAI MAHASISWA =====");
        for (int i = 0; i < banyak; i++) {
            String status;
            if (nilai[i] >= batasLulus) {
                status = "LULUS";
            } else {
                status = "TIDAK LULUS";
            }
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i] + " - " + status);
        }

        System.out.println("----------------------------------");
        System.out.println("Nilai rata-rata : " + rataRata);
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah  : " + terendah);

        sc.close();
    }
}