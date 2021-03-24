class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                nums[index] = nums[i];
                index += 1;
            }       
        }
        
        //nums = [0,1,0,3,12] nums.length = 5
        //nums = [1,3,12,3,12] index = 0,1,2 
        //但最後一次跑完是 index = 3，所以補0才是從index開始
        
        for (int i = index; i < nums.length; i++){
            nums[i] = 0;
        }   
    }
}
