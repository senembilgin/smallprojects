import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayListThereOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>numbers=new ArrayList<Integer>();
		Random rand=new Random();
		
		for(int i=0;i<=9;i++) {
			numbers.add(rand.nextInt(50)+1);
		}
		System.out.println("ArrayList:"+numbers);
		Scanner sc=new Scanner(System.in);
		System.out.print("Value to find:");
		int value=sc.nextInt();
		if(numbers.contains(value)) {
			System.out.println(value+" is in the ArrayList");
		}
		else {
			System.out.println(value+" is not in the ArrayList");
		}
	}

}
