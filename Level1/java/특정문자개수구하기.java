import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String ch = br.readLine();
		int cnt=0;
		for(int i=0; i<input.length(); i++)
			if(input.charAt(i) == ch.charAt(0)) cnt++;
		System.out.println(cnt);
	}
}
