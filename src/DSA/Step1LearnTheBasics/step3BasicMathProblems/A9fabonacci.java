package DSA.Step1LearnTheBasics.step3BasicMathProblems;
import java.util.Scanner;
class Fabonaacci{
    public static void main(String [] args){
        int x=0,b=1,z,a=0;
        Scanner Sc=new Scanner(System.in);
        z=Sc.nextInt();
        System.out.print(" "+x);
        System.out.print(" "+b);
        for(int i=1;i<=z;i++){ 
        a=x+b;
        System.out.print(" "+a);
        x=b;
        b=a;
 
        }
    }
}