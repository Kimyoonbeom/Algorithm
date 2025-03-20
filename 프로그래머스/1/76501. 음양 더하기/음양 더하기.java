class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) {
                answer += absolutes[i]; // 양수일 경우 더하기
            } else {
                answer -= absolutes[i]; // 음수일 경우 빼기
            }
        }
        
        return answer;
    }
}