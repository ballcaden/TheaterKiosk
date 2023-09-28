import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age;

        System.out.println("Please enter your age: ");
        age = scan.nextInt();

        if (age >= 21) {
            System.out.println("You get a paper wristband");
        } else {
            System.exit(0);
        }
    }
}