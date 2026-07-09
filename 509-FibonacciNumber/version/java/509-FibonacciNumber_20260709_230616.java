// Last updated: 7/9/2026, 11:06:16 PM
1class Solution {
2    public char nextGreatestLetter(char[] letters, char target) {
3        int low=0, high=letters.length -1;
4        int mid;
5        int pos=-1;
6        while(low<=high)
7        {
8            mid = (low+high)/2;
9            if(letters[mid]>target)
10            {
11                pos=mid;
12                high = mid-1;
13            }
14            else
15            {
16                low=mid+1;
17            }
18        }
19      return pos == -1 ? letters[0] : letters[pos];
20    }
21}