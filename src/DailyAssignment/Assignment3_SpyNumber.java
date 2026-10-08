package DailyAssignment;

public class Assignment3_SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=1124;
		int sum=0;
		int mul=1;
			
		
		for (int i=1;i<=4;i++) {
			int digit1=number%10;
			sum=sum+digit1;
			mul=mul*digit1;
			number=number/10;	
		}
		System.out.println("Total of All digits is: "+sum);
	
	    System.out.println("Multiplication of All digit is: "+mul);  
	    
	    if (sum==mul)
	    	System.out.println("1124 is a Spy number");
	    else
	    	System.out.println("1124 is not a Spy number");
		
	}
	
}