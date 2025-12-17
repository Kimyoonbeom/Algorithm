import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;

        // 오른쪽(동생 쪽)이 처음에 전체 케이크를 다 가지고 있다고 가정
        Map<Integer, Integer> right = new HashMap<>();
        for (int t : topping) {
            right.put(t, right.getOrDefault(t, 0) + 1);
        }

        // 왼쪽(철수 쪽)은 처음에 아무 토핑도 없음
        Map<Integer, Integer> left = new HashMap<>();

        // i를 자르는 기준의 왼쪽 끝 인덱스라고 보면
        // 자르는 위치는 i와 i+1 사이가 됨
        for (int i = 0; i < topping.length - 1; i++) {
            int t = topping[i];

            // t를 왼쪽 조각으로 이동
            left.put(t, left.getOrDefault(t, 0) + 1);

            // 오른쪽에서 t의 개수 감소
            right.put(t, right.get(t) - 1);
            if (right.get(t) == 0) {
                right.remove(t);
            }

            // 서로 다른 토핑 가짓수가 같으면 공평하게 나눈 경우
            if (left.size() == right.size()) {
                answer++;
            }
        }

        return answer;
    }
}
