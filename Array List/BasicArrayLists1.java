import java.util.ArrayList;
public class BasicArrayLists1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>numbers=new ArrayList<Integer>();
		numbers.add(-113);
		numbers.add(-113);
		numbers.add(-113);
		numbers.add(-113);
		numbers.add(-113);
		numbers.add(-113);
		numbers.add(-113);
		numbers.add(-113);
		numbers.add(-113);
		numbers.add(-113);
		
		for(int i=0;i<numbers.size();i++) {
			System.out.println("Slot "+i+" contains a "+numbers.get(i));
			
		}		
		
	}

}
