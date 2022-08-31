class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> tf = new ArrayList<>();
        
        int max = candies[0];
        for(int i=0; i<candies.length; i++ ){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        for(int i=0; i<candies.length; i++){
            if((candies[i]+extraCandies) >= max){
                tf.add(true);
            }
            else{
                tf.add(false);
            }
        }
        return tf;
    }
}
