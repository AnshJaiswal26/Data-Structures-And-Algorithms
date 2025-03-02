package DSA.Step1LearnTheBasics.step1BuildLogic.Patterns;
import java.util.Scanner;
class Pattern19 {
	public static void main(String args[]) {
		
		Scanner Sc = new Scanner(System.in);
		
		int num,c;
		System.out.print("Enter Rows = ");
		num=Sc.nextInt();
		c=num;
		for(int i=0;i<num;i++) {
			for(int j=0;j<num-(num-i-1);j++) {
				System.out.print((c-(num-i-1+j))+" ");
		
			}
			System.out.println("");
		}
	}

}
