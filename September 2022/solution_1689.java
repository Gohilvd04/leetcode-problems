class Solution {
public:
    int minPartitions(string n) {
        int ans = 0;
        
        for(char c: n){
            if(c-'0'>ans){
                ans = c-'0';
            }
        }
        return ans;
    }
};