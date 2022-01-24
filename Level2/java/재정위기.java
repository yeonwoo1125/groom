import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int money[]=new int[3];
		
		for(int i=0; i<money.length; i++)
			money[i]=sc.nextInt();
		
		Arrays.sort(money);
		System.out.println(money[1]);
	}
}
