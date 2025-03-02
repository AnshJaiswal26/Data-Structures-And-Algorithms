package DSA.Step1LearnTheBasics.step3BasicMathProblems;
import java.util.Scanner;
class A4checkprime {
      public static void main(String [] args) {
    	  Scanner Sc=new Scanner(System.in);
    	  
    	  int num,c=0;
    	  System.out.print("Enter num = ");
    	  num=Sc.nextInt();
    	  
    	  if(num==0 || num==1) {
    		  c=0;
    	  }
    	 for(int i=2;i<=num/2;i++) {
    		 if(num%i==0) {
    			 c++;
    			 break;
    		 }
    	 }
    	 
    	 if(c==0) {
    		 System.out.print("Num is prime");
    	 }
    	 
    	 else {
    		 System.out.print("Num is non prime");
    	 }
      }
}
