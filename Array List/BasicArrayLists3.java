import java.util.Random;
import java.util.ArrayList;
public class BasicArrayLists3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>random=new ArrayList<Integer>();
		Random rand=new Random();
		
		for(int i=0;i<=1000;i++) {
			random.add(rand.nextInt(99)+10);
		}
		System.out.println("ArrayList:"+random);
	}

}
