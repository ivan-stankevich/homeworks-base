package org.ivan_stankevich.homeworks.homework4;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
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
        System.out.println("Нечетные элементы находящиеся под главной диагональю(включительно)");
        // Решение для  задания 2
        for(int i =0; i < n; i++){
            for(int j = 0; j <= i; j++){
                if (mass[i][j] % 2 == 1){
                    System.out.print(mass[i][j] + " ");
                }
            }
        }
        // Конец решения
    }
}
