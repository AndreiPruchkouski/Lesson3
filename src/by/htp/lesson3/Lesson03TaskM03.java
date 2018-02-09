package by.htp.lesson3;

import java.util.Random;

public class Lesson03TaskM03 {

	public static void main(String[] args) {
		// Дана матрица (двумерный массив). Поменять местами две любые ее строки.
		int [][] mass = new int [4][6];
		Random rand = new Random();
		int a = 2; 
		int b = 4;
		
		for(int i = 0; i < mass.length; i++) {
			for(int j = 0; j < mass[i].length; j++) {
				mass[i][j] = rand.nextInt((100 - 1) + 1) + 1;
				
			}
		}
		
		System.out.println("Исходный массив: ");
		for(int i = 0; i < mass.length; i++) {
			for(int j = 0; j < mass[i].length; j++) {
				System.out.print(mass[i][j] + " ");
				
			}
			System.out.println();
		}
		System.out.println("Какие строки обменять: " + a + " " + b);
		
		
		// Производим обмен заданных строк
		for(int j = 0; j < mass[a].length ; j++ ) {
			int temp = mass[a-1][j];
			mass[a-1][j] = mass[b-1][j];
			mass[b-1][j] = temp; 
		}
		
		System.out.println("Обновленный массив: ");
		for(int i = 0; i < mass.length; i++) {
			for(int j = 0; j < mass[i].length; j++) {
				System.out.print(mass[i][j] + " ");
				
			}
			System.out.println();
		}
		
		// Увеличить функционал добавлением ввода через консоль размерности массива и значения строк для замены
		
	}

}
