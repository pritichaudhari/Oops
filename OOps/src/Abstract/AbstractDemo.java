package Abstract;

  abstract class Demo1 {
	int a;
	abstract void getweheel();
	void isButtonStart() {
		System.out.println("yes");
	}
	
	class Car extends Demo1{
		 void getweheel() {
			 System.out.println("4");
		 }
	}
	class Bike extends Demo1{
		 void getweheel() {
			 System.out.println("2");
		 }
	}

public  class AbstractDemo{ 
public static void main(String[] args) {
	//Demo1 dm=new Bike();
	//dm.getweheel();
	//Demo1 d=new  Car();
	d.getweheel();
			
}
}
}