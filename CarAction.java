package week1.day2;

public class CarAction {
	public static void main(String[] args) {
		CarAction obj = new CarAction();
		//obj.applyBreak();
		obj.applyGear();
		obj.switchOnAc();
		obj.applyAccelara();
		CarAction.applyBreak();
		
	}
	public static void applyBreak() {
		System.out.println("ApplyBreak");
	}
	public void applyGear() {
		System.out.println("ApplyGear");
	}
	public void switchOnAc() {
		System.out.println("Ac is ON");
	}
    public void applyAccelara() {
    	System.out.println("Accelarate");
	}
    
}
