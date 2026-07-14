// Last updated: 7/14/2026, 11:58:15 AM
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        int a=nums1.length;
4        int b=nums2.length;
5        int res[]=new int[a+b];
6        for(int i=0;i<a;i++){
7            res[i]=nums1[i];
8        }
9        for(int j=0;j<b;j++){
10            res[a+j]=nums2[j];
11        }
12        Arrays.sort(res);
13        double median=0.0;
14        int len=res.length;
15        if(len%2!=0){
16            median=res[len/2];
17        }
18        else{
19            median=(res[(len/2)-1]+res[len/2])/2.0;
20        }
21        return median;
22    }
23}