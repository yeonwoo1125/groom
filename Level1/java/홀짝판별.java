import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input =Integer.parseInt(br.readLine());
		
		if(input%2==0) System.out.println("even");
		else System.out.println("odd");
		
	}
}
