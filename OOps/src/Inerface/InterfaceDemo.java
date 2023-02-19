package Inerface;
interface Demo{
	void show();
	void display();
}

public class InterfaceDemo implements Demo{

	@Override
	public void show() {
		System.out.println("Show First");
	}

	@Override
	public void display() {
		System.out.println("Show second");	
	}

public static void main(String[] args) {
	InterfaceDemo in=new InterfaceDemo ();
 in.show();
 in.display();
}
}

