class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=2*nums.length;
        int []a = new int[n];
        
        for(int i=0;i<n;i++){
            a[i]=nums[i%nums.length];
        }
        return a;
    }
}