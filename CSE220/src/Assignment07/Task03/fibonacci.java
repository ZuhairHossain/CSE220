package Assignment07.Task03;

public class fibonacci {
    static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
