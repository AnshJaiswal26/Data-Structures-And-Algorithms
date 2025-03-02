package DSA.Step1LearnTheBasics.step3BasicMathProblems;
import java.util.Scanner;
class A2reverseanum {
    public static void main(String [] args) {
    	
    	Scanner Sc=new Scanner(System.in);
    	
    	int num;
    	System.out.print("Enter num = ");
    	num=Sc.nextInt();
    	
    	int rem;
    	while(num>0) {
    		rem=num%10;
    		System.out.print(rem);
    		num=num/10;
    	}
    }
}
