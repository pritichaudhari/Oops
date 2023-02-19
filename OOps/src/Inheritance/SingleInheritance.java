package Inheritance;
class Employee{
	int Salary=56000;
}
class Manager extends   Employee{
	int benifites=96000;
}
public class SingleInheritance {

	public static void main(String[] args) {
		Manager ma=new Manager();
		System.out.println("Salary: "+ma.Salary);
		System.out.println("behifites: "+ma.benifites);
	}

}
