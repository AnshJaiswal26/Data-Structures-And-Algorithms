package DSA.Step1LearnTheBasics.step1BuildLogic.Patterns;
import java.util.Scanner;
class Pttern4 {
       public static void main(String arg[]) {
       
       Scanner Sc=new Scanner(System.in);
       
       int num;
       System.out.print("Enter Rows = ");
       num=Sc.nextInt();
       
       for(int i=0;i<num;i++) 
       {
    	   for(int j=i+1;j<num;j++) 
    	   {
    		   System.out.print("  ");
    	   }
    	   
    	   for(int j=0;j<num-(num-i-1);j++) 
    	   {
    		   System.out.print(" *");
    	   }
    	   System.out.println("");
           }
       }
}
