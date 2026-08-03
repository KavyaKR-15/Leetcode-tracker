// Last updated: 8/3/2026, 5:39:54 PM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a=nums1.length;
        int b=nums2.length;
        int res[]=new int[a+b];
        for(int i=0;i<a;i++){
            res[i]=nums1[i];
        }
        for(int j=0;j<b;j++){
            res[a+j]=nums2[j];
        }
        Arrays.sort(res);
        double median=0.0;
        int len=res.length;
        if(len%2!=0){
            median=res[len/2];
        }
        else{
            median=(res[(len/2)-1]+res[len/2])/2.0;
        }
        return median;
    }
}