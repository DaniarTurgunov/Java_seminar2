package Seminar_2.HW2;
import  java.util.Scanner;
public class homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num1 = scanner.nextInt();
        int count = 0;
        for (int i = 1; i < n; i++) {
            int num2 = scanner.nextInt();
            if (num2>num1){
                count++;
            }
            num1 = num2;
        }
        if (count == n){
            System.out.println("Последовательность является возрастающей");
        }
        else{
            System.out.println("Последовательность не является возрастающей");
        }
    }
}
