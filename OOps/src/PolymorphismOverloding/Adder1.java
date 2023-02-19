package PolymorphismOverloding;

public class Adder1 {
	static int add(int a,int b) {return a+b;}
	static int add(int a,int b,int c) {return a+b+c;}
	}
	class Demo{
		public static void main(String[] args) {
			Adder1 ad=new Adder1();
			System.out.println(ad.add(23, 33));
			System.out.println(ad.add(11, 11, 11));
		}
	}

	
