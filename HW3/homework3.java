package Seminar_2.HW3;
import java.util.Arrays;
import  java.util.Scanner;
public class homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mass = new int[n];
        int sum = 0;
        for (int i = 0; i <n; i++) {
            mass[i] = scanner.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            if (10 <= mass[i] && mass[i] <= 99 || -10 >= mass[i] && mass[i] >= -99 ){
                sum += i;
            }
        }
        for (int i = 0; i < n-1; i++) {
            if (mass[i] < 0){
                mass[i] = sum;
            }
        }
        System.out.println(Arrays.toString(mass));
    }
}
