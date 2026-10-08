package Loops;

public class Program11_ArmStrong2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1634;
		int originalNum=0;
		int armstrong=num;
		
		for(;num>0;) {
			int lastDigit=num%10;
			armstrong = armstrong+lastDigit*lastDigit*lastDigit*lastDigit;
			num=num/10;
		}
		System.out.println(armstrong);
		if (originalNum==armstrong)
			System.out.println("It is armStrong number");
		
		else
			System.out.println("Not an armStrong number");
	}

}
