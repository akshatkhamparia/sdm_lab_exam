import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int result = 1;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter a number");
			int num = sc.nextInt();
			if (num <= 0)
				System.out.println("enter a valid number");
			else if (num == 1)
				System.out.println("factorial is: " + result);
			else {
				for (int i = num; i >= 1; i--)
					result = result * i;

				System.out.println("factorial is: " + result);
			}
		}

	}

}
