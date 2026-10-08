package Loops;

public class Program7_SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=12345;
		int sum=0;
		for(;num>0;)
		{
			int lastDigit=num%10; //5
			sum=sum+lastDigit;
			num=num/10; //1234
		}
		System.out.println(sum);

	}

}
