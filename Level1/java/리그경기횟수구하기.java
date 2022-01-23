import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		
		int sum=0;
		for(int i=0; i<input; i++){
			sum+=i;
		}
		
		System.out.println(sum);
	}
}
