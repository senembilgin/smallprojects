import java.util.ArrayList;
import java.util.Random;

public class CopyingArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>num=new ArrayList<Integer>();
		Random rand=new Random();
		
		for(int i=0;i<=10;i++) {
			num.add(rand.nextInt(100)+1);
		}
		num.remove(9);
		num.set(9, -7);
		System.out.println("ArrayList1:"+num);
		num.remove(9);
		num.add(rand.nextInt(100)+1);
		System.out.println("ArrayList2:"+num);
	
		
		
			
		}
		
	}


