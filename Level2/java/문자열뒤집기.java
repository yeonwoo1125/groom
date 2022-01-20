import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		String str="";
		for(int i=input.length()-1; i>=0; i--)
			str+=input.charAt(i);
		System.out.println(str);
	}
	
}
