import java.util.*;

public class BillGen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the no of pizzas bought: ");
		int pizza = scn.nextInt();
		System.out.println("Enter the no of puffs bought: ");
		int puff = scn.nextInt();
		System.out.println("Enter the no of cool drinks bought: ");
		int cd = scn.nextInt();
		int total = (pizza*100)+(puff*20)+(cd*10);
		System.out.println("Bill Details");
		System.out.println("No of pizzas : "+pizza);
		System.out.println("No of puffs : "+puff);
		System.out.println("No of cooldrinks : "+cd);
		System.out.println("Total Prize: "+total);
		System.out.println("ENJOY THE SHOW!!!");

		scn.close();


	}

}