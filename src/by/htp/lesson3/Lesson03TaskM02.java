package by.htp.lesson3;

// Импорт генератора-рандома 
import java.util.concurrent.ThreadLocalRandom;

public class Lesson03TaskM02 {

	public static void main(String[] args) {
		// Дан массив A вещественного типа, содержащий 20 положительных и отрицательных элементов. 
		// Сформировать массив B из положительных элементов массива A, имеющих четный индекс. 
		// Найти сумму квадратов элементов нового массива.

		double[] mass = new double[20];
		double summ = 0;
		
		for(int i = 0; i < mass.length; i++) {
			// Не стал пользоваться этим рандомом ... потому как не так просто сгенерировать 
			// отрицательные значения для вещественного типа	
		//	mass[i] = Math.round((Math.random() * 30) - 15);
			mass[i] = ThreadLocalRandom.current().nextDouble(-10, 10);
		}
		
		for (double element: mass) {
			System.out.println(element);
		}
		System.out.println();
		
		int a = 0; 
		// Подсчитываем количество положительных элементов с четным индексом
		for (int i = 0;i < mass.length; i= i+2) {
			if(mass[i] > 0) {
				a++;
			}
		}
		
		// Объявляем массив B, длиной в количество четных с положительным индексом из массива А
		double[] mass2 = new double[a];
		System.out.println("Number of positive elements = " + a);
		
		// Наполняем новый массив
		int b = 0;
		for (int i = 0;i < mass.length;i = i+2) {
			if(mass[i] > 0) {
				mass2[b] = mass[i];
				b++;
			}
		}
		
		// Печать всех элементов созданного массива
		for (double element: mass2) {
			System.out.print(element + " ");
		}
		
		System.out.println();
		double temp;
		// Суммируем возведенные в квадрат элементы нового массива
		for(int i = 0; i < mass2.length; i++) { 
			temp = mass2[i]*mass2[i];
			summ = summ + temp;
		}
		
		// Выводим на экран сумму квадратов
		System.out.println("\nSumm of squared elements is equal to = " + summ);
		
	}
}
