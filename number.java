import java.util.Scanner;
public class Number
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int number=1+(int)(100*Math.random());
		int k=5;
		int i,guess;
		System.out.prinltn("Number Guessing between 1 to 100:");
		for(i=0;i<k;i++)
		{
			System.out.println("Guess the number:");
			guess=sc.nextInt();
			if(number==guess)
			{
				System.out.println("Correct...You guessed correct number");
				break;
			}
			else if(number>guess&&i!=k-1)
			{
				System.out.println("The number is"+"greater than"+guess);
			}
			else if(number<guess&&i!=k-1)
			{
				System.out.println("The number is"+"less than"+guess);
			}
		}
		if(i==k)
		{
			System.out.println("you have exhausted 5 trials");
			System.out.println("the number was"+number);
		}
	}
}