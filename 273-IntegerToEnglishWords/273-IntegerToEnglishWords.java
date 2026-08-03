// Last updated: 8/3/2026, 5:37:45 PM
class Solution {
        String ones[]={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        String tens[]={"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    public String numberToWords(int num) {
        String res="";
        if(num==0) return "Zero";
        return numbers(num).trim();
    }
    public String numbers(int num){
        if(num==0)return"";
        if(num<20){
            return ones[num]+" ";
        }
        if(num<100){
            return tens[num/10]+" "+numbers(num%10);
        }
        if(num<1000){
            return numbers(num/100)+"Hundred "+numbers(num%100);
        }
        if(num<1000000){
            return numbers(num/1000)+"Thousand "+numbers(num%1000);
        }
        if(num<1000000000){
            return numbers(num/1000000)+"Million "+numbers(num%1000000);
        }
        return numbers(num/1000000000)+"Billion "+numbers(num%1000000000);
    }
}