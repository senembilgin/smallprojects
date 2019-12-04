import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class LocatingTheLargestValueInArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>numbers=new ArrayList<Integer>();
		Random rand=new Random();
		
		for(int i=0;i<=9;i++) {
			numbers.add(rand.nextInt(100)+1);
		}
		System.out.println("ArrayList:"+numbers);
		System.out.println("The largest value is "+Collections.max(numbers)+", which is in slot "+numbers.indexOf(Collections.max(numbers)));
	}

}
