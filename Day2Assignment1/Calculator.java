package week1.Day2Assignment1;

public class Calculator {

	public int add(int num1, int num2, int num3) {
		int sum = num1 + num2 + num3;
		return sum;
	}

	public int sub(int num1, int num2) {
		int diff = num1 - num2;
		return diff;
	}

	public double mul(double num1, double num2) {
		double product = num1 * num2;
		return product;
	}

	public double divide(float num1, float num2) {
		double div = num1 / num2;
		return div;
	}

	public static void main(String[] args) {

		System.out.println("In Main method, in Calculator Class");

	}

}
