import java.util.*;

public class ArrayComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the size for first aray: ");
		int size1 = scn.nextInt();
		int arr1[] = new int[size1];
		System.out.println("Enter the elements for first aray: ");
		for(int i=0;i<size1;i++)
			arr1[i] = scn.nextInt();

		
		System.out.println("Enter the size for second aray: ");
		int size2 = scn.nextInt();
		int arr2[] = new int[size2];
		System.out.println("Enter the elements for second aray: ");

		for(int i=0;i<size2;i++)
			arr2[i] = scn.nextInt();

		
		if(size1 != size2) {
			System.out.println("Array are Not Compatible ");
		}else {
			Boolean comp = true;
			for(int i=0;i<size1;i++) {
				if(arr1[i]<=arr2[i]) {
					System.out.println(arr1[i]+" "+arr2[i]);
					comp = false;
					break;
				}
			}
			if(comp) {
				System.out.println("Array are Compatible");
			}else {
				System.out.println("Array are Not Compatible ");

			}
		}
		scn.close();
	}

}
