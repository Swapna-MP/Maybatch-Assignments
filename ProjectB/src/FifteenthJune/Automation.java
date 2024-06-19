//Assignment1---------------------->

//Output should be in the below sequence using this and super keyword

//Parent two parameterized constructor
//Parent default constructor
//Parent three parameterized constructor
//Parent one parameterized constructor
//Child two parameterized constructor  
//Child one parameterized constructor 
//Child default constructor  
//Child three parameterized constructor  



package FifteenthJune;

public class Automation {
	
	public Automation () {
		this(12,13);
		
		System.out.println("Parent default constructor" );
		
	}
	public Automation (int a) {
		
		this (10,15,16);
		
		System.out.println("Parent one parameterized constructor" );
}
	
	public  Automation (int a, int b) {
		
		System.out.println("Parent two parameterized constructor" );
}

	
	public Automation (int a, int b, int c) {
		
		this();
		
		System.out.println("Parent three parameterized constructor" );

	}
	

	
}