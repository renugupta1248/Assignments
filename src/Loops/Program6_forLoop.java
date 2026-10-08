package Loops;

public class Program6_forLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=30;
		for (int i=1; i<=30; i++) {
			if ((num%i)==0)
System.out.print(i+ (","));
		}
		
		System.out.println();
		
		int fact=30;
		for (int j=1; j<=num; j++)
		{
			if (num==j)
				System.out.print(j);
			else if (fact%j==0)
				System.out.print(j+",");
		}
	}

}
