class Solution {
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        int i;
        runningSum[0] = nums[0];
        for(i=1;i<nums.length;i++){
            runningSum[i] = nums[i];
            runningSum[i] +=runningSum[i-1];
        }
        return runningSum;
    }
}