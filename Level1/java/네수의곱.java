import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[4];
		
		for(int i=0; i<arr.length; i++)
			arr[i]=sc.nextInt();
		
		System.out.println(mul(mul(arr[0],arr[1]),mul(arr[2],arr[3])));
	}
	
	private static int mul(int a, int b){
		return a*b;
	}
}
