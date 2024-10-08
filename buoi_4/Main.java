package buoi_4;

import java.util.Scanner;

public class Main {
    private static Account account = new Account("techmaster", "hoclacoviec", 1000000);
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        login();
    }

    public static void login() {
        while (true) {
            System.out.print("Nhập username: ");
            String inputUsername = scanner.nextLine();
            System.out.print("Nhập password: ");
            String inputPassword = scanner.nextLine();

            if (account.getUsername().equals(inputUsername) && account.getPassword().equals(inputPassword)) {
                showMenu();
            } else {
                System.out.println("Login thất bại. Bạn có muốn thử lại không? (Y/N)");
                String retry = scanner.nextLine();
                if (retry.equalsIgnoreCase("N")) {
                    System.exit(0);
                }
            }
        }
    }

    public static void showMenu() {
        while (true) {
            System.out.println("\nChọn chức năng:");
            System.out.println("1. Xem thông tin tài khoản");
            System.out.println("2. Rút tiền");
            System.out.print("Lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    account.displayAccountInfo();
                    break;
                case 2:
                    withdrawMoney();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }

            System.out.print("Do you want to continue? (Y/N): ");
            String continueChoice = scanner.nextLine();
            if (continueChoice.equalsIgnoreCase("N")) {
                System.exit(0);
            }
        }
    }

    public static void withdrawMoney() {
        System.out.print("Nhập số tiền bạn muốn rút: ");
        double amount = Double.parseDouble(scanner.nextLine());
        account.withdraw(amount);
    }
}

