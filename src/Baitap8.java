import java.util.Scanner;

public class Baitap8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a, b, c;

        while (true) {
            // Nhập ba cạnh của tam giác
            System.out.print("Nhập cạnh a: ");
            a = scanner.nextDouble();
            System.out.print("Nhập cạnh b: ");
            b = scanner.nextDouble();
            System.out.print("Nhập cạnh c: ");
            c = scanner.nextDouble();

            // Kiểm tra điều kiện tam giác
            if (isValidTriangle(a, b, c)) {
                double perimeter = calculatePerimeter(a, b, c);
                double area = calculateArea(a, b, c);

                System.out.println("Tam giác hợp lệ.");
                System.out.println("Chu vi của tam giác là: " + perimeter);
                System.out.println("Diện tích của tam giác là: " + area);
                break;
            } else {
                System.out.println("Ba cạnh nhập vào không tạo thành một tam giác hợp lệ. Vui lòng nhập lại.");
            }
        }

        scanner.close();
    }

    // Hàm kiểm tra điều kiện tam giác
    public static boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    // Hàm tính chu vi của tam giác
    public static double calculatePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    // Hàm tính diện tích của tam giác bằng công thức Heron
    public static double calculateArea(double a, double b, double c) {
        double s = (a + b + c) / 2; // nửa chu vi
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
