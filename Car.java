package week1.day2;



public class Car {
	public static void main(String[] args) {
		Car obj = new Car();
		obj.printCarName();
		String Color = obj.getCarColor();
		System.out.println(Color);
		boolean Punctured = obj.isCarPunctured();
		System.out.println(Punctured);
		
	}
public void printCarName() {
	System.out.println("Jazz");
}

private String getCarColor() {
	return "white";	
}
boolean isCarPunctured()	{
	return true;
}	
	

	
}
	
