// Last updated: 9/12/2026, 4:01:58 PM
1class Solution {
2    public boolean canMeasureWater(int x, int y, int target) {
3        if(y >x){
4            y=y+x;
5            x=y-x;
6            y=y-x;
7        }
8        while(target <= (x+y) && x != 0 && y != 0 ){
9            if(x == y){
10                if(target % x == 0)
11                    return true;
12                return false;
13            }
14            if(target % x == 0 || target%y == 0 || target%(x-y) == 0 || target%(x+y) == 0 || target%x == x%y){
15                return true;
16            }
17            x=x%y;
18            y=y+x;
19            x=y-x;
20            y=y-x;
21        }
22        return false;
23    }
24}