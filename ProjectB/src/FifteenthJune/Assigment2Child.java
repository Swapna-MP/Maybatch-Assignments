//Parent three parameterized method
//Parent default method
//Parent one parameterized method
//Parent two parameterized method
//child default method
//child three parmaeterized method
//child two parameterized method
//child one parameterized method



package FifteenthJune;

public class Assigment2Child extends Assigment2Parent {
	
	public void a() {
		
		super.m();
		
		super.m1(12);
		
		super.m2(15, 12);
		
		System.out.println("Child default method" );
		
	}

	public void a1(int a) {
		this.a2(12,13);
		
		System.out.println("Child one parameterized method" );
		
	}

public void a2(int a, int b)	{
	
	this.a3(11, 15, 14);
	System.out.println("Child two parameterized method");
}

public void a3 (int a, int b, int c) {

	this.a();

	System.out.println("Child three parameterized method");
	
	
}

public static void main(String[] args) {
	
	Assigment2Child ob = new Assigment2Child();
	ob.a1(11);
	
}


	}
	




