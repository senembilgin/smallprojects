import java.util.ArrayList;
import java.util.Random;
public class BasicArrayLists2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>rando=new ArrayList<Integer>();
		Random rand=new Random();
		
		for(int i=0;i<=9;i++) {
			rando.add(rand.nextInt(100)+1);
		}
		System.out.println("ArrayList:"+rando);
	}}


