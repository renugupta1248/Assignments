package Loops;

public class Program21_Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		for(int i=1;i<=10;i++) {
			if(i==5) {
				continue; //continue is used to skip the iteration so in the output 5 is skipped.
			}
			System.out.print(i+" ");
		}
		System.out.print("\nBye");

	}

}
