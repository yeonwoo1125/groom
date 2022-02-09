import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		
		for(int i=input; i>0; i--){
			for(int j=i; j>=1; j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
