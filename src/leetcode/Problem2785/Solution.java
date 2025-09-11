package leetcode.Problem2785;
import java.util.*;
class Solution {
    public String sortVowels(String s) {
        List<Character> vowels = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                vowels.add(c);
            }
        }
        Collections.sort(vowels);
        StringBuilder sb = new StringBuilder();
        int vIndex = 0;
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                sb.append(vowels.get(vIndex++));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
