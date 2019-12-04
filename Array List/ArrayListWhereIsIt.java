import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayListWhereIsIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		Random rand=new Random();
		
		for(int i=0;i<=9;i++) {
			numbers.add(rand.nextInt(50)+1);
		}
		System.out.println("ArrayList:"+numbers);
		Scanner sc=new Scanner(System.in);
		System.out.print("Value to find:");
		int num=sc.nextInt();
		if(numbers.contains(num)) {
			System.out.println(num+" is in slot "+ numbers.indexOf(num));
		}
		else {
			System.out.println(num+" is not in the ArrayList");
		}
	}

}
