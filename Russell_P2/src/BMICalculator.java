import java.util.Scanner;
public class BMICalculator {
	public static void main(String[] args) {
		double pounds, inches, kilograms, meters, BMI = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Choose a method of calculation: \n 1.pounds and inches \n 2.kilograms and meters");
		int method = input.nextInt();
		switch(method) {
			case 1:
				System.out.println("Enter weight in pounds:");
				pounds = input.nextDouble();
				System.out.println("Enter height in inches:");
				inches = input.nextDouble();
				BMI = (703 * pounds) / (inches * inches);
				break;
			case 2:
				System.out.println("Enter weight in kilograms:");
				kilograms = input.nextDouble();
				System.out.println("Enter height in meters:");
				meters = input.nextDouble();
				BMI = kilograms / (meters * meters);
				break;
			default: 
				System.out.println("invalid choice:(");
				break;
		}
		if (BMI <= 18.5) {
			System.out.println("BMI is: " + BMI);
			System.out.println("BMI is less than 18.5, you are underweight");
		}
		else if (BMI <= 24.9) {
			System.out.println("BMI is: " + BMI);
			System.out.println("BMI between 18.5 and 24.9, you are healthy");
		}
		else if (BMI <= 29.9) {
			System.out.println("BMI is: " + BMI);
			System.out.println("BMI between 25 and 29.9, you are overweight");
		}
		else {
			System.out.println("BMI is: " + BMI);
			System.out.println("BMI greater than or equal to 30.0, you are obese");
		}
		input.close();
	}
}
