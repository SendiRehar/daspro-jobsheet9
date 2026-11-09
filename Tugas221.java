import java.util.Scanner;

public class Tugas221 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        
        System.out.println("===== DAFTAR MENU KAFE KAMPUS =====");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
        }

    
        System.out.println();
        System.out.println("===== PENCARIAN MENU =====");
        System.out.print("Masukkan nama makanan/minuman yang ingin dipesan: ");
        String key = sc.nextLine();
        boolean ditemukan = false;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(key)) {
                System.out.println("Menu " + menu[i] + " ditemukan, harganya Rp " + harga[i]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Menu " + key + " tidak tersedia.");
        }

    
        System.out.println();
        System.out.println("===== PEMESANAN =====");
        int jumlah;
        do {
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            jumlah = sc.nextInt();
            sc.nextLine();
            if (jumlah <= 0) {
                System.out.println("Jumlah item harus lebih dari 0.");
            }
        } while (jumlah <= 0);


        String[] pesanan = new String[jumlah];
        int[] hargaPesanan = new int[jumlah];
        int total = 0;

        for (int n = 0; n < jumlah; n++) {
            boolean valid = false;
            while (!valid) {
                System.out.print("Item ke-" + (n + 1) + " - nama menu: ");
                String input = sc.nextLine();

            
                for (int i = 0; i < menu.length; i++) {
                    if (menu[i].equalsIgnoreCase(input)) {
                        pesanan[n] = menu[i];
                        hargaPesanan[n] = harga[i];
                        total = total + harga[i];
                        valid = true;
                        break;
                    }
                }
                if (!valid) {
                    System.out.println("Menu tidak tersedia, pilih menu yang ada dalam daftar.");
                }
            }
        }

    
        System.out.println();
        System.out.println("========== DAFTAR PESANAN ==========");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + ". " + pesanan[i] + " - Rp " + hargaPesanan[i]);
        }
        System.out.println("------------------------------------");
        System.out.println("TOTAL BIAYA : Rp " + total);

        sc.close();
    }
}