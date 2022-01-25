import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		
		long a=1;
		for(int i=1; i<=input; i++){
			a*=i;
		}
		System.out.println(a);
	}
}
