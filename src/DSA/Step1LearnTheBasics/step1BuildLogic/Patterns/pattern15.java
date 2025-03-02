package DSA.Step1LearnTheBasics.step1BuildLogic.Patterns;
import java.util.Scanner;
class Pattern15 {
	public static void main(String args[]) {
		Scanner Sc=new Scanner(System.in);
		
		int num;
		System.out.print("Enter Rows = ");
		num=Sc.nextInt();
		
		for(int i=0;i<num;i++) 
		{
			for(int j=0;j<num;j++) 
			{
				if(j==0 || j==num-1 || i==0 || i==num-1) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}

}
