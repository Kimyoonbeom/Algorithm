import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> rankMap = new HashMap<>();
    
        for (int i = 0; i < players.length; i++) {
            rankMap.put(players[i], i);
        }
        
        for (String name : callings) {
            int curIndex = rankMap.get(name);   
            int frontIndex = curIndex - 1;     
            
            String frontPlayer = players[frontIndex];
            
            players[frontIndex] = name;
            players[curIndex] = frontPlayer;
            
            rankMap.put(name, frontIndex);
            rankMap.put(frontPlayer, curIndex);
        }
        
        return players;
    }
}
