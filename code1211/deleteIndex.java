import java.util.Scanner;

public class deleteIndex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử : ");
        int Numbers = scanner.nextInt();
        int[] array = new int[Numbers];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < Numbers; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Nhập giá trị xoá (X): ");
        int X = scanner.nextInt();
        int index_del = -1;
        for (int i = 0; i < Numbers; i++) {
            if (array[i] == X) {
                index_del = i;
                System.out.println("Phần tử " + X + " xuất hiện tại vị trí " + (index_del + 1));
                break;
            }
        }
        if (index_del != -1) {
            for (int i = index_del; i < Numbers - 1; i++) {
                array[i] = array[i + 1];
            }
        } else {
            System.out.println("Không tìm thấy phần tử " + X );
        }

        System.out.println("Mảng sau" + X );
        for (int i = 0; i < Numbers; i++) {
            System.out.print(array[i] + " ");
        }

        scanner.close();
    }
}
