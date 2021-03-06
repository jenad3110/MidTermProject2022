package MathProblems;


public class PrimeNumber {

    public static void main(String[] args) {
        /*
        Write a method to print the list of prime numbers from 2 to 1,000,000
            Solving the problem should be your first priority, however bonus points if you can figure out how to
            improve algorithmic efficiency
         Print out the prime numbers in the given range.
         */
        int start = 2;
        int end = 1000000;
        prime(start, end);


    }

    public static void prime(int start, int end) {
        for (int i = start; i <= end; i++) {
            int div_counter = 0;
            //checks divisiblity of each number, if its prime it should only be divisible twice by one and itself ie counter
            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {
                    div_counter++;
                }
            }
            if (div_counter == 2) {
                System.out.print(i + ",");
            }

        }
    }

}