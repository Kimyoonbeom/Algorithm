class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int paintEnd = 0;

        for (int s : section) {
            if (s > paintEnd) {
                answer++;
                paintEnd = s + m - 1;
            }
        }

        return answer;
    }
}
