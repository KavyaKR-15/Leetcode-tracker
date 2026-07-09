// Last updated: 7/9/2026, 9:11:26 AM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[strs.length-1];
        String res="";
        for(int i=0;i<first.length()&&i<last.length();i++){
            if(first.charAt(i)==last.charAt(i)){
                res+=first.charAt(i);
            }
            else{
                 break;
            }
        }
        return res;
    }
}