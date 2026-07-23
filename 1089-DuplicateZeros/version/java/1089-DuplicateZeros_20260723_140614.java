// Last updated: 7/23/2026, 2:06:14 PM
1class Solution {
2    public void duplicateZeros(int[] arr) {
3       int n=arr.length;
4       int res[]=new int[n];
5       int j=0;
6       for(int i=0;i<n;i++){
7        if(arr[j]==0){
8            if(i!=n-1){
9            res[i]=res[i+1]=0;
10            }
11            else{
12                res[i]=0;
13            }
14            i++;
15            j++;
16        }
17        else{
18            res[i]=arr[j];
19            j++;
20        }
21       }
22       for(int i=0;i<n;i++){
23        arr[i]=res[i];
24       }
25    }
26}