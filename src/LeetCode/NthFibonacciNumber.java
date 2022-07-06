package LeetCode;

public class NthFibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fib(2));
    }

    public static int fib(int n) {
        if (n == 0 || n == 1)
            return n;
        else
            return fib(n - 1) + fib(n - 2);
    }
}
