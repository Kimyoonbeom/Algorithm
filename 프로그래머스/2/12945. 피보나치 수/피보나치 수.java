public class Solution {
    public int solution(int n) {
        int MOD = 1234567;
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0;
        int b = 1;
        int fib = 0;

        for (int i = 2; i <= n; i++) {
            fib = (a + b) % MOD;
            a = b;
            b = fib;
        }
        return fib;
    }
}
