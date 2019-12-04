import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class SortingAnArrayListOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> sent=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.print("Write some words:");
		for(int i=0;i<=9;i++) {
			sent.add(sc.next());
		}
		System.out.println("ArrayList before:"+ sent);
		Collections.sort(sent);
		System.out.println("ArrayList after:"+sent);
		
		
	}

}
