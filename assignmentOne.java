public class assignmentOne {

    /**
     * This method utilizes recursion to calculate the nth number of the
     * standard Fibonacci sequence beginning at 0 by adding the two preceding numbers
     * and returns the correct int to be passed into main.
     * @param n must be a non-negative integer
     * @return nth number of the sequence ex. 0 n = 0 1 n = 1
     */
    public static int fibSequence(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;

        }
        return fibSequence(n - 1) + fibSequence(n - 2);
    }

    /**
     * The main outputs the finished calculation of the method fibSequence and
     * prints at the 10th number.
     */
    public static void main(String[] args) {
        System.out.println("The 10th term of the Fibonacci sequence is: " + fibSequence(10));

    }
}