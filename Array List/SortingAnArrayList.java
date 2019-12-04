import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class SortingAnArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		Random rand=new Random();
		
		for(int i=0;i<=9;i++) {
			numbers.add(rand.nextInt(99)+10);
		}
		System.out.println("ArrayList Before:"+numbers);
		Collections.sort(numbers);
		System.out.println("ArrayList After:"+numbers);
	}

}
