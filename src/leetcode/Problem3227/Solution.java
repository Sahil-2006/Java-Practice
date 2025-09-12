package leetcode.Problem3227;
class Solution {
    public boolean doesAliceWin(String s) {
        int count=0;
        char[] s1 = s.toCharArray();
        for(int i=0;i<s1.length;i++){
            if(s1[i]=='A' || s1[i]=='E' || s1[i]=='I' || s1[i]=='O' || s1[i]=='U' || s1[i]=='a' || s1[i]=='e' || s1[i]=='i' || s1[i]=='o' || s1[i]=='u'){
                count++;
            }
        }
        if(count==0){
            return false;
        }
        if(count%2==0){
            return true;
        }
        return true;
    }
}
