import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String answer="";
		
		for(int i=0; i<input.length(); i++){
			answer+=input.charAt(i);
			System.out.println(answer);
		}
	}
}
