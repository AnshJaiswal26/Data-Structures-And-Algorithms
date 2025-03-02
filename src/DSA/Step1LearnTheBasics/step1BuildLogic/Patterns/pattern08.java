package DSA.Step1LearnTheBasics.step1BuildLogic.Patterns;
import java.util.Scanner;
class Pattern8 {
	public static void main(String args[]) {
		
		Scanner Sc=new Scanner(System.in);
		
		int num;
		System.out.print("Enter Rows = ");
		num=Sc.nextInt();
		
		for(int i=0;i<num;i++) 
		{
			for(int j=0;j<num-i-1;j++) 
			{
				System.out.print("  ");
				
			}
			for(int j=0;j<(num*2-(num*2-i*2-1));j++)
			{
				System.out.print("* ");
				
			}
			System.out.println("");
		}
		
	}

}
