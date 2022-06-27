package week1.day2;

public class EmployeeDetails {
	public static void main(String[] args) {
		EmployeeDetails obj = new EmployeeDetails();
		obj.printEmployeeName("Hari", 23);
		obj.getEmployeeAddress("Chennai");
		obj.printEmployeeSalary(40000);
		String x = obj.printEmployeeMobileNumber(8807553856L);
		System.out.println(x);
		int c = obj.multiply(2, 3);
		System.out.println(c);
		
		
	}
	
	public void printEmployeeName(String empName, int empID) {
		System.out.println(empName);
		System.out.println(empID);
		}
	private void getEmployeeAddress(String empAddress) {
		System.out.println(empAddress);
		}
	private double printEmployeeSalary(double empSalary) {
		System.out.println(empSalary);
		return empSalary;
		}
	private String printEmployeeMobileNumber(long mobNum) {
		System.out.println(mobNum);
		return "+91"+ String.valueOf(mobNum);
		}
	private int multiply(int a, int b)
	{
		int c= a*b;
		return c;
	}

}
