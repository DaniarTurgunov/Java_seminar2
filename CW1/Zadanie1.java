package Seminar_2.CW1;
import  java.util.Scanner;
public class Zadanie1 {
    public static void main(String[] args) {
        double x;
        int n;
        double result = 1;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextDouble();
        n= scanner.nextInt();
        scanner.close();
        if (n<0){
            x = 1/x;
            n*=-1;
        }
        for (int i = 0; i < n; i++) {
            result *=x;
        }
        System.out.println("result= " + result);
    }
}
