class Solution {
    public int[] runningSum(int[] nums) {
        int curr_sum = 0;
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            curr_sum += nums[i];
            ans[i] = curr_sum; 
        }
        return ans;
    }
}