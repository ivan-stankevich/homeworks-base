package org.ivan_stankevich.homeworks.homework4;

import java.util.Random;
import java.util.Scanner;

public class Task5 {
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
        System.out.println();
        System.out.println("Квадратная матрица");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
        // Решение для  задания 5
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                if (i != j){
                    int values = mass[i][j];
                    mass [i][j] = mass[j][i];
                    mass[j][i] = values;
                }
            }
        }
        // Конец решения
        System.out.println();
        System.out.println("Транспонировання матрица");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
    }
}
