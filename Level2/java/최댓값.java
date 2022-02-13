import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		int arr[]=new int[cnt];
		
		for(int i=0; i<cnt; i++)
			arr[i]=sc.nextInt();
		
		int max = arr[0];
		int loc=1;
		for(int i=1; i<cnt; i++)
			if(max<arr[i]){
				max=arr[i];
				loc=i+1;
			}
		System.out.println(max+" "+loc);
		
	}
}
