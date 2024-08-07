import java.util.Scanner;

public class Baitap4 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhận đầu vào từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập vào khoảng số tự nhiên
        System.out.print("Nhập vào số bắt đầu của khoảng: ");
        int start = scanner.nextInt();
        System.out.print("Nhập vào số kết thúc của khoảng: ");
        int end = scanner.nextInt();

        // Tính tổng các số chẵn trong khoảng
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        // Hiển thị kết quả
        System.out.println("Tổng các số chẵn trong khoảng từ " + start + " đến " + end + " là: " + sum);

        // Đóng Scanner
        scanner.close();
    }
}
