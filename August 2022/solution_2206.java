// first approach

// class Solution {
//     public boolean divideArray(int[] nums) {
//         Arrays.sort(nums);
//         for(int i=0;i<nums.length;i+=2){
//             if(nums[i]!=nums[i+1]){
//                 return false;
//             }
//         }
//         return true;
//     }
// }

// second approach

class Solution {
    public boolean divideArray(int[] nums) {
        
        int[] a = new int[501];
        
        for(int n : nums){
            a[n]++; 
        }
        
        for(int i = 1; i < a.length; i++) {
            if(a[i]%2 == 1) 
                return false;
        }
        
        return true;
    }
}

