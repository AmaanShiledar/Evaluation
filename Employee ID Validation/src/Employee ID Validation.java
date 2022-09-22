import java.util.*;

public class EmpIdVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter your ID: ");
		String id = scn.nextLine();
		Boolean check = true;
		if(id.charAt(0)!= 'G') {
			check = false;
		}else if(id.charAt(1) != 'B') {
			check = false;
		}else if(id.charAt(2) != 'L') {
			check = false;
		}
		if(check)
			System.out.println("Login Success");
		else
			System.out.println("Incorrect ID");

	}

}