package Loops;

public class Program10_ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153;
		int originalNum=num;
		int armstrong=0;
		for(;num>0;){
			
			int lastDigit=num%10;
			armstrong = armstrong+lastDigit*lastDigit*lastDigit;
			num=num/10;
			
		}
		System.out.println(armstrong);
		if (originalNum==armstrong)
			System.out.println("It is armStrong number");
		
		else
			System.out.println("Not an armStrong number");
 
	}

}
