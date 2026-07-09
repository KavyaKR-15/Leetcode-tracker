// Last updated: 7/9/2026, 9:11:02 AM
class Solution {
    public String reverseWords(String s) {
        s=s.trim().replaceAll("\\s+"," ");
        String rev="";
        String r[]=s.split(" ");
        for(int i=r.length-1;i>=0;i--){
            rev+=r[i];
            if(i>0){
                rev+=" ";
            }
        }
        return rev;
    }
}