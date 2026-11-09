import java.util.Scanner;

public class ArrayRataNilai21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilaiMhs = new int[10];
        int total = 0;
        double rataRata;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = input.nextInt();
            total += nilaiMhs[i];
        }
        rataRata = (double) total / nilaiMhs.length;
        System.out.println("Total Nilai: " + total);
        System.out.println("Rata-rata Nilai: " + rataRata);

        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];
        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi)
                tertinggi = nilaiMhs[i];
            if (nilaiMhs[i] < terendah) 
                terendah = nilaiMhs[i];  
        }

        System.out.println("Nilai Tertinggi: " + tertinggi);
        System.out.println("Nilai Terendah: " + terendah);

        if (rataRata >= 80) {
            System.out.println("Predikat kelas: SANGAT BAIK");
        } else if (rataRata >= 70) {
            System.out.println("Predikat kelas: BAIK");
        } else {
            System.out.println("Predikat kelas: PERLU PENDAMPINGAN");
        }
    }
}