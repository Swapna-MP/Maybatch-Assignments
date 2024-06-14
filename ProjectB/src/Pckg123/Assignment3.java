package Pckg123;

import java.util.Scanner;
import  Arthematic.Maths2;


public class Assignment3 {
	public static void main(String[] args) {
		System.out.println("Print value of x1");
		@SuppressWarnings("resource")
		Scanner obj = new Scanner (System.in);
		int x1=obj.nextInt();
		System.out.println("Print value of x2");
		int x2=obj.nextInt();
		System.out.println("Print value of x3");
		int x3=obj.nextInt();
		System.out.println("Print value of x4");
		int x4=obj.nextInt();
		System.out.println("Print value of x5");
		int x5=obj.nextInt();
		System.out.println("Print value of x6");
		int x6=obj.nextInt();
		
		//solve the below expression (((((x1*x2)+x3)-x4)-x5)/x6)
		
		Maths2 Arthematic = new Maths2 ();
		
		int mulresult = Arthematic.mul(x1, x2);
		int sumresult = Arthematic.sum(mulresult,x3);
		int subresult = Arthematic.sub(sumresult, x4);
		int sub2result = Arthematic.sub2(subresult,x5);
		Arthematic.div(sub2result,x6);
		
				
	}

}
