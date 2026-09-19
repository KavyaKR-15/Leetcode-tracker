// Last updated: 9/19/2026, 5:19:34 PM
class Solution {
    public int pivotInteger(int n) {
        int total=0;
        for(int i=1;i<=n;i++){
            total+=i;
        }
        int left=0;
        for(int i=1;i<=n;i++){
            int right=total-left-i;
            if(right==left){
                return i;
            }
            left+=i;
        }
        return -1;
    }
}