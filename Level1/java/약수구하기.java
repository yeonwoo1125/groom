import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=input; i++){
			if(input%i == 0) System.out.print(i+" ");
		}
	}
}
