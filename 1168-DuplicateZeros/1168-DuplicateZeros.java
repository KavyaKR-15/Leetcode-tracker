// Last updated: 7/25/2026, 4:13:22 PM
class Solution {
    public void duplicateZeros(int[] arr) {
       int n=arr.length;
       int res[]=new int[n];
       int j=0;
       for(int i=0;i<n;i++){
        if(arr[j]==0){
            if(i!=n-1){
            res[i]=res[i+1]=0;
            }
            else{
                res[i]=0;
            }
            i++;
            j++;
        }
        else{
            res[i]=arr[j];
            j++;
        }
       }
       for(int i=0;i<n;i++){
        arr[i]=res[i];
       }
    }
}