import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		char c=sc.next().charAt(0);
		int b=sc.nextInt();
		
		
		switch(c){
			case '+': System.out.println(a+b); break;
			case '-': System.out.println(a-b); break;
			case '*': System.out.println(a*b); break;
			case '/': System.out.printf("%.2f",(double)a/b); break;
		}
		
	}
}
