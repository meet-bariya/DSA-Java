import java.util.Scanner;

public class MinMax {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number :- ");
        float num1 = input.nextFloat();
    
        System.out.print("Enter second number :- ");
        float num2 = input.nextFloat();

        System.out.print("Enter third number :- ");
        float num3 = input.nextFloat();

        max(num1,num2,num3);
        min(num1,num2,num3);

    }

    public static void max(float num1,float num2,float num3){
        float max = num1;
        if(num2>max){
            max = num2;
        }
        if(num3>max){
            max = num3;
        }
        System.out.println(max + " is Maximum Number");
    }
    public static void min(float num1,float num2,float num3){
        float min = num1;
        if(num2<min){
            min = num2;
        }
        if(num3<min){
            min = num3;
        }
        System.out.println(min + " is Minimum Number");
    }
}
