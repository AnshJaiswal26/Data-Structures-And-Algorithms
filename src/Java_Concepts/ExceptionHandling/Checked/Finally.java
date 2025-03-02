package Java_Concepts.ExceptionHandling.Checked;

public class Finally {
    public static void main(String[] args){
        int a = 10;
        int b = 0;

        System.out.print(method(a,b));
    }
    static int method(int a,int b){

        try{
           return a/b;
        }catch(Exception e){
            return -1;
        }finally{
            System.out.println("bye");
        }
        // System.out.println("Bye");
        // in this type of cases we will use "finally" keyword to print something
        // before return
        // "finally" key word always runs
    }
}
