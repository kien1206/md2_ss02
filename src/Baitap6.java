public class Baitap6 {
    public static void main(String[] args) {
        int count = 0;  // Đếm số nguyên tố đã tìm được
        int number = 2; // Bắt đầu kiểm tra từ số 2

        System.out.println("20 số nguyên tố đầu tiên là:");

        // Vòng lặp để tìm và hiển thị 20 số nguyên tố đầu tiên
        while (count < 20) {
            if (isPrime(number)) {
                System.out.println(number);
                count++;
            }
            number++;
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
