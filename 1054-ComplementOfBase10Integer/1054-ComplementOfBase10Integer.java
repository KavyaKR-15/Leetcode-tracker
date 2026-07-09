// Last updated: 7/9/2026, 9:10:15 AM
class Solution {
    public int bitwiseComplement(int n) {
        String d=Integer.toBinaryString(n);
        String s="";
        for(int i=0;i<d.length();i++){
            if(d.charAt(i)=='1'){
                s+='0';
            }
            else{
                s+='1';
            }
        }
        int r=Integer.parseInt(s,2);
        return r;
    }
}