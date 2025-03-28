class Solution {
    public int solution(int[] numbers) {
        int total_answer = 45;
        int answer = 0;
        
        for (int number: numbers){
            answer += number;
        }
        return total_answer - answer;
    }
}