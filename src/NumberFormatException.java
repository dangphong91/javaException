import java.util.*;

public class NumberFormatException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập x:");
        int x = scanner.nextInt();
        System.out.println("Nhập y:");
        int y = scanner.nextInt();
        try {
            System.out.println("Tổng: " + x + " + " + y + " = " + (x+y));
            System.out.println("Hiệu: " + x + " - " + y + " = " + (x-y));
            System.out.println("Tích: " + x + " * " + y + " = " + (x*y));
            System.out.println("Thương: " + x + " / " + y + " = " + (x/y));
        }
        catch (Exception e) {
            System.out.println("Input lỗi" + e.getMessage());
        }
    }
}
