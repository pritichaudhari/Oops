package Encapsulation;

public class Demo1 {
private String email="Priya@gmail.com";
private String name="Puja";
private float amount=7800;
	
	public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public float getAmount() {
	return amount;
}

public void setAmount(float amount) {
	this.amount = amount;
}

	public static void main(String[] args) {
	Demo1 da=new Demo1();
System.out.println(da.amount+" "+da.email+" "+da.name );
	}

}
