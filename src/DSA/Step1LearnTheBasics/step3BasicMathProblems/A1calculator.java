package DSA.Step1LearnTheBasics.step3BasicMathProblems;
import java.util.Scanner;
class Calculator{
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);

        int num1,num2,result;
        System.out.print("Enter num 1 = ");
        num1=Sc.nextInt();

        System.out.print("Enter num 2 = ");
        num2=Sc.nextInt();

        String sym;
        System.out.print("Enter case = ");
        sym=Sc.next();

        switch(sym)

        {
            case "+" : result=num1+num2;
                       System.out.print("Addition is = "+result);
                       break;
             
            case "-": result=num1-num2;
                      System.out.print("Substraction is = "+result);
                      break;
                     
            case "*": result = num1*num2;
                      System.out.print("multiplication is = "+result);
                      break;
                     
            case "/": result = num1/num2;
                      System.out.print("Division is = "+result);
                      break;
                     
            default: System.out.print("Invalid Input!!");
                      break;   
        }

		
    }

}
