import java.util.Scanner;

public class Sochan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Nhập một số nguyên bất kỳ: ");
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + " là số chẵn.");
            } else {
                System.out.println("là số lẻ");
                break;
            }
        }

        scanner.close();
    }
}
