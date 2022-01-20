import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		
		int sum = 0;
		for(int i=1;i<=input; i++){
			if(input%i==0) sum+=i;
		}
		System.out.println(sum);
	}
}
