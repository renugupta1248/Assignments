package day2;

public class Program3_SwapUsingXor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=6;    //binary value of 6 is 110
		int num2=2;    //binary value of 2 is 010
		
		num1=num1^num2;  //Xor of 110 and 010 is 100 which is 4
		num2=num1^num2;  //Xor of 100 and 010 is 110 which is 6
		num1=num1^num2;  //Xor of 100 and 110 is 010 which is 2
		
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);

	}

}
