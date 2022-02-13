import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int cnt[]=new int[4];
		
		for(int i=0; i<input.length(); i++){
			char ch = input.charAt(i);
			switch(ch){
				case '1' : cnt[0]++; break;
				case 'I' : cnt[1]++; break;
				case 'l' : cnt[2]++; break;
				case '|' : cnt[3]++; break;
			}
		}
		for(int i=0; i<4; i++)
			System.out.println(cnt[i]);
	}
}
