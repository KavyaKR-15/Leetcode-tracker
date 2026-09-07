// Last updated: 9/7/2026, 4:22:18 PM
class Solution {
    public int minimumCost(int[] cost) {
        int len=cost.length;
        int res=0;
        Arrays.sort(cost);
        for(int i=len-1;i>=0;i-=3){
           res+=cost[i];
           if(i-1>=0){
            res+=cost[i-1];
           }
        }
        return res;
    }
}