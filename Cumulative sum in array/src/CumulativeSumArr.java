import java.util.*;

public class CumulativeSumArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the no elements: ");
		int size = scn.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements: ");
		for(int i=0;i<size;i++)
			arr[i] = scn.nextInt();
		int total = 0;
		for(int i=0;i<size;i++) {
			total += arr[i];
			System.out.print(total+" ");
		}
	}

}