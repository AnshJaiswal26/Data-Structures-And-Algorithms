package DSA.Step1LearnTheBasics.step3BasicMathProblems;
import java.util.Scanner;

public class A6armstrongnum {
	public static void main(String [] args){
	    Scanner Sc=new Scanner(System.in);
	    int x,n=0,s=0,r;
	    System.out.print("Enter num = ");

	    x=Sc.nextInt();
	    n=x;

	    while(n>=1){
	    r=n%10;
	    s=(r*r*r)+s;
	    n=n/10; }
	    if(s==x){
	        System.out.print(x+" is armstrong no.");
	    }
	    else{
	        System.out.print(x+"is not armstrong no.");
	    }
	 }
}
