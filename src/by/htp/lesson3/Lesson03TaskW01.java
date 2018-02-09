package by.htp.lesson3;

public class Lesson03TaskW01 {

	public static void main(String[] args) {
//		Создайте программу, вычисляющую факториал натурального числа n. 
//		Для вычисления факториала используйте цикл while 
//		(Факториал натурального числа n определяется как произведение всех натуральных чисел от 1 до n включительно). 
		
		int i = 1;
		long fact = 1;
		int n = 6;
		
		while (i <= n) { 
			fact = fact*i;
			i++;
		}
		
		System.out.println(fact);
	}

}
