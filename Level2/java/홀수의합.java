import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		int sum=0;
		for(int i=start; i<=end; i++){
			if(i%2!=0) sum+=i;
		}
		
		System.out.println(sum);
	}
}
