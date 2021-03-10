class Solution {
    public int maxSubArray(int[] nums) {
        int maxToCurr = nums[0]; //一開始在0的位置
        int sum = nums[0]; //一開始在0的位置
        for (int i = 1; i < nums.length ; i++){
            maxToCurr = Math.max(maxToCurr + nums[i], nums[i]);
            sum = Math.max(maxToCurr, sum);
        }
        return sum;
    }
}
