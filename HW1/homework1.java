package Seminar_2.HW1;
import  java.util.Scanner;
public class homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        boolean c = true;
        for (int j = 0; j < n; j++) {
            int num = scanner.nextInt();
            if (num > 1) {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        c = false;
                        break;
                    }
                }
                if (c) {
                    sum += num;
                    System.out.println(num + "|" + sum);
                } else {
                    c = true;
                }
            }
        }
        scanner.close();
        System.out.println("sum =" + sum);
    }
}
