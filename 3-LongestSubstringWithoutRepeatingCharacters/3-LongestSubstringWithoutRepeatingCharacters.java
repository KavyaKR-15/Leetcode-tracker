// Last updated: 7/9/2026, 9:11:35 AM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,right=0;
        int maxlength=0;
        HashSet<Character>set=new HashSet<>();
          while(right<s.length()){
                
                    while(set.contains(s.charAt(right))){

                    set.remove(s.charAt(left));

                    left++;
                    }
                    set.add(s.charAt(right));
                    maxlength=Math.max(maxlength,right-left+1);

                 right++;

        }  return maxlength;

    }
}