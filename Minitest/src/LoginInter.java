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
        int choice = -1;
        Scanner input = new Scanner(System.in);

        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw a rectangle");
            System.out.println("2. Draw a right triangle");
            System.out.println("3. Draw an isosceles triangle");
            System.out.println("0. Exit");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Vẽ hình chữ nhật");
                    System.out.println("* * * * * ");
                    System.out.println("* * * * * ");
                    System.out.println("* * * * * ");
                    break;
                case 2:
                    System.out.println("Vẽ tam giác vuông");
                    System.out.println("* ");
                    System.out.println("* * ");
                    System.out.println("* * * ");
                    System.out.println("* * * * ");
                    System.out.println("* * * * * ");
                    break;
                case 3:
                    System.out.println("Vẽ tam giác cân");
                    System.out.println("      *     ");
                    System.out.println("     * *    ");
                    System.out.println("    * * *   ");
                    System.out.println("   * * * *  ");
                    System.out.println("  * * * * * ");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng chọn đúng.");
            }
        }
    }
}

