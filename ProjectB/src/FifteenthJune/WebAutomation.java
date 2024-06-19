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

public class WebAutomation extends Automation {
	
	public WebAutomation() {
		
	this(11);
		
	System.out.println("Child default constructor" );

}

public  WebAutomation (int a) {
	this(12,13);
	
	System.out.println("Child one parameterized constructor" );
}


public  WebAutomation (int a, int b) {
	super(13);
		
	System.out.println("Child two parameterized constructor" );
}


public WebAutomation (int a, int b, int c) {
	this();
	
	System.out.println("Child three parameterized constructor" );
}


public static void main(String[] args) {
	
	WebAutomation ob = new WebAutomation(11,12,13);
	


	}

}