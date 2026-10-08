package Loops;

public class Program5_FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0;
		int b = 1;

		for (int i = 1; i <= 10; i++) {
		    System.out.print(a + " ");

		    int c = a + b;
		    a = b;
		    b = c;
		} 
		/*
		int counter=10;
		int num1=0;
		int num2=1;
		System.out.print(num1+" "+num2+" ");
		for (int i=1; i<=counter-2;i++) {
			int num3=num1+num2;
			System.out.print(num3+" ");
			num1=num2;
			num2=num3; 
			*/
		}
	}


