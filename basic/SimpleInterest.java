import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int p,t;
        float i,r;

        System.out.println("Enter the Prinicple:- ");
        p = inp.nextInt();
        System.out.println("Enter the Time:- ");
        t = inp.nextInt();
        System.out.println("Enter the Rate:- ");
        r = inp.nextFloat();

        i = (p*r*t)/100;
        System.out.println("Interest:- "+i);

    }
}
