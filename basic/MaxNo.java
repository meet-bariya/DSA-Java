import java.util.Scanner;

public class MaxNo {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the num1:- ");
        int num1 = inp.nextInt();
    
        System.out.print("Enter the num2:- ");
        int num2 = inp.nextInt();

        if(num1>num2){
            System.out.println(num1 + " is Max");
        }else{
            System.out.println(num2 + " is Max");
        }
    }
}
