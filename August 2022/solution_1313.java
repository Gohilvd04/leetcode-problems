class Solution {
    public int[] decompressRLElist(int[] nums) {
        
        int n = nums.length;
        
        int a=0,c=0;
        
        for(int i=0; i<n; i+=2){
            c+= nums[i];
        } 
            
        
        int [] ans = new int[c];
        
        for(int i=0; i<n; i+=2){
            for(int j=0; j<nums[i]; j++){     
                ans[a++] = nums[i+1];
            }        
        }
   
        return ans;
    }
}