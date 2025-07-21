public class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for (int num = 1; num <= number; num++) {
            int divisorCount = getDivisorCount(num); // 약수의 개수 구하기

            if (divisorCount > limit) {
                answer += power;
            } else {
                answer += divisorCount;
            }
        }

        return answer;
    }

    // 약수의 개수를 구하는 함수 (1부터 sqrt(num)까지 확인)
    private int getDivisorCount(int num) {
        int count = 0;
        int sqrt = (int)Math.sqrt(num);

        for (int i = 1; i <= sqrt; i++) {
            if (num % i == 0) {
                if (i * i == num) {
                    count += 1; // 약수가 중복되는 경우(제곱수)
                } else {
                    count += 2; // 서로 다른 두 약수
                }
            }
        }
        return count;
    }
}
