package yuliatestprograms;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int input = sc.nextInt();
        System.out.println(Calculation.fibonacci(input));
    }
}
