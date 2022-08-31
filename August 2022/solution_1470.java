class Solution {
    public int[] shuffle(int[] nums, int n) {
        int []a = new int [2*n];
        
        for(int i=0,j=0; i<n; i++,j+=2){
            a[j] = nums[i];
            a[j+1] = nums[n + i];
        }
        return a;
    }
}