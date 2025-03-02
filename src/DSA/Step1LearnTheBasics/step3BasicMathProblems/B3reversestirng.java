package DSA.Step1LearnTheBasics.step3BasicMathProblems;
import java.util.Scanner;

class B3reversestirng {
	public static void main(String[] args) {
		
		Scanner Sc=new Scanner(System.in);
		
		String word;
		System.out.print("Enter word = ");
		word=Sc.nextLine();
		
		for(int i=word.length()-1;i>=0;i--) {
			System.out.print(word.charAt(i));
		}
	}

}
