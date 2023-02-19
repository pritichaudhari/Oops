package PolymorphismOverring;

public class Bank {
int getRateOfInterest() {return 0;}
}
class SBI extends Bank{
	int getRateOfInterest() {return 8;}
	}
class ICIC extends Bank{
	int getRateOfInterest() {return 7;}
	}
class AXIS extends Bank{
	int getRateOfInterest() {return 9;}
	}
class test{
	public static void main(String[] args) {
		SBI s=new SBI();
		ICIC ic=new ICIC();
		AXIS ax=new AXIS();
		System.out.println("SBI Rate of Interest:"+s.getRateOfInterest());

		System.out.println("SBI Rate of Interest:"+ic.getRateOfInterest());

		System.out.println("SBI Rate of Interest:"+ax.getRateOfInterest());
	}

}
