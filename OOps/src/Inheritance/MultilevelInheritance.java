package Inheritance;
class One{
	void show() {
		System.out.println("I am a parent class");
	}
}
class Two extends One{
	void display(){
		System.out.println("I am child first");
	}
}
class Three extends One{
	void  massge(){
		System.out.println("I am child second");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		Three th=new Three();
		th.massge();;
		th.show();
		
	}

}
