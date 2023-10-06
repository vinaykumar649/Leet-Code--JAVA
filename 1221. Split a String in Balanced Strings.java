class Solution {
    public int balancedStringSplit(String s) {
        int ans = 0;
        int r = 0;
        int l = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R'){
                r+=1;
            }
            else{
                l+=1;
            }
            if(r==l){
                ans+=1;
                l = 0;
                r = 0;
            }
        }
        return ans;
    }
}