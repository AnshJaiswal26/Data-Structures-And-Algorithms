package DSA.Step1LearnTheBasics.step1BuildLogic.Patterns;
import java.util.Scanner;
class Pattern16 {
	public static void main(String args[]) {
		
		Scanner Sc=new Scanner(System.in);
		
		int num;
		System.out.print("Enter Rows = ");
		num=Sc.nextInt();
		
		for(int i=0;i<num;i++) 
		{
			for(int j=0;j<num-(num-i-1);j++) 
			{
				System.out.print(j+1+" ");
			}
			System.out.println("");
		}
		
	}

}
