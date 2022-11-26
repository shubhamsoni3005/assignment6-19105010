import java.util.*;
class Calculator {
    private int a;
    private int b;
    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void addition() {
        int ans = a + b;
        System.out.println("Addition is : " + ans);
    }

    public void subtraction() {
        int ans = a - b;
        System.out.println("Subtraction is : " + ans);
    }

    public void division() {
        double ans = (double) a / b;
        System.out.println("Division is : " +ans);
    }

    public void multiply() {
        int ans = a * b;
        System.out.println("Multiplication is : " + ans);
    }
}

public class ques3 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        try {
            System.out.print("enter the number: ");
            num1 = Integer.parseInt(sc.nextLine());
            System.out.print("enter the number: ");
            num2 = Integer.parseInt(sc.nextLine());
            Calculator obj1 = new Calculator(num1, num2);
            Calculator obj2 = new Calculator(num1, num2);
            Calculator obj3 = new Calculator(num1, num2);
            Calculator obj4 = new Calculator(num1, num2);
            obj1.addition();
            obj2.subtraction();
            obj3.multiply();
            obj4.division();
        }
        catch(NumberFormatException e) {
            System.out.println("Invalid Input" + e);
        }
    }
}