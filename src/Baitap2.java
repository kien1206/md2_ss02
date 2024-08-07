import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhận đầu vào từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập vào một số từ 0 đến 9
        System.out.print("Nhập vào một số từ 0 đến 9: ");
        int number = scanner.nextInt();

        // Hiển thị cách đọc của số đó
        switch (number) {
            case 0:
                System.out.println("Số Không");
                break;
            case 1:
                System.out.println("Số Một");
                break;
            case 2:
                System.out.println("Số Hai");
                break;
            case 3:
                System.out.println("Số Ba");
                break;
            case 4:
                System.out.println("Số Bốn");
                break;
            case 5:
                System.out.println("Số Năm");
                break;
            case 6:
                System.out.println("Số Sáu");
                break;
            case 7:
                System.out.println("Số Bảy");
                break;
            case 8:
                System.out.println("Số Tám");
                break;
            case 9:
                System.out.println("Số Chín");
                break;
            default:
                System.out.println("Số không hợp lệ! Vui lòng nhập số từ 0 đến 9.");
        }

        // Đóng Scanner
        scanner.close();
    }
}
