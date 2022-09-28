package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    private long [] fibonacciNumbers;
    public void printFibonacci(int lastFibonacci) {
        fibonacciNumbers = new long[lastFibonacci + 1];
        getfibonaccis(lastFibonacci);
        for (int i = 1; i <= lastFibonacci; i++) {
            System.out.println(fibonacciNumbers[i]);
        }
    }

    private long getfibonaccis(int n) {
        if (n == 1) {
            fibonacciNumbers[n] = 0;
        } else  if (n == 2) {
            fibonacciNumbers[n] = 1;
        } else if (fibonacciNumbers[n] == 0) {
            fibonacciNumbers[n] = getfibonaccis(n - 2) + getfibonaccis(n - 1);
        }
            return fibonacciNumbers[n];
    }
}
