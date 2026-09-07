// Last updated: 9/7/2026, 4:22:38 PM
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