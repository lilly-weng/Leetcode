class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums[0];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                count = map.get(nums[i]) + 1;
                if (count > nums.length/2) {
                    return nums[i];
                } else {
                    map.put(nums[i], count); //更新count
                }
            } else {
                map.put(nums[i], 1);
            }
        }
        return n;
        
    }
}
