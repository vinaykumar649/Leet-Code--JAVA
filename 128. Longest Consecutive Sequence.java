class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int maxi = 1;
        int curr = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i]==nums[i-1]+1){
                curr += 1;
            }
            else{
                curr = 1;
            }
            maxi = Math.max(maxi,curr);
        }
        return maxi;
    }
}