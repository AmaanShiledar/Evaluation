import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int y = scn.nextInt();
		if(x>y) {
			System.out.println("Provide Valid Input");	
		}else if (x<=0 && y<=0) {
			System.out.println("Provide Valid Input");	
		}else if ((y-x)<=0) {
			System.out.println("Provide Valid Input");	
		}else {
			int i=x;
			int j;
			while(i<=y) {
				Boolean isPrime = true;
			    if (i > 1) {
			      for (j = 2; j < i; j++) {
			        if (i % j == 0) {
			          isPrime = false;
			        }
			      }
			      if (isPrime) {
			        System.out.print(i+" ");
			      }
				++i;
			    }	
			}
		}
	}
}