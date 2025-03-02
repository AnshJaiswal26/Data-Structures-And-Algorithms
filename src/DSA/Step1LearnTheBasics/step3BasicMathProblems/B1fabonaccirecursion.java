package DSA.Step1LearnTheBasics.step3BasicMathProblems;
import java.util.Scanner;

class FabonacciByRecursion 
{
	static int a=0,b=1,fab;
	public static void main(String args[]) 
	{
		Scanner Sc=new Scanner(System.in);
		
		int num;
		System.out.print("Enter num to print fabonacci = ");
		num=Sc.nextInt();
		
		System.out.print(a+" "+b);
		FabonacciByRecursion f=new FabonacciByRecursion();
		f.CalcuFab(num);
		
	}
	
	void CalcuFab(int n) 
	{
		if(n>=1) 
		{
		 fab=a+b;
		 System.out.print(" "+fab);
		 a=b;
		 b=fab;
		 CalcuFab(n-1);
	    }
    }
}
