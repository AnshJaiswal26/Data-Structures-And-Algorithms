package DSA.Step1LearnTheBasics.step3BasicMathProblems;
import java.util.Scanner;
class A7factorial {
    public static void main(String [] args) {
	
	Scanner sc=new Scanner(System.in);
	
	int num,fact=1;
	System.out.print("Enter num = ");
	num=sc.nextInt();
	
	for(int i=1;i<=num;i++) {
		fact=i*fact;
	}
	
	System.out.print("Factorial of "+num+" is = "+fact);
}
}
