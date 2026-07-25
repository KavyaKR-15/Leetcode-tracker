// Last updated: 7/25/2026, 4:14:15 PM
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder ans=new StringBuilder();
        while(columnNumber!=0){
            columnNumber--;
            ans.append((char)(((columnNumber)%26)+'A'));
            columnNumber=columnNumber/26;
        }
        return ans.reverse().toString();
    }
}