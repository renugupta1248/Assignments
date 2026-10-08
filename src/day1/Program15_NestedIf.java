package day1;

public class Program15_NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char gender='F';
		int age=18;
		if(age==18)
		{
			System.out.println("Congrats on your first vote");
			if(gender=='F')
				System.out.println("Do vote girl");
			else
				System.out.println("Do vote boy");
		}
		if(age>=18)
			System.out.println("you can vote");
		else
		{
			System.out.println("you can not vote");
		}	

	}

}
