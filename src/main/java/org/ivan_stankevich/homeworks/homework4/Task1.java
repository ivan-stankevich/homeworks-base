package org.ivan_stankevich.homeworks.homework4;

import java.util.Scanner;
import java.util.Random;

public class Task1 {
   public static void main(String[] args) {
       System.out.println("Введите размерность квадратной матрицы");
       Scanner in = new Scanner(System.in);
       Random random = new Random();
       int n = in.nextInt();
       int [][] mass = new int[n][n];
       for (int i = 0; i < n; i++) {
           for (int j = 0; j < n; j++) {
               mass[i][j] = random.nextInt(51);
           }
       }
       System.out.println("Квадратная матрица");
       for(int i = 0; i < n; i++){
           for(int j = 0; j < n; j++){
               System.out.print(mass[i][j]+ " ");
           }
           System.out.println();
       }
       // Решение для  задания 1
       int sum = 0;
       for(int i = 0; i < mass.length; i++){
           if(mass[i][i] % 2 == 0){
               sum += mass[i][i];
           }
       }
       // Конец решения
       System.out.println("Сумма чётных элементов на главной диагонали = " + sum);
   }
   public static int equals(int a, int b){
       int statement = 0;
       if (a == b) {
           statement = 1;
       }
       return statement;
   }
}
