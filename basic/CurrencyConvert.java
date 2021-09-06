import java.util.Scanner;

public class CurrencyConvert {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        float inr,usd;

        System.out.print("Enter the Currency in INR:- ");
        inr = inp.nextInt();
        usd = inr/70;
        
        System.out.print(inr + " [INR] :- " + usd + " [USD]");
    }
}
