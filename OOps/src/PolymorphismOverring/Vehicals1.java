package PolymorphismOverring;

public class Vehicals1 {
	void run() {
		 System.out.println("Vehicals is running");
	 }
	 
	 class Bike extends Vehicals1{
		 void run() {
		 System.out.println("Bike is running");
		 }
	 }
	public static void main(String[] args) {
		Vehicals1 ve=new Bike();
		System.out.println(ve.run());
		//Bike be=new Bike();
		//be.run();
	}

}
