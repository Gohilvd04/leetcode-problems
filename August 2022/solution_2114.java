class Solution {
    public int mostWordsFound(String[] sentences) {
       int count = 0 ;
        
        for(int i = 0; i<sentences.length; i++){
            
            String []sr = sentences[i].split(" ");
            if(sr.length>count)
                count = sr.length;
        }
        return count;
    }
}