class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans  = new int[2];
        int i = 0;
        int j = numbers.length-1;
        while(i<=j){
            if(numbers[i]+numbers[j]<target){
                i +=1;
            }
            else if(numbers[i]+numbers[j]>target){
                j-=1;
            }
            else{
                ans[0] = i+1;
                ans[1] = j+1;
                return ans;
            }
        }
        return ans;
    }
}