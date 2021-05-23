package method;
import java.util.Scanner;
class Logic
        {
    int z;
    int addition(int x,int y){
       
       z=x+y;
       return(z);
    }
    int sub(int x,int y){
        z=x-y;
        return(z);
    }
    int mul(int x,int y){
    z=x*y;
    return(z);
}
    int div(int x,int y){
    z=x/y;
    return(z);
    }
            
}
 public class Method{
    public static void main(String[] args) {
        System.out.print("Enter the number to add,sub,division and multiply");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print("Enter the number to add,sub,division and multiply");
        int a1=sc.nextInt();
        int b1=sc.nextInt();
        Logic ob=new Logic();
        System.out.println("Operation on First time inserted values");
        System.out.println("Addition is="+ob.addition(a,b));
        System.out.println("Subtraction is="+ob.sub(a,b));
        System.out.println("Multiplication is="+ob.mul(a,b));
        System.out.println("Division is="+ob.div(a,b));
        System.out.println("Operation on Second time inserted values");
        
        System.out.println("Addition is="+ob.addition(a1,b1));
        System.out.println("Subtraction is="+ob.sub(a1,b1));
        System.out.println("Multiplication is="+ob.mul(a1,b1));
        System.out.print("Division is="+ob.div(a1,b1));
        
        
    }
    
}
