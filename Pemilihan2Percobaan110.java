import java.util.Scanner;
    public class Pemilihan2Percobaan110{
        public static void main(String[] args){

            Scanner input10 = new Scanner(System.in);

            System.out.print("Masukkan Tahun : ");
            int Tahun = input10.nextInt();

            if ((Tahun % 4) == 0) {
                if ((Tahun % 100) != 0 || Tahun % 400 == 0 || Tahun % 100 == 0) {
                    System.out.println("Tahun Kabisat");
                } else {
                    System.out.println("Bukan Tahun Kabisat");
                }   

            } else {
                System.out.println(Tahun + "Bukan Tahun Kabisat");
            }
        }
    }