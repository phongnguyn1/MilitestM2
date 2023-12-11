import java.util.Scanner;

public class addaIndex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int N = scanner.nextInt();
        int[] array = new int[N];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < N; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Nhập (X): ");
        int X = scanner.nextInt();
        System.out.print("Nhập vị trí index");
        int index = scanner.nextInt();
        if (index < 0 || index >= array.length) {
            System.out.println("Không thể chèn phần tử");
        } else {
            for (int i = N - 1; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = X;
            N++;
            System.out.println("Mảng sau khi chèn phần tử " + X + " vào vị trí " + index + ":");
            for (int i = 0; i < N; i++) {
                System.out.print(array[i] + " ");
            }
        }

        scanner.close();
    }
}
