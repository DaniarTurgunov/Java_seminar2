package Seminar_2.CW1;
//2) Дана последовательность из N целых чисел. Найти сумму чисел, оканчивающихся на 5, перед которыми идет четное число.
import  java.util.Scanner;
public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = scanner.nextInt();
        int summ = 0;
        for (int i = 1; i < n; i++) {
            int num2 = scanner.nextInt();
            if(num%2 ==0 && num2%10==5){
                summ += num2;

            }
            num = num2;
        }
        scanner.close();
        System.out.println(summ);
    }
}