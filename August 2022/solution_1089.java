class Solution {
    public void duplicateZeros(int[] arr) {
        Queue<Integer>queue = new LinkedList<>();
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                queue.add(0);
                queue.add(0);
            }
            else{
                queue.add(arr[i]);
            }
            Integer f = queue.poll();
            arr[i]= f;
        }
    }
}