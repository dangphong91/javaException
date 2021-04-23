import java.util.*;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        System.out.print("Mảng nhập vào: \n");
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random()*100);
            System.out.print(arr[i] + ", ");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nNhập vào index:");
        int index = scanner.nextInt();
        try {
            System.out.println(arr[index]);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Vượt quá mảng! " + e.getMessage());
        }
    }
}
