package by.htp.lesson3;

public class Lesson03TaskM06 {

	public static void main(String[] args) {
		// В двумерном массиве натуральных случайных чисел от 0 до 199 
		// найти количество всех двузначных чисел, у которых сумма цифр кратна 2.
		
		int[][] mass = new int [100][100];
		int numm = 0;
		
		// Заполняем массив случайныи числами
		for(int i = 0; i < mass.length; i++) {
			for(int j = 0; j < mass[i].length; j++) {
				mass[i][j] = (int)(Math.random()*200);
			}
		}
		
		// Выводим массив в консоль 
		for(int i = 0;i < mass.length; i++) {
			for(int j = 0; j < mass[i].length; j++) {
				System.out.print(mass[i][j] + " ");
			}
			System.out.println();
		}
		// Находим количество всех двухзначных чисел у которых сумма цифр кратна 2
		System.out.println("Числа которые проходят по условию: ");
		for(int i = 0; i < mass.length; i++) {
			for(int j = 0; j < mass[i].length; j++) {
				if (mass[i][j] > 9 && mass[i][j] < 100) {
					if (((mass[i][j] / 10) + (mass[i][j] % 10)) % 2 ==0) {
						numm++;
						System.out.print(mass[i][j] + " ");
					}
				}
			}
		}
		System.out.println();
		System.out.println("Количество двузначных сумма которых кратна 2 = " + numm);
	}

}
