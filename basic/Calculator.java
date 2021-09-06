import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the num1:- ");
        float num1 = inp.nextFloat();
    
        System.out.print("Enter the num2:- ");
        float num2 = inp.nextFloat();

        System.out.print("Enter the Operator:- ");
        char op = inp.next().charAt(0);

        if(op == '+'){
            System.out.println("Addition : " + (num1+num2));
        }else if(op == '-'){
            System.out.println("Substraction : " + (num1-num2));
        }else if(op == '*'){
            System.out.println("Multiplication : " + (num1*num2));
        }else if(op == '/'){
            System.out.println("Division : " + (num1/num2));
        }
        else if(op == '%'){
            System.out.println("Modulo : " + (num1%num2));
        }else{
            System.out.println("Invalid Operator!");
        }
    } 
}
