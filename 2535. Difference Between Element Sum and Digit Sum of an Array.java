class Solution {
    public int differenceOfSum(int[] nums) {
        int ele = 0;
        int digi = 0;
        for(int i=0;i<nums.length;i++){
            ele += nums[i];
            while(nums[i]>0){
                int temp = nums[i]%10;
                nums[i] = nums[i]/10;
                digi += temp;
            }
        }
        return Math.abs(ele-digi);
    }
}