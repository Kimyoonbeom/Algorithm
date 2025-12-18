class Solution {
    public int solution(int storey) {
        int answer = 0;

        while (storey > 0) {
            int digit = storey % 10;       
            int next = (storey / 10) % 10; 

            if (digit > 5) {
                // 6~9는 올리는 것이 더 이득
                answer += 10 - digit;
                storey = storey / 10 + 1;  
            } else if (digit < 5) {
                // 0~4는 내리는 것이 더 이득
                answer += digit;
                storey /= 10;
            } else { 
                if (next >= 5) {
                    answer += 10 - digit;  
                    storey = storey / 10 + 1;
                } else {
                    answer += digit;       
                    storey /= 10;
                }
            }
        }

        return answer;
    }
}
