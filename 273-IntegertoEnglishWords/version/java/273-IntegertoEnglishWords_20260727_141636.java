// Last updated: 7/27/2026, 2:16:36 PM
1class Solution {
2        String ones[]={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
3        String tens[]={"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
4    public String numberToWords(int num) {
5        String res="";
6        if(num==0) return "Zero";
7        return numbers(num).trim();
8    }
9    public String numbers(int num){
10        if(num==0)return"";
11        if(num<20){
12            return ones[num]+" ";
13        }
14        if(num<100){
15            return tens[num/10]+" "+numbers(num%10);
16        }
17        if(num<1000){
18            return numbers(num/100)+"Hundred "+numbers(num%100);
19        }
20        if(num<1000000){
21            return numbers(num/1000)+"Thousand "+numbers(num%1000);
22        }
23        if(num<1000000000){
24            return numbers(num/1000000)+"Million "+numbers(num%1000000);
25        }
26        return numbers(num/1000000000)+"Billion "+numbers(num%1000000000);
27    }
28}