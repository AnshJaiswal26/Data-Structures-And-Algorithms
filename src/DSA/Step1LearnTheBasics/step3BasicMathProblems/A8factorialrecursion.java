package DSA.Step1LearnTheBasics.step3BasicMathProblems;
import java.util.Scanner;
class FactorialByRecursion{
   static int fact=1;
   public static void main(String args[]) {
	   Scanner Sc=new Scanner(System.in);
	   int num;
	   System.out.print("Enter num = ");
	   num=Sc.nextInt();
	   
	   FactorialByRecursion f=new FactorialByRecursion();
	   f.CalcuFactorial(num);
	   System.out.print("Facotial of "+num+" is "+fact);
	   
   }
   
   void CalcuFactorial(int n) {
	   if(n>=1) 
	   {
		   fact=fact*n;
		   CalcuFactorial(n-1);		   
	   }
   }
}
