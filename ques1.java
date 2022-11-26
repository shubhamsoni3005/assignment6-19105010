import java.util.*;

public class ques1 {
    public static void multiply(int a, int b){
        if(a==0||b==0)
            throw new ArithmeticException("Multiplication by zero is not allowed");
        else {
            System.out.println(a*b);
        }
    }

    public static void divide(int a, int b){
        if(a==0||b==0)
            throw new ArithmeticException("Division by zero is not allowed");
        else {
            System.out.println(a/b);
        }
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        try {
            divide(a,b);
        } catch(ArithmeticException e) {
            System.out.println(e);
        }

        try{
            multiply(a,b);
        } catch(ArithmeticException e) {
            System.out.println(e);
        }
    }
}