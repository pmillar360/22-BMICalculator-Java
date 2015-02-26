/*
The metric formula accepts height measurements in meters and weight in kilograms. 
If you know your height in centimeters only, simply divide the number of centimeters by 100 convert it to meters.

For example, a person who is 183cms tall is 1.83m tall (183cm / 100 = 1.83m).

Using the metric formula is even easier than the imperial method as it's a two step process

Multiply your height by itself.
Divide your weight in kilograms by the value calculated in step 1.
The resulting number is your BMI.
*/
import java.util.*;

public class BMIcalc {
	private int height;
	private int weight;

	private int BMImetric() {
		Scanner s = new Scanner(System.in);
		System.out.println("What is your height in meters?");
		height = s.nextInt();
		System.out.println("What is your weight in kilograms");
		weight = s.nextInt();
		return (weight/(height*height));
		
	}

	private int BMIimperial() {
		Scanner s = new Scanner(System.in);
		System.out.println("What is your height in inches?");
		height = s.nextInt();
		System.out.println("What is your weight in pounds?");
		weight = s.nextInt();
		return ((weight*703)/(height*height));
	}

	public static void main (String[] args) {
		BMIcalc bc = new BMIcalc();
		Scanner sc = new Scanner(System.in);
		System.out.println("Metric or Imperial(US)?");
		String resp = sc.next();
		if(resp.toLowerCase().contains("metric")) {
			int bmi = bc.BMImetric();
			System.out.println("Your BMI is "+bmi);
		}
		else {
			int bmi = bc.BMIimperial();
			System.out.println("Your BMI is "+bmi);
		}
		if(bmi<=18.5) System.out.println("Accoriding to your BMI you are underweight");
		else if(bmi>18.5 && bmi <=24.9) System.out.println("According to your BMI you are a normal weight");
		else if(bmi>=25 && bmi<=29.9) System.out.println("Accorindg to your BMI you are overweight");
		else System.out.println("According to your BMI you are obese");

	}
}