package org.ivan_stankevich.homeworks.homework4;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите размерность квадратной матрицы");
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int n = in.nextInt();
        int[][] mass = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mass[i][j] = random.nextInt(51);
            }
        }
        System.out.println("Квадратная матрица");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
        // Решение для  задания 4
        int sum = 0;
        for(int i = n - 2; i >= 0; i--){
            for(int j = 0; j <= n - 2 - i; j++){
                if (mass[i][j] % 2 == 0){
                    sum += mass[i][j];
                }
            }
        }
        // Конец решения
        System.out.print("Сумма четных элементов стоящих над побочной диагональю (не включительно) = " + sum);
    }
}
