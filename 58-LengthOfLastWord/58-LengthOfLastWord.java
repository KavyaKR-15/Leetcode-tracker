// Last updated: 7/9/2026, 9:11:17 AM
class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        s=s.trim();
        char ch[]=s.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            if(ch[i]==' '){
                break;
            }
            count++;
        }
        return count;
    }
}