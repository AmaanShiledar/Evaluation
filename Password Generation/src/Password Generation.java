import java.util.*;

public class PasswordGen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Generate your security code: ");
		String code = scn.nextLine();
		if(code.matches("[A-Za-z0-9#@*]+")) {
			System.out.println("match");
		}else {
			System.out.println("no match");
		}
	}

}