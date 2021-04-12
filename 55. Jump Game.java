class Solution {
    public boolean canJump(int[] nums) {
        if (nums.length < 2) return true; 
        
        int reach = 0; //紀錄最大能到達的index
        
        for (int i = 0; i < nums.length && i <= reach; i++) {
            //i也要小於最大能到達的index，這個不是遍歷全部，而只是看從自己到最大能到達的index
            reach = Math.max(nums[i]+i, reach); //nums[i] + i 第i個可以跳到的index
            if (reach >= nums.length - 1) return true;
        } 
        return false;      
    }
}
