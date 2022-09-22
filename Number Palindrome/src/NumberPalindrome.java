import java.util.*;

public class NumberPalindrome {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		if(x<0)
			System.out.println("Invalid Input");
		else {
			int rem,rev=0,y=x;
			while(x>0){    
				   rem=x%10;   
				   rev=(rev*10)+rem;    
				   x=x/10;    
				  } 
			if(y==rev) 
				System.out.println("Palindrome");
			else
				System.out.println("Not a Palindrome");

		}
	}

}