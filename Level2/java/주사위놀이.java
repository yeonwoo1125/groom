import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=6; i++){
			for(int j=1;j<=6; j++){
				if(i+j == input) System.out.println(i+" "+j);
			}
		}
	}
}
