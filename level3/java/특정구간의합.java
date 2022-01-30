import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int len=sc.nextInt();
		int arr[]=new int[len];
		int start, end;
		
		for(int i=0; i<len; i++){
			arr[i]=sc.nextInt();
		}
		
		start=sc.nextInt();
		end=sc.nextInt();
		
		int sum=0;
		for(int i=start-1; i<end; i++){
			sum+=arr[i];
		}
		System.out.println(sum);
	}
}
