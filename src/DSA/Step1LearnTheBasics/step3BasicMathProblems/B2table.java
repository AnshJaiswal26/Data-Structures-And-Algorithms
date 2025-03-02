package DSA.Step1LearnTheBasics.step3BasicMathProblems;
import java.util.Scanner;
class Table{
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		
		int t,t1;
		System.out.print("Enter num = ");
		t=sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			t1=t*i;
			System.out.println(t1);
		}
	}
}