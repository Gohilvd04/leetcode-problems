class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] a = new int [nums.length];
        for(int i=0; i<nums.length; i++){
            a[i] = countSmaller(nums,nums[i]);
        }
        return a;
    }
    
    public int countSmaller(int [] nums,int n){
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(n>nums[i]){
                count++;
            }
        }
        return count;
    }
}