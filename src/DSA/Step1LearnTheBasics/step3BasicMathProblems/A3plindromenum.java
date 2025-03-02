package DSA.Step1LearnTheBasics.step3BasicMathProblems;
import java.util.Scanner;
class PlindromeNum {
public static void main(String args[]) {
	
	Scanner Sc=new Scanner(System.in);
	
	int num,r,rev=0,t;
	System.out.print("Enter num = ");
	num=Sc.nextInt();
	 
	t=num;
	
	while(t>=1) {
		r=t%10;
		rev=rev*10+r;
		t=t/10;
	}
	if(rev==num) {
		System.out.print("Plindrome");
	}
	else {
		System.out.print("Not palindrome!!");
	}
}
}
