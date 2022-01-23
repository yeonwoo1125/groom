import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int kor=sc.nextInt();
		int math = sc.nextInt();
		int eng = sc.nextInt();
		
		double avg = (kor+math+eng)/3.0;
		char grade;
		if(avg>=90) grade = 'A';
		else if(avg>=80) grade = 'B';
		else if(avg>=70) grade = 'C';
		else if(avg>=60) grade = 'D';
		else grade = 'F';
		
		System.out.printf("%.2f %c",avg,grade);
	}
}
