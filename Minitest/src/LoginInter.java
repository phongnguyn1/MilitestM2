import java.util.Scanner;

public class LoginInter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập username: ");
        String username = scanner.nextLine();
        int count = 0;

        do {
            if (username.equals("admin")) {
                System.out.print("Nhập password:");
                String password = scanner.nextLine();

                if (password.equals("123456")) {
                    System.out.println("Login thành công");
                    showMenu();
                    break;
                } else {
                    System.out.println("Sai mật khẩu");
                    count++;
                }
            } else {
                System.out.println("Sai username");
                count++;
                break;
            }
        } while (count < 4);
    }

    private static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Vẽ hình chữ nhật");
            System.out.println("2. Vẽ tam giác vuông");
            System.out.println("3. Vẽ tam giác cân");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn : ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    drawRectangle();
                    break;
                case 2:
                    drawRightTriangle();
                    break;
                case 3:
                    drawIsoscelesTriangle();
                    break;
                case 0:
                    System.out.println("Thoát ");
                    break;
                default:
                    System.out.println("Vui lòng chọn lại.");
            }
        } while (choice != 0);
    }

    private static void drawRectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều rộng: ");
        int width = scanner.nextInt();
        System.out.print("Nhập chiều cao: ");
        int height = scanner.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void drawRightTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh góc vuông : ");
        int side = scanner.nextInt();
        for (int i = 0; i < side; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void drawIsoscelesTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều cao : ");
        int height = scanner.nextInt();
        System.out.print("Nhập cạnh đáy : ");
        int base = scanner.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < base; j++) {
                if (j >= (base - 1) / 2 - i && j <= (base - 1) / 2 + i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
