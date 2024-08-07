import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một số tự nhiên: ");
        int number = scanner.nextInt();
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Số " + number + " chia hết cho cả 3 và 5.");
        } else {
            System.out.println("Số " + number + " không chia hết cho cả 3 và 5.");
        }
        scanner.close();
    }
}
