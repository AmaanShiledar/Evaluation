import java.util.*;

public class DisplayChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the digits: ");
		int c1 = scn.nextInt();
		int c2 = scn.nextInt();
		int c3 = scn.nextInt();
		int c4 = scn.nextInt();

		System.out.println(c1+"-"+(char)c1);
		System.out.println(c2+"-"+(char)c2);
		System.out.println(c3+"-"+(char)c3);
		System.out.println(c4+"-"+(char)c4);

	}

}