import java.util.Scanner;

public class assignmentOne {
    public static int fibSequence(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;

        }
        return fibSequence(n - 1) + fibSequence(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("The 10th term of the Fibonacci sequence is: " + fibSequence(10));

    }
}