package yuliatestprograms;

public class Calculation {

    public static Integer fibonacci(Integer input){
        if (input < 2) return input;
        return fibonacci(input-1) + fibonacci(input-2);
    }

    public static void iterative (int userInput) {
        int firstNum = 0;
        int secondNum = 1;
        int i = 1;
        while (i < userInput) {
            int fibonacci = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = fibonacci;
            System.out.println(firstNum + " ");
            i++;
        }
    }
}
