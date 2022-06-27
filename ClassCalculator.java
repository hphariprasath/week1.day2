package week1.day2;

public class ClassCalculator {
	public static void main(String[] args) {
		ClassCalculator obj = new ClassCalculator();
		int sum = obj.addTwoNumbers(5, 6);
		System.out.println(sum);
		obj.printCareName();
	}
	public int addTwoNumbers(int a,int b) {
		return a+b;
	}
	public int subTwoNumbers(int a,int b) {
		return a-b;
	}
	public float mulTwoNumbers(float a,float b) {
		return a*b;
	}
	public float divTwoNumbers(float a,float b) {
		return a*b;
	}
}
