package org.ivan_stankevich.homeworks.homework4;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
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
        // Решение для  задания 3
        int proizvedMainDiagonal = 1;
        int proizvedSideDiagonal = 1;
        for(int i = 0; i < mass.length; i++){
            proizvedMainDiagonal *= mass[i][i];
        }
        for(int i = 0; i < mass.length; i++){
            int j = mass.length - 1 - i;
            proizvedSideDiagonal *= mass[i][j];
        }
        // Конец решения
        System.out.println("Произведение главной диагонали = " + proizvedMainDiagonal);
        System.out.println("Произведение побочной диагонали = " + proizvedSideDiagonal);
        int bigger = Math.max(proizvedMainDiagonal, proizvedSideDiagonal);
        System.out.println("Большее число = " + bigger);
    }
}
