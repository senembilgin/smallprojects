
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("x |  ");
		for(int i=1;i<=9;i++) {
			System.out.print(i+"     ");
		}
		System.out.println();
		System.out.print("==+");
		for(int j=0;j<=26;j++) {
			System.out.print("==");
		}
		System.out.println();
		for(int z=1;z<=12;z++) {
			if(z>=10) {
				System.out.print(z+"|");
				for(int k=1;k<=9;k++) {
					if(z*k>=10) {
						System.out.print(" "+z*k+"   ");
						}
						else {
					System.out.print("  "+z*k+"   ");
				}
			}}
			else {
			System.out.print(z+" |");
			for(int k=1;k<=9;k++) {
				if(z*k>=10) {
					System.out.print(" "+z*k+"   ");
					}
					else {
				System.out.print("  "+z*k+"   ");
			}
			
		
		}
		
	} System.out.println();   }

}}
