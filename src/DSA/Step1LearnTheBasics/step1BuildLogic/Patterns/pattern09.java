package DSA.Step1LearnTheBasics.step1BuildLogic.Patterns;
import java.util.Scanner;
class Pattern9 {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		
		int num;
		System.out.print("Enter num = ");
		num=Sc.nextInt();
		
		for(int i=0;i<num;i++) 
		{
			for(int j=0;j<num-(num-i);j++) 
			{
				System.out.print("  ");
			}
			
			for(int j=0;j<num*2-i*2-1;j++) 
			{
				System.out.print("* ");
			}
			
			
			System.out.println("");
		}
		
	}

}
