package by.htp.lesson3;

public class Lesson03TaskM05 {

	public static void main(String[] args) {
		// В двумерном массиве целых чисел определить, сколько раз в нем встречается элемент со значением X.
		int[][] mass = new int[3][3];
		int x = 3;
		int numm = 0;
		
		// Заполняем массив
		for(int i = 0; i < mass.length; i++) {
			for(int j = 0; j < mass[i].length; j++) {
				mass[i][j] = (int)(Math.random()*11);
			}
		}

		// Выводим на экран массив
		for(int i = 0;  i < mass.length; i++) {
			for(int j = 0; j < mass[i].length; j++) {
				System.out.print(mass[i][j] + " ");
			}
			System.out.println();
		}
		
		// Проверка сколько раз в массиве встречается X
		for(int i = 0; i < mass.length; i++) {
			for(int j = 0; j < mass[i].length; j++) {
				if (mass[i][j] == x) {
					numm++;
				}
			}
		}
		// Вывод количества Х на экран
		System.out.println("\nNumm is equal to = " + numm);
		

	}

}
