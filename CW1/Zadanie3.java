package Seminar_2.CW1;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
//        Дан массив целых чисел. Найти количество пар соседних элементов, где первый элемент вдвое больше второго.
//        int k = 0;
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] mass = new int[n];
//        for (int i = 0; i < n; i++) {
//            mass[i] = scanner.nextInt();
//        }
//
//        for (int i = 0; i < n - 1; i++) {
//            if (mass[i] == 2 * mass[i + 1]) {
//                k++;
//            }
//        }
//        scanner.close();
//        System.out.println("k= " + k);
        Zadanie4 vektor = new Zadanie4(5,6,7);
        Zadanie4 vektor1 = new Zadanie4(2,3,6);

        System.out.println(vektor);
        System.out.println("lentgh = " + vektor1.length());
        System.out.println("proizv = " + vektor.proizv(vektor1));
        System.out.println("vect_pr = " + vektor.vect_pr(vektor1));
        System.out.println("cos = " + vektor.cos_ugl(vektor1));
        System.out.println("sum_vek = " + vektor.summm(vektor1));
        System.out.println("diff_vek = " + vektor.diff(vektor1));
    }

}
