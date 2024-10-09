import java.util.Scanner;

public class BilanganTerbesar10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan 1: ");
        int bilangan1 = scanner.nextInt();
        System.out.print("Masukkan bilangan 2: ");
        int bilangan2 = scanner.nextInt();
        System.out.print("Masukkan bilangan 3: ");
        int bilangan3 = scanner.nextInt();

        int hasil;

        if (bilangan1 > bilangan2) {
            if (bilangan1 > bilangan3) {
                hasil = bilangan1; 
            } else {
                hasil = bilangan3; 
            }
        } else {
            if (bilangan2 > bilangan3) {
                hasil = bilangan2; 
            } else {
                hasil = bilangan3; 
            }
        }

        System.out.println("Bilangan terbesar adalah: " + hasil);
        scanner.close();
    }
}
