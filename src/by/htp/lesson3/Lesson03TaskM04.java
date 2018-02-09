package by.htp.lesson3;

public class Lesson03TaskM04 {

	public static void main(String[] args) {
		// Найти максимальный элемент для каждого столбца матриц размерностью NxN.
		int[][] mass = new int[4][5];
		int max = 0;
		for(int i = 0 ; i < mass.length; i++) {
			for(int j = 0; j < mass[i].length; j++) {
				mass[i][j] = (int)(Math.random()*101);
			}
		}
		// Печать массива
		for(int i = 0 ; i < mass.length; i++) {
			for(int j = 0; j < mass[i].length; j++) {
				System.out.print(mass[i][j] + " ");
			}
			System.out.println();
		}
		// Нахождение масимального элемента 
		
		for(int i = 0 ; i < mass.length; i++) {
			for(int j = 0; j < mass[i].length - 1; j++) {
				if(mass[i][j] < mass[i][j+1]) {
					max = mass[i][j+1];
				}
				
			}
			System.out.println("В строке номер " + i + " максимальный элемент равен " + max);
		}
	}

}
