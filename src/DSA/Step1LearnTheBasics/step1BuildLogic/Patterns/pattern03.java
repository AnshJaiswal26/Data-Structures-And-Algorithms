package DSA.Step1LearnTheBasics.step1BuildLogic.Patterns;
import java.util.Scanner;
 class Pattern3 {
       public static void main(String args[]) {
    	   Scanner Sc=new Scanner(System.in);
    	   
    	int num;
   		System.out.print("Enter Rows = ");
   		num=Sc.nextInt();
   		
   		for(int i=0;i<num;i++) 
   		{
   			for(int j=0;j<i+1;j++) 
   			{
   				System.out.print("* ");
   			}
   			System.out.println("");
   		}
   		for(int i=1;i<num;i++) 
   		{
   			for(int j=num-i;j>0;j--) 
   			{
   				System.out.print("* ");
   			}
   			System.out.println("");
   		}
     }
}
