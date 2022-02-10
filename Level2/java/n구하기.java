import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		
		int sum=0;
		int i=0;
		while(sum<input){
			i++;
			sum+=i;
		}
		System.out.println(i);
	}
}
