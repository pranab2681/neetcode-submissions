

public class Solution {
    public boolean isAnagram(String s, String t) {
        boolean result = false;
        Map<Character, Integer> sFreqMap = new HashMap<>();
        Map<Character, Integer> tFreqMap = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++){
            char value = s.charAt(i);
            sFreqMap.put(value, sFreqMap.getOrDefault(value, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++){
            char value = t.charAt(i);
            tFreqMap.put(value, tFreqMap.getOrDefault(value, 0) + 1);
        }
        Set<Map.Entry<Character, Integer>> entries = sFreqMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            Character ch = entry.getKey();

            if (tFreqMap.containsKey(ch)) {
                int sMapCount = entry.getValue();
                int tMapCount = tFreqMap.get(ch);
                if (sMapCount == tMapCount) {
                    result = true;
                    continue;
                }
            } else {
                return false;
            }

        }
        return result;

        // for (int i = 0; i < s.length(); i++) {
        //     char value = s.charAt(i);

        //     int fcount = sFreqMap.getOrDefault(value, 0);
        //     int tcount = tFreqMap.getOrDefault(value, 0);

        //     if (fcount == tcount) {
        //         return true;
        //     }
        // }
        // return false;
    }
}
