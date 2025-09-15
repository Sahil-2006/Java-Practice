package leetcode.Problem1935;
class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count = 0;
        HashSet<Character> hs = new HashSet<>();
        for(char c : brokenLetters.toCharArray()){
            hs.add(c);
        }
        String[] strArray = text.split(" ");
        for(String word : strArray){
            boolean canType=true;
            int i=0;
            while(i<word.length()){
                if(hs.contains(word.charAt(i))){
                    canType=false;
                    break;
                }
                i++;
            }
            if (canType){
                count++;
            }
        }
        return count;
    }
}
