import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        System.out.println("Enter your name:- ");
        Scanner in = new Scanner(System.in);

        String name = in.next();

        System.out.println("Hello, " + name + "Hope you are having good time!");
    }
}
