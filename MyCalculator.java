package week1.Day2Assignments;

public class MyCalculator {

	public static void main(String[] args) {
		
		// Declare new object myCalcObj
		Calculator myCalcObj = new Calculator();
		
		// Call add method to perform addition of 3 numbers
		int addNum1 = 101, addNum2 = 202, addNum3 = 303;
		int addResult = myCalcObj.add(addNum1, addNum2, addNum3);
		System.out.println("Result of addition of 3 numbers : " + addResult);
		
		// Call sub method to perform addition of 2 numbers
		int subNum1 = 1275, subNum2 = 536;
		int subResult = myCalcObj.sub(subNum1, subNum2);
		System.out.println("Result of subtraction of the 2 numbers : " + subResult);
		
		// Call mul method to perform multiplication of 2 double numbers
		double mulNum1 = 356.1275, mulNum2 = 2.14398054671;
		double mulResult = myCalcObj.mul(mulNum1, mulNum2);
		System.out.println("Result of multiplication of the 2 numbers : " + mulResult);
		
		// Call divide method to perform division of 2 float numbers
		float divNum1 = (float) 893.56868, divNum2 = (float) 675.2345678;
		double divResult = myCalcObj.divide(divNum1, divNum2);
		System.out.println("Result of division of the 2 numbers : " + divResult);
	}

}
