import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int cnt=sc.nextInt();
		int arr[]=new int[cnt];
		for(int i=0; i<cnt; i++)
			arr[i]=sc.nextInt();
		
		Arrays.sort(arr);
		System.out.println(arr[0]);
		
	}
}
