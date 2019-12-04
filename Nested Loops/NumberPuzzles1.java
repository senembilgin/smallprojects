
public class NumberPuzzles1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int a=10;a<=60;a++) {
			for(int b=10;b<=60;b++) {
				if(a+b==60 && Math.abs(a-b)==14) {
					System.out.println(a +" and "+b);
				}
			}
		}
	}

}
