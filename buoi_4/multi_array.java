package buoi_4;

import java.util.Scanner;

public class multi_array {
    public multi_array() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời b nhập số dòng: ");
        int row = scanner.nextInt();
        System.out.println("Mời b nhập số cột: ");
        int column = scanner.nextInt();
        int sum = 0;
        int[][] arr = new int[row][column];

        int i;
        int j;
        for(i = 0; i < row; ++i) {
            for(j = 0; j < column; ++j) {
                System.out.println("Mời b nhập a[" + i + "][" + j + "]");
                arr[i][j] = scanner.nextInt();
                System.out.println(arr[i][j]);
            }
        }

        for(i = 0; i < row; ++i) {
            for(j = 0; j < column; ++j) {
                System.out.print(arr[i][j] + "\t");
                if (arr[i][j] % 3 == 0) {
                    sum += arr[i][j];
                }
            }

            System.out.println();
        }

        System.out.println("Tong cac so chia het cho 3 la: ");
        System.out.println(sum);
    }
}

