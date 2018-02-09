package by.htp.lesson3;

public class Lesson03TaskW02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 212345678;
		int sum = 0;
		while (n > 0) {
			int a = n % 10;
			if (a % 2 == 0) { 
				sum = sum + a;
			}
			n = n / 10;
		}
		System.out.println(sum);
	}

}
