import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int len1=sc.nextInt();
		int len2=sc.nextInt();
		
		int arr1[]=new int[len1];
		int arr2[]=new int[len2];
		int arr3[]=new int[len1+len2];
		
		for(int i=0; i<len1; i++){
			arr1[i]=sc.nextInt();
		}
		for(int i=0; i<len2; i++){
			arr2[i]=sc.nextInt();
		}
		
		for(int i=0; i<arr3.length; i++){
			if(i<len1) arr3[i]=arr1[i];
			else arr3[i]=arr2[i-len1];
		}
		
		Arrays.sort(arr3);
		for(int i=0; i<arr3.length; i++){
			System.out.print(arr3[i]+" ");
		}
		
	}
}
