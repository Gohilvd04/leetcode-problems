class Solution {
    public int addDigits(int num) {
        int last,s=0;
        while(num>0){
            last = num%10;
            num=num/10;
            s+=last;
        }
        if (s<10){
            return s;
        }        
        return addDigits(s);
        
    }
}