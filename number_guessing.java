import java.util.Random;
import java.util.*;
  
public class GuessingNo
{
    public static void main(String[] args)
    {
        int ans, guess;
	final int MAX = 100;
	Scanner sc = new Scanner(System.in);
  	Random r = new Random();
  	boolean correct = false;
	ans = r.nextInt(MAX) + 1;
  	while (!correct) 
	{
  	  System.out.println("Guess a number between 1 and 100: ");
	  guess = sc.nextInt();
            if (guess > ans)
		{
              System.out.println("Entered number Too large, try again");
            }
  		else if (guess < ans)
		{
              System.out.println("Entered number Too small, try again");
            }

            else 
		{
              System.out.println("Yes, number is correct.");
  		  correct = true;
            }
        }
        System.exit(0);
    }
}