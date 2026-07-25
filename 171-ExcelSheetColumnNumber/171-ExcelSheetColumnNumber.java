// Last updated: 7/25/2026, 4:14:13 PM
class Solution {
    public int titleToNumber(String columnTitle) {
        int res=0;
        for(int i=0;i<columnTitle.length();i++){
            res=res*26+columnTitle.charAt(i)-'A'+1;
        }
        return res;
    }
}