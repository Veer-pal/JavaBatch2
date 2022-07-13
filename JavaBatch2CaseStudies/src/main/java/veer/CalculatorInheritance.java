import java.util.Scanner;

class ArithmeticOperation {

	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {
		return a / b;
	}

	public int mod(int a, int b) {
		return a % b;
	}

	public int percent(int a, int b) {
		return (a / b) * 100;
	}

}

public class Calculator extends ArithmeticOperation {

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first number: ");
		int a = scanner.nextInt();
		System.out.println("Enter second number: ");
		int b = scanner.nextInt();

		while (true) {
			System.out.println("Press 1 for Addition");
			System.out.println("Press 2 for Subtraction");
			System.out.println("Press 3 for Multiplication");
			System.out.println("Press 4 for Division");
			System.out.println("Press 5 for Modulus");
			System.out.println("Press 6 for Percentage");

			System.out.println("Enter choice: ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Addition: " + obj.add(a, b));
				break;

			case 2:
				System.out.println("Subtraction: " + obj.sub(a, b));
				break;
			case 3:
				System.out.println("Multiplication: " + obj.multiply(a, b));
				break;
			case 4:
				System.out.println("Division: " + obj.divide(a, b));
				break;
			case 5:
				System.out.println("Modulus: " + obj.mod(a, b));
				break;
			case 6:
				System.out.println("Percentage: " + obj.percent(a, b));
				break;
			default:
				System.out.println("You press invalid option...");
				break;

			}
			//scanner.close();
		}

	}

}
