package Basic;
import java.util.Scanner;
public class ChineZodyak {
    public static void main(String[] args) {
        int yas,choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Doğum yılınızı girin: ");
        yas = input.nextInt();

        choice = yas % 12;

        if (choice == 0) {
            System.out.println("Çin Zodyağı Burcunuz: " + "Maymun");
        } else if (choice == 1) {
            System.out.println("Çin Zodyağı Burcunuz: " + "Horoz");
        } else if (choice == 2) {
            System.out.println("Çin Zodyağı Burcunuz: " + "Köpek");
        } else if (choice == 3) {
            System.out.println("Çin Zodyağı Burcunuz: " + "Domuz");
        } else if (choice == 4) {
            System.out.println("Çin Zodyağı Burcunuz: " + "Fare");
        } else if (choice == 5) {
            System.out.println("Çin Zodyağı Burcunuz: " + "Öküz");
        } else if (choice == 6) {
            System.out.println("Çin Zodyağı Burcunuz: " + "Kaplan");
        } else if (choice == 7) {
            System.out.println("Çin Zodyağı Burcunuz: " + "Tavşan");
        } else if (choice == 8) {
            System.out.println("Çin Zodyağı Burcunuz: " + "Ejderha");
        } else if (choice == 9) {
            System.out.println("Çin Zodyağı Burcunuz: " + "Yılan");
        } else if (choice == 10) {
            System.out.println("Çin Zodyağı Burcunuz: " + "At");
        } else if (choice == 11) {
            System.out.println("Çin Zodyağı Burcunuz: " + "Koyun");
        }else{
            System.out.println("Hatalı veri girdiniz!");
        }
    }
}
