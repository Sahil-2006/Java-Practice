/* Approach 1 is to actually create a loop for checking vlaues of the whole arrays -inefficient it takes O(n) */
package leetcode.Problem1791;

class Solution {
    public int findCenter(int[][] edges) {
        for(int i=1;i<edges.length;i++){
            for(int j=0;j<edges[0].length;j++){
                if(edges[i][j]==edges[i-1][j]){
                    return edges[i][j];
                }
            }
        }
        for(int i=0;i<edges.length;i++){
            for(int j=1;j<edges[0].length;j++){
                if(edges[i][j]==edges[i][j]){
                    return edges[i][j];
                }
            }
        }
        return 0;
    }
}