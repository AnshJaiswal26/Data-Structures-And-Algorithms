package DSA.Step1LearnTheBasics.step1BuildLogic.Patterns;
import java.util.Scanner;
class Pattern14 {
	public static void main(String args[]) {
		Scanner Sc =new Scanner (System.in);
		
		int num,num1;
		System.out.print("Enter rows = ");
		num1=Sc.nextInt();
		num=(num1+1)/2;
		for(int i=0;i<num;i++) 
		{
			for(int j=0;j<num-(num-i);j++) 
			{
				System.out.print(" ");
			}
			for(int j=0;j<num*2-i*2-1;j++) 
			{ 
				if(j==0 || j==num*2-i*2-2) 
				{
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
			
			
		}
		for(int i=1;i<num;i++) 
		{
			for(int j=0;j<num-i-1;j++) 
			{
				System.out.print(" ");
			}
			for(int j=0;j<num*2-(num*2-i*2-1);j++) 
			{
				if(j==0 || j==i*2) 
				{
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
	}

}
