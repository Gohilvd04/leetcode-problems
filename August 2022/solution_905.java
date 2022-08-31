class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++ ){
            if(nums[i]%2==0){
                even.add(nums[i]);
            }
            else{
                odd.add(nums[i]);
            }
        }
        for(int i=0; i<nums.length; i++){
            int k = 0;
            int j = even.size();
            while(k<j){
                nums[i++]=even.get(k++);
            }
            k = 0;
            j = odd.size();
            while(k<j){
                nums[i++]=odd.get(k++);
            }
        }
        
        return nums;
    }
}