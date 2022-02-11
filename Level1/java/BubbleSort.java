import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		int arr[]=new int[cnt];
		
		for(int i=0; i<cnt; i++)
			arr[i]=sc.nextInt();
		
		for(int i=0; i<cnt-1; i++){
			for(int j=i; j<cnt; j++){
				if(arr[i]>arr[j]){
					int tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		for(int i=0; i<cnt; i++)
			System.out.print(arr[i]+" ");
		
	}
}
