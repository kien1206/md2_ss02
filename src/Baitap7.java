import java.util.Scanner;

public class Baitap7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Hiển thị menu
            System.out.println("Menu:");
            System.out.println("1. Kiểm tra tính chẵn lẻ của 1 số");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Kiểm tra một số có chia hết cho 3 không");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkEvenOdd(scanner);
                    break;
                case 2:
                    checkPrime(scanner);
                    break;
                case 3:
                    checkDivisibleBy3(scanner);
                    break;
                case 4:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 4);

        scanner.close();
    }

    // Hàm kiểm tra tính chẵn lẻ của 1 số
    public static void checkEvenOdd(Scanner scanner) {
        System.out.print("Nhập vào một số: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Số " + number + " là số chẵn.");
        } else {
            System.out.println("Số " + number + " là số lẻ.");
        }
    }

    // Hàm kiểm tra số nguyên tố
    public static void checkPrime(Scanner scanner) {
        System.out.print("Nhập vào một số: ");
        int number = scanner.nextInt();
        if (isPrime(number)) {
            System.out.println("Số " + number + " là số nguyên tố.");
        } else {
            System.out.println("Số " + number + " không phải là số nguyên tố.");
        }
    }

    // Hàm kiểm tra một số có chia hết cho 3 không
    public static void checkDivisibleBy3(Scanner scanner) {
        System.out.print("Nhập vào một số: ");
        int number = scanner.nextInt();
        if (number % 3 == 0) {
            System.out.println("Số " + number + " chia hết cho 3.");
        } else {
            System.out.println("Số " + number + " không chia hết cho 3.");
        }
    }

    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
