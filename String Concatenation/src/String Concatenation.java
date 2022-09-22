import java.util.*;

public class StrConcat {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		System.out.print("Inmate's name: ");
		String name = scn.nextLine();
		System.out.print("Inmate's father's name: ");
		String fname = scn.nextLine();
		if(name.matches("[0-9\\!@#$&*]*")&& fname.matches("[0-9\\\\!@#$&*]*")) {
				System.out.print("Invalid Name");
		}
		else
			System.out.print(name+" "+fname);

	}

}