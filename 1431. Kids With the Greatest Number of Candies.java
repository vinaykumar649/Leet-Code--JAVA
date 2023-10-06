class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        boolean t ;
        for(int i = 1; i < candies.length; i++){
            if (candies[i] > max){
                max = candies[i];
            }
        }
        List<Boolean> ans =new ArrayList<Boolean>();
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies >= max){
                t = true;
                ans.add(t);
            }
            else{
                t = false;
                ans.add(t);
            }
        }
        return ans;
    }
}