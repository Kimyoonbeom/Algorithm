import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        int count = 0;
        for (int num : arr) {
            if (num % divisor == 0) {
                count++;
            }
        }
        
        if (count == 0) {
            return new int[] {-1};
        }
        
        
        int[] result = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num % divisor == 0) {
                result[index++] = num;
            }
        }
        
        // 오름차순 정렬
        Arrays.sort(result);
        
        return result;
    }
}