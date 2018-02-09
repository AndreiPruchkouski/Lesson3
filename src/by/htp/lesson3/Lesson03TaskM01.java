package by.htp.lesson3;

import java.util.Random;

public class Lesson03TaskM01 {

	public static void main(String[] args) {
		// Все элементы массива поделить на значение наибольшего элемента этого массива.
		int[] mass = new int[100];
		Random rand = new Random();
		
		// Заполняем массив случайными числами
		for(int i = 0;i < mass.length; i++) {
			mass[i] = rand.nextInt((100 - 1) + 1) + 1;
			System.out.print(mass[i] + " ");
		}
		
		// Узнаем максимальное число в массиве
		int max = 0;
		for(int i = 0;i < mass.length -1; i++) {
			if (max < mass[i+1]) {
				max = mass[i+1];
			}
		}
		System.out.println("\nMax is equal to = " + max);
		
		// Объявляем второй массив для double значений
		double[] mass2 = new double[mass.length];
		
		// Заполняем массив значениями 
		for(int i = 0;i < mass.length; i++) {
			mass2[i] = mass[i] / (double)max;
			
		}
		System.out.println();
		
		// Выводим на экран все элементы нового массива
		for(double element: mass2) { 
			System.out.print(element + " ");
		}
		
	}
}
