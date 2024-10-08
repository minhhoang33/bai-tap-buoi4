package buoi_4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Account {
    private String username;
    private String password;
    private double balance;

    public Account(String username, String password, double balance) {
        this.username = username;
        this.password = password;
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Bạn đã rút " + amount + " vnđ vào lúc " + getCurrentTime());
        } else {
            System.out.println("Số tiền rút không hợp lệ hoặc vượt quá số dư!");
        }
    }

    private String getCurrentTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    public void displayAccountInfo() {
        System.out.println("Thông tin tài khoản:");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Balance: " + balance + " vnđ");
    }
}

