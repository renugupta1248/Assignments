package Loops;

public class Program17_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
for (int row=1;row<=5;row++) {
			
			for (int sp=1; sp<=5-row;sp++) {
				
				System.out.print(" ");
			}	
				for (int star=1; star<=row;star++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
for (int i=1; i<=4; i++) {
	for(int sp=1; sp<=i;sp++) {
		
		System.out.print(" ");
	}
		for(int star=1; star<=5-i;star++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}

}